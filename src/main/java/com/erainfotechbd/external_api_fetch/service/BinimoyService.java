package com.erainfotechbd.external_api_fetch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BinimoyService {

    private final String PROJECT_A_API_URL = "http://localhost:8080/user/getUser";

    private final RestTemplate restTemplate;

    @Autowired
    public BinimoyService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void callProjectAApi() {

        if (restTemplate == null) {
            throw new IllegalStateException("RestTemplate has not been initialized");
        }
        ResponseEntity<String> response = restTemplate.getForEntity(PROJECT_A_API_URL, String.class);
        // Process response as needed
        System.out.println("Response from Project A: " + response.getBody());
    }
}