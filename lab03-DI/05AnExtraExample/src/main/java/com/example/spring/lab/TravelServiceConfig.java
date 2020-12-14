package com.example.spring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zzhang4 on 2020/12/13
 */
@Configuration
public class TravelServiceConfig {

    @Bean
    public TravelService findTravelService(){
        TravelService  travelService = new BusTravelServiceImpl();
        return travelService;
    }
}
