package com.zjut.zjxjwxk.dubbo.version;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;

import java.util.Arrays;
import java.util.List;

public class VersionServiceImplA implements ServiceAPI {

    public String sendMessage(String message) {
        System.out.println("message group A version 0.1 = " + message);
        return "quickstart-provider-message-group-A-version-0.1 = " + message;
    }

    public String sendMessage02(String message) {
        System.out.println("message02=" + message);
        return "quickstart-provider-message02 = " + message;
    }

    public List<String> mergerTest(String message) {
        String str = "group A=" + message;
        return Arrays.asList(str);
    }
}
