package com.zjut.zjxjwxk.dubbo.group;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class GroupConsumerClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-group-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            List<String> strList = serviceAPI.mergerTest(message);
            for (String str : strList) {
                System.out.println(str);
            }
        }
    }
}
