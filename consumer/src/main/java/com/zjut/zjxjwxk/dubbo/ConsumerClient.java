package com.zjut.zjxjwxk.dubbo;

import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class ConsumerClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-hello-consumer.xml");

        context.start();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            String message = scanner.next();

            // 获取接口
            ServiceAPI serviceAPI = (ServiceAPI) context.getBean("consumerService");
            // 测试负载均衡
//            for (int i = 0; i < 10; i++) {
//                System.out.println(serviceAPI.sendMessage(message + i));
//            }

            // 测试异步调用
            long beginTime = System.currentTimeMillis();

            serviceAPI.sendMessage(message);
            Future<String> sendFuture = RpcContext.getContext().getFuture();

            long endTime = System.currentTimeMillis();

            serviceAPI.sendMessage02(message);
            Future<String> sendFuture02 = RpcContext.getContext().getFuture();

            long endTime02 = System.currentTimeMillis();

            try {
                System.out.println(sendFuture.get() + "\n" + sendFuture02.get() + "\n" +
                        "sendMessage()执行时间：" + (endTime - beginTime) + "\n" +
                        "sendMessage02()执行时间：" + (endTime02 - beginTime));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }
}
