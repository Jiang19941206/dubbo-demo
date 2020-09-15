package com.jiangcl.dubbo.api.service;

import com.jiangcl.dubbo.api.model.Order;
import com.jiangcl.dubbo.api.model.User;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
public interface ConsumerService {
    Order buyNewMovie(User user);
}
