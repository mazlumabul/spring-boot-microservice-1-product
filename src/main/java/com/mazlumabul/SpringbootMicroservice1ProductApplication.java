package com.mazlumabul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:default}.properties")
public class SpringbootMicroservice1ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMicroservice1ProductApplication.class, args);
    }

}
