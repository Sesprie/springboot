package com.xixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


//@ImportResource用于导入自定义名称的配置文件，让Spring读取
//@通过查看@ImportResource的实现可知，value与locations时alias的关系
//@ImportResource(value = {"classpath:beans.xml"})
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}


/*
@ImportResource 导入xml配置文件
@Configuration 标识配置类，替代读取配置文件，被@Configuration标识的类处于启动类下会被自动扫描
@PropertySource 读取properties文件
 */