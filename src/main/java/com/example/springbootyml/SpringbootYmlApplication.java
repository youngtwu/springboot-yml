package com.example.springbootyml;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations = {"classpath:bean.xml"})
public class SpringbootYmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootYmlApplication.class, args);
    }
}
