package com.ecom.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instance-info")
public class InstanceController {

    @Value("${server.port}")
    private String port;

    private final String instanceId = java.util.UUID.randomUUID().toString();

    @GetMapping
    public String getInstanceInfo() {
        System.out.println("Handling request on port: " + port);
        return "This is an instance of the provider service."+ port + " with Instance ID: " + instanceId;
    }
}
