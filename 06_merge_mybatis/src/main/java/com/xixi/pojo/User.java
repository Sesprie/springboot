package com.xixi.pojo;

public class User {

    private Integer id;
    private String username;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
/*

create database if not exists springboot;
use springboot;
drop table if exists `user`;
CREATE TABLE `user` (
	`id` int(11) not null auto_increment,
	`username` varchar(50) default null,
	`password` varchar(50) default null,
	`name` varchar(50) default null,
	primary key (`id`)
)default charset=utf8 ;

insert into `user` values('1','pony','123','张三');
insert into `user` values('2','pony two','456','李四');


 */