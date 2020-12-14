package com.example.spring.lab;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by zzhang4 on 2020/12/14
 */
public class Account implements InitializingBean {
    private int id=1;
    private String name="Jack";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setId to "+id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Override
    public String toString2(){
        return "Create new Account : "+id+", "+name+"\n";
    }

    public Account(){
        System.out.println("construct Accout...");
    }
    @PostConstruct
    public void init(){
        System.out.println("do init.....");
    }

    @PreDestroy
    public void destory(){
        System.out.println("destory.....");
    }

    
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet....");
    }
}
