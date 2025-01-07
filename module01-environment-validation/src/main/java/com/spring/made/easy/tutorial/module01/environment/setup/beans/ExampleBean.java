package com.spring.made.easy.tutorial.module01.environment.setup.beans;

import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    public void sayHello() {
        System.out.println("Hello From Spring Framework");
    }
}
