package com.example.spring.lab;

import java.util.Date;

/**
 * Created by zzhang4 on 2020/12/13
 */
public class AirTravelServiceImpl implements  TravelService{
    public String travelBy() {
        return "AIR";
    }

    public void makeATrip() {
        System.out.println("Travel by "+travelBy()+getTravelInfo());
    }

    public TravelInfo getTravelInfo() {
        TravelInfo travelInfo = new TravelInfo();
        travelInfo.setDate(new Date());
        travelInfo.setFrom("CN");
        travelInfo.setTo("US");
        return travelInfo;
    }
}
