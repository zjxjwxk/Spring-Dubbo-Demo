package com.zjut.zjxjwxk.dubbo.stub;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;

import java.util.Arrays;
import java.util.List;

public class StubServiceImpl implements ServiceAPI {

    public String sendMessage(String message) {
        System.out.println("message stub = " + message);
        // 制造超时异常，Dubbo默认超时为1000ms，会尝试三次
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "quickstart-provider-message-stub = " + message;
    }

    public String sendMessage02(String message) {
        System.out.println("message stub = " + message);
        return "quickstart-provider-message-stub = " + message;
    }

    public List<String> mergerTest(String message) {
        String str = "stub=" + message;
        return Arrays.asList(str);
    }
}
