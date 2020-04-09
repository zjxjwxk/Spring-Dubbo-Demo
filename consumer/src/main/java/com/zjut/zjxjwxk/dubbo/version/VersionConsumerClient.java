package com.zjut.zjxjwxk.dubbo.version;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class VersionConsumerClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-version-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            System.out.println(serviceAPI.sendMessage(message));
        }
    }
}
