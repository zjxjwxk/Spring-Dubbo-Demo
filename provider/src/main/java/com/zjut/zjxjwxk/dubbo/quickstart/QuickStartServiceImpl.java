package com.zjut.zjxjwxk.dubbo.quickstart;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;

public class QuickStartServiceImpl implements ServiceAPI {

    public String sendMessage(String message) {
        System.out.println("message=" + message);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "quickstart-provider-message = " + message;
    }

    public String sendMessage02(String message) {
        System.out.println("message02=" + message);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "quickstart-provider-message02 = " + message;
    }
}
