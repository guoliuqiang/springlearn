package com.lhosdp.initdestory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrepostConfig.class);
        BeanWayService beanwayservice = context.getBean(BeanWayService.class);
        JSR250WayService bean = context.getBean(JSR250WayService.class);

        context.close();

    }
}
