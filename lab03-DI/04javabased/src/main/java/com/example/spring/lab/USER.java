package com.example.spring.lab;

import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class USER {
    private int id;

    //Both way are correct!
    //@Autowired
    @Inject
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
