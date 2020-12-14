package com.example.spring.lab;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Date;

/**
 * Created by zzhang4 on 2020/12/13
 */
public class TravelInfo {
    private Date date;
    private String from;
    private String to;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
    @Override
    public  String toString(){
        return "& Travel Info: ["+date+" ,"+from+", "+to+" ]";
    }
}
