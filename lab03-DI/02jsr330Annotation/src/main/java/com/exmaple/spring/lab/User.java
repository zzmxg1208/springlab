package com.exmaple.spring.lab;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by zzhang4 on 2020/12/10
 */
@Named
public class User {
    private int id;
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
