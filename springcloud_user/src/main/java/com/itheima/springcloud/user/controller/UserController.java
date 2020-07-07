package com.itheima.springcloud.user.controller;

import com.itheima.springcloud.pojo.Order;
import com.itheima.springcloud.pojo.User;
import com.itheima.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 20:38
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findUserById/{username}")
    public User findUserById(@PathVariable("username") String username){
        return userService.findUserById(username);
    }
    @GetMapping("/findOrderByUserId/{username}")
    public List<Order> findOrderByUserId(@PathVariable("username") String username){
        return userService.findOrderByUserId(username);
    }
}
