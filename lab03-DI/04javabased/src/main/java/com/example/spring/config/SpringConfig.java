package com.example.spring.config;

import com.example.spring.lab.Address;
import com.example.spring.lab.USER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zzhang4 on 2020/12/10
 */
//@Configuration
//@ComponentScan(basePackages = {"a.b"})
    //why here if i comment any one of above annotation(one or both..even set the componentscan package name
    //to an invalid one, the test can still PASS????


public class SpringConfig {
    @Bean
    public USER findUser(){
        USER user = new USER();
        return user;
    }

    @Bean
    public Address getAddress(){
        Address address = new Address();
        address.setCountry("CN");
        return address;
    }
}
