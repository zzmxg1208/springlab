package com.example.spring.lab;

import javax.inject.Named;

/**
 * Created by zzhang4 on 2020/12/8
 */
@Named("account")
public class Account {
    private int id=1;
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

    @Override
    public String toString(){
        return "Create new Account : "+id+", "+name+"\n";
    }
}
