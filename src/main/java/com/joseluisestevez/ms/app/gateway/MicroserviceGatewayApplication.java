package com.joseluisestevez.ms.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceGatewayApplication.class, args);
    }

}
