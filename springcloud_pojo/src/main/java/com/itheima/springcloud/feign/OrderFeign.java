package com.itheima.springcloud.feign;

import com.itheima.springcloud.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 21:04
 */
@FeignClient(name = "order")
public interface OrderFeign {
    @GetMapping("/order/findByUsername/{username}")
    public List<Order> findOrderByUsername(@PathVariable("username") String username);
}
