springboot项目三要素：
1.继承parent
		<parent>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-parent</artifactId>
			<version>2.1.6.RELEASE</version>
		</parent>
	
2.引入相关starter
		<dependencies>
			<!-- web功能起步依赖 -->
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-web</artifactId>
			</dependency>
			<!-- 热部署 -->
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-devtools</artifactId>
			</dependency>
		</dependencies>
		
3.注解引导类






该项目的功能：
springboot入门案例





### src/main/resources目录说明
* static：保存所有的静态资源文件,js css images
* templates：保存所有的模板引擎，SpringBoot默认使用打包成jar包，使用嵌入式的tomcat不支持jsp页面，但是可以使用模板引擎(freemarker、thymeleaf)
* application.properties：Spring Boot的配置文件


