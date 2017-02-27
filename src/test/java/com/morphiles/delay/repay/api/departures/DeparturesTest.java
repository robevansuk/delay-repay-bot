package com.morphiles.delay.repay.api.departures;

import com.morphiles.delay.repay.api.BaseTest;
import com.morphiles.delay.repay.api.service.DelayRepayBot;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertTrue;

/**
 * Created by robevansuk on 03/02/2017.
 */
public class DeparturesTest extends BaseTest {

    @Autowired
    DelayRepayBot delayRepayBot;

    @Test
    public void canGetDeparturesBoard() {

        delayRepayBot.checkTrainDelays();
        assertTrue(true);

    }

    @Test
    public void getDelayRepayForm() {
        delayRepayBot.delayRepayForm();
        assertTrue(true);
    }
}
