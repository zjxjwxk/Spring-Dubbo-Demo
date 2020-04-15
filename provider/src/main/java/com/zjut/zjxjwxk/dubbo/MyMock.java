package com.zjut.zjxjwxk.dubbo;

import java.util.List;

/**
 * @author zjxjwxk
 */
public class MyMock implements ServiceAPI {
    public String sendMessage(String message) {
        return "抱歉，下订单的人数太多，请稍后重试";
    }

    public String sendMessage02(String message) {
        return "抱歉，下订单的人数太多，请稍后重试";
    }

    public List<String> mergerTest(String message) {
        return null;
    }
}
