package com.example.spring.lab;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by zzhang4 on 2020/12/14
 */
@Configuration
@ComponentScan(basePackages = "com.example.spring.lab")
public class AccountConfig {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Account3 getAcct3(){
        return new Account3();
    }

}
