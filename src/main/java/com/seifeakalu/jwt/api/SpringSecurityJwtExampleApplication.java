package com.seifeakalu.jwt.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringSecurityJwtExampleApplication {
   

    @PostConstruct
    public void initUsers() {
       
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtExampleApplication.class, args);
    }

}
