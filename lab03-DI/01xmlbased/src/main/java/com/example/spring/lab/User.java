package com.example.spring.lab;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class User {
    private int id;
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

