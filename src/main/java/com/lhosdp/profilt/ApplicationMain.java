package com.lhosdp.profilt;

import com.lhosdp.initdestory.BeanWayService;
import com.lhosdp.initdestory.JSR250WayService;
import com.lhosdp.initdestory.PrepostConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("dev");//先将活动的Profile设置成prod
        context.register(ProfileConfig.class);//再注册Bean配置类，要不然会报Bean未定义的错误
        context.refresh();//刷新容器

        DemoBean bean = context.getBean(DemoBean.class);
        System.out.println(bean.getContent());

        context.close();

    }
}
