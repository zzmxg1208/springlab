package com.example.spring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zzhang4 on 2020/12/14
 */

@Configuration
public class SpringConfi {
    @Bean({"acct5.1","account5.1"})
    public Account theAcct(){
        return new Account();
    }
}
