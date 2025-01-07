package com.spring.made.easy.tutorial.module01.environment.setup;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.made.easy.tutorial.module01.environment.setup.beans.HelloBean;

public class Runner {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
            HelloBean helloBean = context.getBean(HelloBean.class);
            helloBean.sayHello();
        }
    }
}
