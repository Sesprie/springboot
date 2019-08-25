package com.xixi.config;


import com.xixi.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



//@Configuration用于表示当前类是配置类
@Configuration
public class MyAppConfig {



    //方法名称即为容器中bean实例的名称
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

}


