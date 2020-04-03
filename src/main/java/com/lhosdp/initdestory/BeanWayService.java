package com.lhosdp.initdestory;


public class BeanWayService {

    public void init(){
        System.out.println("BeanWayService初始化");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化JSR250WayService");
    }

    public void destory(){
        System.out.println("BeanWayService销毁");
    }
}
