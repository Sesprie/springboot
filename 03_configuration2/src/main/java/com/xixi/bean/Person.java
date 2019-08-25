package com.xixi.bean;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;


//@ConfigurationProperties告诉SpringBoot将本类中的字段和配置文件中的属性进行绑定
//只有是Spring容器中的组件(被@Component)才能使用Spring提供的@ConfigurationProperties功能
//@PropertySource用于读取自定义名称的配置文件注入到当前类的实例中，只能用于properties文件
//@PropertySource(value = {"classpath:person.properties"})
@Component
//@ConfigurationProperties时从全局配置文件中读取，例如application.yml、application.properties等默认的全局配置文件
@ConfigurationProperties(prefix = "person") //会匹配前缀为person的配置
@Data
public class Person {

    //也可以使用@Value单个从配置文件中取出赋值或直接赋值
//    @Value("${person.name}")
    private String name;
//    @Value("#{11*2}")
    private int age;
    private boolean boss;
    private Date birth;

//    @Value("${person.map}")
    private Map<String, Object> map;
    private List<Object> lists;
    private Dog dog;


}
