package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EntityScan({"com.example.*"})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        SpringApplication.run(Main.class);

    }
}