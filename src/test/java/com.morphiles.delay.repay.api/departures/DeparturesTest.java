package com.morphiles.delay.repay.api.departures;

import com.morphiles.delay.repay.api.BaseTest;
import com.morphiles.delay.repay.api.service.DelayRepayBot;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

/**
 * Created by robevansuk on 03/02/2017.
 */
public class DeparturesTest extends BaseTest {

    static Logger log = LoggerFactory.getLogger(DeparturesTest.class);
    static final int partsOfHour = 4;

    @Autowired
    DelayRepayBot delayRepayBot;

    @Test
    public void checkTrainTimesForMyTrains() {

        long oneHour = 1000 * 60 * 60;
        long nextCheckTime = now() + 0;

        while(true) {
            try {
                int i = 0;
                while (now() < nextCheckTime) {
                    long minsRemaining = (nextCheckTime - now())/ (1000*60);

                    log.info(minsRemaining + " mins until next check");
                    Thread.sleep(oneHour / partsOfHour);
                    i++;
                }
                delayRepayBot.checkTrainDelays("RDT", "STP");
                delayRepayBot.checkTrainDelays("STP", "RDT");
                delayRepayBot.checkTrainDelays("SAC", "STP");
                delayRepayBot.checkTrainDelays("STP", "SAC");
                delayRepayBot.checkDelayedArrivals("RDT", "STP");
                delayRepayBot.checkDelayedArrivals("STP", "RDT");
                delayRepayBot.checkDelayedArrivals("SAC", "STP");
                delayRepayBot.checkDelayedArrivals("STP", "SAC");

                nextCheckTime = now() + oneHour;
            } catch (InterruptedException ex) {
                log.info("Delay Repay Bot Stopped");
                break;
            }
        }
        assertTrue(true);
    }

    public void canGetArrivalsBoard() {

    }

    public long now() {
        return System.currentTimeMillis();
    }
}