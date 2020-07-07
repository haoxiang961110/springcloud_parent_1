package com.itheima.springcloud.user.mapper;

import com.itheima.springcloud.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author: phx
 * @date: 2020/7/4
 * @time: 20:38
 */
@Repository
public interface UserMapper extends Mapper<User> {
}
