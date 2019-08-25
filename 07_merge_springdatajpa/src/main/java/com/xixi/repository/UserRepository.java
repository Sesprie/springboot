package com.xixi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.xixi.domain.User;

//public interface UserRepository extends CrudRepository<User, Integer>{
//
//}

public interface UserRepository extends JpaRepository<User, Integer>{

	//根据方法名命名规则
	//https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
}