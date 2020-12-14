package com.example.spring.lab;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

import javax.inject.Named;

/**
 * Created by zzhang4 on 2020/12/14
 */
@Named
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Account1 {
    private int id=111;
    private String name="Jack";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
