package com.zjut.zjxjwxk.dubbo.quickstart;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

    public String sendMessage(String message) {
        System.out.println("message=" + message);
        return "quickstart-provider-message=" + message;
    }
}
