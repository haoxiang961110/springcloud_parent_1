package com.itheima.springcloud.user.service.impl;

import com.itheima.springcloud.feign.OrderFeign;
import com.itheima.springcloud.pojo.Order;
import com.itheima.springcloud.pojo.User;
import com.itheima.springcloud.user.mapper.UserMapper;
import com.itheima.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 20:37
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private OrderFeign orderFeign;

    @Override
    public User findUserById(String username) {
        User user = new User();
        user.setUsername(username);
        return userMapper.selectByPrimaryKey(user);
    }

    @Override
    public List<Order> findOrderByUserId(String username) {
        return orderFeign.findOrderByUsername(username);
    }


}
