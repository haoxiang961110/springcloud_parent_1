package com.itheima.springcloud.order.service.impl;

import com.itheima.springcloud.order.mapper.OrderMapper;
import com.itheima.springcloud.order.service.OrderService;
import com.itheima.springcloud.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * 引导类
 *
 * @author: phx
 * @date: 2020/7/4
 * @time: 19:59
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> findByUsername(String username) {
        Example example = new Example(Order.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("username", username);
        return orderMapper.selectByExample(example);
    }
}
