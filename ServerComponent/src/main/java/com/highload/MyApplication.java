package com.highload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.highload")
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }


}
