package com.jiangcl.dubbo.consumer.controller;

import com.jiangcl.dubbo.api.model.Order;
import com.jiangcl.dubbo.api.model.User;
import com.jiangcl.dubbo.api.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
@RestController
public class HelloController {
    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/hello")
    public Object hello(){
        User user = new User();
        user.setId("1");
        user.setName("zhangsan");
        Order order = consumerService.buyNewMovie(user);
        return order;
    }
}
