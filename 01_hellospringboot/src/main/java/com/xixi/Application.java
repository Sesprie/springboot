package com.xixi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//SpringBootApplication包含@ComponentScan，默认扫描引导类所在包及其子包下的所有被注解的类
@SpringBootApplication//声明该类为SpringBoot引导类
public class Application {

	public static void main(String[] args) {
		//run方法负责启动引导类，被@SpringBootApplication标注的是引导类
		SpringApplication.run(Application.class, args);
	}
}
