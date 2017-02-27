package com.morphiles.delay.repay.api.service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * created by robevansuk 20/2/2017
 */
public interface DelayRepayBot {
    /**
     * @return
     * @throws IOException
     * @throws InvalidKeyException
     * @throws NoSuchAlgorithmException
     * @throws CloneNotSupportedException
     */
    public void checkTrainDelays();
}
