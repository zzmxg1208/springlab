package com.example.spring.config;

import com.example.spring.lab.Address;
import com.example.spring.lab.USER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zzhang4 on 2020/12/10
 */
@Configuration
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
