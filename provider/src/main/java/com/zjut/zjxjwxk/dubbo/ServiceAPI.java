package com.zjut.zjxjwxk.dubbo;

import java.util.List;

public interface ServiceAPI {

    String sendMessage(String message);

    String sendMessage02(String message);

    List<String> mergerTest(String message);
}
