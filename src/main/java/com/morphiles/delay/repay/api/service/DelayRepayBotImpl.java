package com.morphiles.delay.repay.api.service;

import com.thalesgroup.rtti._2013_11_28.token.types.AccessToken;
import com.thalesgroup.rtti._2016_02_16.ldb.GetBoardRequestParams;
import com.thalesgroup.rtti._2016_02_16.ldb.LDBServiceSoap;
import com.thalesgroup.rtti._2016_02_16.ldb.Ldb;
import com.thalesgroup.rtti._2016_02_16.ldb.StationBoardResponseType;
import com.thalesgroup.rtti._2016_02_16.ldb.types.ServiceItem;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;


/**
 * Created by robevansuk on 20/2/17.
 */
@Component
public class DelayRepayBotImpl implements DelayRepayBot {

    static Logger log = Logger.getLogger(DelayRepayBotImpl.class.getName());
    private static final Ldb ldb = new Ldb();
    private static LDBServiceSoap api;

    AccessToken token;

    @Autowired
    public DelayRepayBotImpl(@Value("${app.token}") String tok) {
        token = new AccessToken();
        token.setTokenValue(tok);
        this.api = ldb.getLDBServiceSoap();
    }

    @Override
    public void checkTrainDelays(String fromCode, String toCode) {

        int twoHoursBack = -120;
        GetBoardRequestParams reqParams = getGetBoardRequestParams(fromCode, toCode, twoHoursBack);

        StationBoardResponseType departures = api.getDepartureBoard(reqParams, token);

        findTrainWithMaxDelay(departures, fromCode, toCode, "Departure");

    }
    @Override
    public void checkDelayedArrivals(String fromCode, String toCode){
        int oneHourAhead = 60;
        GetBoardRequestParams reqParams = getGetBoardRequestParams(fromCode, toCode, oneHourAhead );

        StationBoardResponseType departures = api.getArrivalBoard(reqParams, token);
        findTrainWithMaxDelay(departures, fromCode, toCode, "Arrival");
    }

    private GetBoardRequestParams getGetBoardRequestParams(String fromStationCode, String toStationCode, int timeOffset) {
        GetBoardRequestParams reqParams = new GetBoardRequestParams();
        reqParams.setCrs(fromStationCode);
        reqParams.setFilterCrs(toStationCode);
        reqParams.setTimeOffset(timeOffset);
        reqParams.setNumRows(50);
        return reqParams;
    }

    public ServiceItem findTrainWithMaxDelay(StationBoardResponseType departures,
                                             String fromCode,
                                             String toCode,
                                             String arrDep) {

        List<ServiceItem> trainTimes = departures.getGetStationBoardResult().getTrainServices().getService();
        if (arrDep.equals("Arrival")) {
            return findMaxDelayOnArrival(trainTimes, fromCode, toCode);
        }
        return findMaxDelayOnDep(trainTimes, fromCode, toCode);


    }

