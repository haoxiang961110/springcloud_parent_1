package com.itheima.springcloud.order.service;

import com.itheima.springcloud.pojo.Order;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 19:59
 */
public interface OrderService {
    List<Order> findByUsername(String username);

}
