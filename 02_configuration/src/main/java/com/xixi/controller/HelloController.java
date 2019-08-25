package com.xixi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//此注解为ResponseBody和Controller的组合注解
@ConfigurationProperties(value = "person")
public class HelloController {


	//将配置文件中的name取出赋值给当前变量
    @Value("${name}")
    private String name1;

    //下面两个都会将以person开头的配置赋值
    private String name;
    private String addr;
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello,Spring Boot";
	}
	
	
	
	public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @RequestMapping(value="/getName")
    public String getName(){
        return "name:" + name + ", addr: " + addr + ", name1: " + name1;
    }
	
}
