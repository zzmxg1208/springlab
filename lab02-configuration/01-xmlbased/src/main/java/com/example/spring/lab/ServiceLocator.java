package com.example.spring.lab;

/**
 * Created by zzhang4 on 2020/12/15
 */
public class ServiceLocator {
    private static ClientService2 clientService = new ClientService2();

    //private static AccountService accountService = new AccountServiceImpl();

    public ClientService2 createClientServiceInstance() {
        return clientService;
    }

    /*public AccountService createAccountServiceInstance() {
        return accountService;
    }*/
}
