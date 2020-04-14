package com.zjut.zjxjwxk.dubbo.stub;

import com.zjut.zjxjwxk.dubbo.ServiceAPI;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @author zjxjwxk
 */
public class StubConsumerClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-stub-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            System.out.println(serviceAPI.sendMessage(message));
        }
    }
}
