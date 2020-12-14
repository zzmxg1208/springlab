package com.example.spring.lab;

import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by zzhang4 on 2020/12/13
 */
@Configuration
public class BusTravelServiceImpl implements TravelService{
    public String travelBy() {
        return "BUS";
    }

    public void makeATrip() {
        System.out.println("Travel by: "+travelBy()+getTravelInfo());
    }

    public TravelInfo getTravelInfo() {
        TravelInfo travelInfo = new TravelInfo();
        travelInfo.setDate(new Date());
        travelInfo.setFrom("SHA");
        travelInfo.setTo("AN");
        return travelInfo;
    }

}
