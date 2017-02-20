package com.morphiles.delay.repay.api.exchange;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * created by robevansuk 20/2/2017
 */
public interface DarwinService {
    /**
     * @return
     * @throws IOException
     * @throws InvalidKeyException
     * @throws NoSuchAlgorithmException
     * @throws CloneNotSupportedException
     */
    public String getBaseUrl();
    public <R> HttpEntity<String> securityHeaders(String endpoint, String method, String body);
    public <T> T get(String endpoint, ParameterizedTypeReference<T> type);
    public <T, R> T post(String endpoint, ParameterizedTypeReference<T> type, R jsonObject);
    public <T> T delete(String endpoint, ParameterizedTypeReference<T> type);
}
