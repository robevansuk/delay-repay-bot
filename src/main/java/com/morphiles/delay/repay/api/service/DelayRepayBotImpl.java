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

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


/**
 * Created by robevansuk on 20/2/17.
 */
@Component
public class DelayRepayBotImpl implements DelayRepayBot {

    static Logger log = Logger.getLogger(DelayRepayBotImpl.class.getName());

    AccessToken token;

    @Autowired
    public DelayRepayBotImpl(@Value("${app.token}") String tok) {
        token = new AccessToken();
        token.setTokenValue(tok);
    }

    @Override
    public void checkTrainDelays() {

        Ldb ldb = new Ldb();

        LDBServiceSoap api = ldb.getLDBServiceSoap();

        GetBoardRequestParams reqParams = new GetBoardRequestParams();
        reqParams.setCrs("RDT");
        reqParams.setNumRows(50);
        reqParams.setTimeOffset(-120);

        StationBoardResponseType departures = api.getDepartureBoard(reqParams, token);

        findTrainWithMaxDelay(departures);

    }

    public ServiceItem findTrainWithMaxDelay(StationBoardResponseType departures) {
        long maxDelay = 0;
        ServiceItem maxDelayedTrain = null;
        List<ServiceItem> trainTimes = departures.getGetStationBoardResult().getTrainServices().getService();

        LocalTime time1 = null;
        LocalTime time2 = null;

        // find max delay or train delayed by 2 hours.
        for (int i=0; i < trainTimes.size()-1; i++) {
            ServiceItem item = departures.getGetStationBoardResult().getTrainServices().getService().get(i);
            if (!item.getEtd().equals("On time")){
                // train due - train actually arrived at. Delay identified
                log.info(trainTimes.get(i).getStd() + " " + trainTimes.get(i).getEtd());
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
                            }
                        } else {
                            time2 = LocalTime.of(getHour(trainTimes.get(i).getEtd()), getMinute(trainTimes.get(i).getEtd()));
                        }
                    }
                } else {
                    // train just delayed
                    time2 = LocalTime.of(getHour(trainTimes.get(i).getEtd()), getMinute(trainTimes.get(i).getEtd()));;
                }

                long diffInMinutes = java.time.Duration.between(time1, time2).toMinutes();

                log.info("Delay " + diffInMinutes + " mins");

                if (diffInMinutes > maxDelay) {
                    maxDelayedTrain = trainTimes.get(i+1);
                    maxDelay = diffInMinutes;
                    log.info("MaxDelay updated to: " + maxDelay);
                }
            }
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
