package com.itheima.springcloud.user.service;

import com.itheima.springcloud.pojo.Order;
import com.itheima.springcloud.pojo.User;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 20:37
 */
public interface UserService {

    User findUserById(String username);

    List<Order> findOrderByUserId(String username);
}
