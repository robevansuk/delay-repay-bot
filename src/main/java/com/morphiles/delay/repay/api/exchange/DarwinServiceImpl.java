package com.morphiles.delay.repay.api.exchange;

import com.google.gson.Gson;
import com.thalesgroup.rtti._2013_11_28.token.types.AccessToken;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;

import static org.springframework.http.HttpMethod.GET;


/**
 * Created by robevansuk on 20/2/17.
 */
@Component
public class DarwinServiceImpl implements DarwinService {

    static Logger log = Logger.getLogger(DarwinServiceImpl.class.getName());

    AccessToken token;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    public DarwinServiceImpl(
                             @Value("${app.token}") String token) {
        this.token = new AccessToken();
        this.token.setTokenValue(token);
    }


}
