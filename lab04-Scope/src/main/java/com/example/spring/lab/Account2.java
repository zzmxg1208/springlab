package com.example.spring.lab;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by zzhang4 on 2020/12/14
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//default value.
public class Account2 {
    private int id=222;
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
