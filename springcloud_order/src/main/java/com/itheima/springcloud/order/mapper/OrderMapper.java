package com.itheima.springcloud.order.mapper;

import com.itheima.springcloud.pojo.Order;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 19:58
 */
@Repository
public interface OrderMapper extends Mapper<Order> {

}
