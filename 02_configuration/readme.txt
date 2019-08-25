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
测试properties和yml文件语法








