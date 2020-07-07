package com.itheima.springcloud.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**引导类
 * @author: phx
 * @date: 2020/7/4
 * @time: 20:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.itheima.springcloud.feign")
@MapperScan(basePackages = "com.itheima.springcloud.user.mapper")
@RefreshScope
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
