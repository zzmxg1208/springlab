package com.example.spring.lab.service;

import com.example.spring.lab.domain.Order;
import com.example.spring.lab.domain.Product;

import java.util.List;

/**
 * Created by zzhang4 on 2020/12/13
 */
public interface OrderService {
    Order findOrderById(int orderId);
    //List<Product> getProductsOfTheOrder(int orderId);
}
