/*=====================创建数据库========================*/
CREATE TABLE `user`(
`id` INT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(20) NOT NULL,
`name` VARCHAR(20) NOT NULL,
PRIMARY KEY(id)
);

INSERT INTO `user`(`username`, `NAME`) VALUES("小明","张三");
INSERT INTO `user`(`username`, `NAME`) VALUES("僮僮","李四");









# Spring Boot整合mybatis步骤
1.引入mybatis提供的starter、引入数据库驱动
2.在application.properties中加入mybatis的配置，包扫描，mapper映射
3.建立mapper文件
4.提供数据库信息