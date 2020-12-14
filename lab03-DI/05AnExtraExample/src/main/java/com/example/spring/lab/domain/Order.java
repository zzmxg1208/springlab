package com.example.spring.lab.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by zzhang4 on 2020/12/13
 */
public class Order {
    private int orderId;
    private double totalPrice;
    private Date orderDate;
    private List<Product> productList;
    private OtherOrderInfo otherOrderInfo;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public OtherOrderInfo getOtherOrderInfo() {
        return otherOrderInfo;
    }

    public void setOtherOrderInfo(OtherOrderInfo otherOrderInfo) {
        this.otherOrderInfo = otherOrderInfo;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }


}
