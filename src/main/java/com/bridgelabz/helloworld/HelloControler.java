package com.bridgelabz.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloControler {

    public static void main(String[] args) {
        System.out.println("Hello from bridgelabz");
        SpringApplication.run(HelloControler.class, args);
    }
}
