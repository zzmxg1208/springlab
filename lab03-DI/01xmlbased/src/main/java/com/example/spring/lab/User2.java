package com.example.spring.lab;

/**
 * Created by zzhang4 on 2020/12/10
 */
public class User2 {
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
    public User2(){}
    public User2(int id, Address address){
        this.id = id;
        this.address =address;
    }

    @Override
    public String toString(){
        return "User2Info: id - "+id+"\taddress: "+address+"\n";
    }
}
