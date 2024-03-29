package com.xixi.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "dog")
@Data
public class Dog {
    private String name;
    private Integer age;
}
