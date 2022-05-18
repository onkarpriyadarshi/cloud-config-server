package com.dev.poc.cloudconfigclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class CloudConfigClientApplication {

    @Value("${mapping.base.url}")
    private String mappingUrl;

    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }

    @GetMapping("/getUrl")
    public String getUrl(){
        return mappingUrl;
    }
}
