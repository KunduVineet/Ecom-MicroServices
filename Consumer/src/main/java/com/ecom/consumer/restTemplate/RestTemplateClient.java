package com.ecom.consumer.restTemplate;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestTemplateClient {

    private final RestTemplate restTemplate;

    private static final String PROVIDER_URL = "http://localhost:8085";

    public RestTemplateClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getInstance(){
        return restTemplate.getForObject(PROVIDER_URL + "/instance-info", String.class);
    }
}
