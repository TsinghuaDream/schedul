package com.springboot.schedul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SchedulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulApplication.class, args);
    }

}
