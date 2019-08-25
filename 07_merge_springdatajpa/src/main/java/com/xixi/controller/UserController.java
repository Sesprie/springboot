package com.xixi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xixi.domain.User;
import com.xixi.repository.UserRepository;

@RestController
public class UserController {

	
	@Autowired
	private UserRepository userRepository;
	
	//貌似Iterable<User>和List<User>等效
	//当repository继承子CrudRepository的时候findAll返回的是Iterable<User>
	//当repository继承子JpaRepository的时候findAll返回的是List<User>
	@RequestMapping(value = "/query")
	public List<User> query() {
		return userRepository.findAll();
	}
	
	
}
