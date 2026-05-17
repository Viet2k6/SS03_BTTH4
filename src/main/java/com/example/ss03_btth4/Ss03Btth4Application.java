package com.example.ss03_btth4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Ss03Btth4Application {

    public static void main(String[] args) {
        SpringApplication.run(Ss03Btth4Application.class, args);
    }

}
