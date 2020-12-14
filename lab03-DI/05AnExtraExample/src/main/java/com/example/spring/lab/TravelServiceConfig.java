package com.example.spring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by zzhang4 on 2020/12/13
 */
@Configuration
@ComponentScan(basePackages = "com.example.spring.lab.domain")
public class TravelServiceConfig {

    @Bean
    protected TravelService findTravelService(){
        TravelService  travelService = new BusTravelServiceImpl();
        return travelService;
    }


}
