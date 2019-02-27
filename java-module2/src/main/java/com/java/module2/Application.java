package com.java.module2;

import com.java.module1.service.HelloService;
import com.java.module1.service.impl.HelloServiceImpl;

/**
 * Hello world!
 */
public class Application {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        helloService.sayHello("jessica");
    }
}
