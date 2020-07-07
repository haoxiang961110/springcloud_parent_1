package com.itheima.springcloud.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**引导类
 * @author: phx
 * @date: 2020/7/4
 * @time: 19:55
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.itheima.springcloud.order.mapper")
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
