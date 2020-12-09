package com.example.spring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zzhang4 on 2020/12/10
 */
@Configuration //works like a xml configuration.
public class SpringConfig {
    @Bean //define a bean...
    public  Account anyNameYouLike(){
        return new Account();
    }
}
