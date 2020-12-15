package com.example.spring.config;

import com.example.spring.lab.Acct;
import com.example.spring.lab.USER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by zzhang4 on 2020/12/15
 */
@Configuration
@Import(SpringConfig.class)
public class UserConfigX {

    @Inject
    private USER Acct;

    //@Bean(name="userCONFIG")
    public UserConfigX getUserConfig() {
        System.out.println(Acct);
        return new UserConfigX();
    }
    @PostConstruct
    public void doit(){
        System.out.println("UserConfigX : "+Acct);
    }
}
