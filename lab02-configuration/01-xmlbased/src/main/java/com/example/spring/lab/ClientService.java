package com.example.spring.lab;

/**
 * Created by zzhang4 on 2020/12/15
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    public static ClientService createInstance() {
        return clientService;
    }
}
