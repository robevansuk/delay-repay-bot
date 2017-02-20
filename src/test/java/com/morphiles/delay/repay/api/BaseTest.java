package com.morphiles.delay.repay.api;

import com.morphiles.delay.repay.api.exchange.DarwinService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by robevansuk on 20/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {
                 MainApplication.class
                },
                properties = {
                    "spring.profiles.active=test"
                }
)
public abstract class BaseTest {

    @Autowired
    public DarwinService darwin;
}
