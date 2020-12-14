package com.example.spring.lab.domain;

/**
 * Created by zzhang4 on 2020/12/13
 */
public enum Category {
    EAT("eating"),
    DRINK("drinking"),
    FUN("forFun"),
    USE("dailyUse");

    private String desc;
    Category(String desc){
        this.desc = desc;
    }
    public String getDesc(){
        return  desc;
    }
}
