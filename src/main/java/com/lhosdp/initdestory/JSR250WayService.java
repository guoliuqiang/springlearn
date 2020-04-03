package com.lhosdp.initdestory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {

    @PostConstruct//在构造函数执行完之后执行
    public void init(){
        System.out.println("JSR250WayService初始化");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化JSR250WayService");
    }

    @PreDestroy//在Bean销毁之前执行
    public void destory(){
        System.out.println("JSR250WayService销毁");
    }
}