    private ServiceItem findMaxDelayOnArrival(List<ServiceItem> trainTimes,
                                     String fromCode,
                                     String toCode) {
        long maxDelay = 0;
        ServiceItem maxDelayedTrain = null;
        String reason;
        LocalTime time1 = null;
        LocalTime time2 = null;

        // find max findMaxDelayOnDep or train delayed by 2 hours.
        for (int i=0; i < trainTimes.size()-1; i++) {

            ServiceItem item = trainTimes.get(i);

            if (!item.getEta().equals("On time")){
                reason = item.getEta();
                // train due - train actually arrived at. Delay identified
                log.info("Arrivals: " + item.getSta() + " " + item.getEta());
                time1 = LocalTime.of(getHour(item.getSta()), getMinute(item.getSta()));

                if (item.getEta().equals("Cancelled")) {
                    // compare against next trains.
                    i++;

                    // Find next non-cancelled train and get the arrival time of it in time2 param
                    while (i<trainTimes.size()-1) {
                        if (!trainTimes.get(i).getEta().equals("On time")) {
                            if (trainTimes.get(i).getEta().equals("Cancelled")) {
                                i++;
                            } else {
                                // get Time
                                time2 = LocalTime.of(getHour(trainTimes.get(i).getEta()), getMinute(trainTimes.get(i).getEta()));
                                break;
                            }
                        } else {
                            time2 = LocalTime.of(getHour(trainTimes.get(i).getSta()), getMinute(trainTimes.get(i).getSta()));
                            break;
                        }

                    }
                } else {
                    // train just delayed
                    if (!trainTimes.get(i).getEta().equals("Delayed")) {
                        time2 = LocalTime.of(getHour(trainTimes.get(i).getEta()), getMinute(trainTimes.get(i).getEta()));
                    }
                }

                long diffInMinutes = 0;

                if (time2!=null) {
                    diffInMinutes = java.time.Duration.between(time1, time2).toMinutes();
                }

                if (!reason.equals("Delayed") && !reason.equals("Cancelled")) {
                    reason = "";
                }

                log.info("Arrival " + fromCode + "->" + toCode + " " + time1 + " " + reason + (time2!=null ? (" actual: " + time2 + " - " + diffInMinutes + " mins delay") : " (delay not known)"));

                if (diffInMinutes > maxDelay) {
                    maxDelayedTrain = trainTimes.get(i+1);
                    maxDelay = diffInMinutes;
                    log.info("MaxDelay Arrival updated to: " + maxDelay);
                }
            }
        }
        if (maxDelayedTrain == null) {
            log.info(fromCode + "->" + toCode + " No delayed arrivals found.");
        }
        return maxDelayedTrain;
    }

    private ServiceItem findMaxDelayOnDep(List<ServiceItem> trainTimes,
                                          String fromCode,
                                          String toCode) {
        long maxDelay = 0;
        ServiceItem maxDelayedTrain = null;
        String reason;
        LocalTime time1 = null;
        LocalTime time2 = null;

        // find max findMaxDelayOnDep or train delayed by 2 hours.
        for (int i=0; i < trainTimes.size()-1; i++) {

            ServiceItem item = trainTimes.get(i);

            if (!item.getEtd().equals("On time")){
                reason = item.getEtd();
                // train due - train actually arrived at. Delay identified
                log.debug(trainTimes.get(i).getStd() + " " + trainTimes.get(i).getEtd());
                time1 = LocalTime.of(getHour(trainTimes.get(i).getStd()), getMinute(trainTimes.get(i).getStd()));

                if (item.getEtd().equals("Cancelled")) {
                    // compare against next trains.
                    i++;


                    // Find next non-cancelled train and get the arrival time of it in time2 param
                    while (i<trainTimes.size()-1) {
                        if (!trainTimes.get(i).getEtd().equals("On time")) {
                            if (trainTimes.get(i).getEtd().equals("Cancelled")) {
                                i++;
                            } else {
                                // get Time
                                time2 = LocalTime.of(getHour(trainTimes.get(i).getEtd()), getMinute(trainTimes.get(i).getEtd()));
                                break;
                            }
                        } else {
                            time2 = LocalTime.of(getHour(trainTimes.get(i).getStd()), getMinute(trainTimes.get(i).getStd()));
                            break;
                        }

                    }
                } else {
                    // train just delayed
                    time2 = LocalTime.of(getHour(trainTimes.get(i).getEtd()), getMinute(trainTimes.get(i).getEtd()));
                }

                long diffInMinutes = 0;

                if (time2!=null) {
                    diffInMinutes = java.time.Duration.between(time1, time2).toMinutes();
                }

                if (!reason.equals("Delayed") && !reason.equals("Cancelled")) {
                    reason = "";
                }

                log.info("Departure " + fromCode + "->" + toCode + " " + time1 + " " + reason + (time2 != null ? (" actual: " + time2 + " - " + diffInMinutes + " mins delay") : " (delay not known)"));

                if (diffInMinutes > maxDelay) {
                    maxDelayedTrain = trainTimes.get(i+1);
                    maxDelay = diffInMinutes;
                    log.info("MaxDelay Departure updated to: " + maxDelay);
                }
            }
        }
        if (maxDelayedTrain == null) {
            log.info(fromCode + "->" + toCode + " No delayed departures found");
        }
        return maxDelayedTrain;
    }

    private int getHour(String time) {
        return Integer.parseInt(time.split(":")[0]);
    }

    private int getMinute(String time) {
        return Integer.parseInt(time.split(":")[1]);
    }
}
