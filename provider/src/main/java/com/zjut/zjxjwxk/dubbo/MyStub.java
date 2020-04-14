package com.zjut.zjxjwxk.dubbo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyStub implements ServiceAPI {

    private final ServiceAPI serviceAPI;

    public MyStub(ServiceAPI serviceAPI) {
        this.serviceAPI = serviceAPI;
    }

    public String sendMessage(String message) {
        System.out.println("Stub sendMessage:");
        if (message.equals("123")) {
            return "抱歉，该值不能被接受";
        } else {
            message = "stub message -> " + message;
            return serviceAPI.sendMessage(message);
        }
    }

    public String sendMessage02(String message) {
        System.out.println("Stub sendMessage02:");
        return serviceAPI.sendMessage(message);
    }

    public List<String> mergerTest(String message) {
        System.out.println("Stub mergerTest:");
        return serviceAPI.mergerTest(message);
    }
}
