package com.example.spring.lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zzhang4 on 2020/12/10
 */
@Component("user2.3.1")
public class User {
    private int id;
    @Autowired
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    @Override
    public String toString(){
        return "UserInfo: id - "+id+"\taddress: "+address+"\n";
    }
}
