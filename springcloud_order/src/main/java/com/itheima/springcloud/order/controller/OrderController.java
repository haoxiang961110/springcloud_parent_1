package com.itheima.springcloud.order.controller;

import com.itheima.springcloud.order.service.OrderService;
import com.itheima.springcloud.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 19:59
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/findByUsername/{username}")
   public List<Order> findOrderByUsername(@PathVariable("username") String username){
       return orderService.findByUsername(username);
    }
}
