package com.xixi.controller;

import com.xixi.mapper.UserMapper;
import com.xixi.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybatisController {

    @Autowired
    private UserMapper userMapper;


    @RequestMapping(value="/query")
    public List<User> queryUser(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
