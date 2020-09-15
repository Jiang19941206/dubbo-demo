package com.jiangcl.dubbo.consumer.service.Impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jiangcl.dubbo.api.model.Movie;
import com.jiangcl.dubbo.api.model.Order;
import com.jiangcl.dubbo.api.model.User;
import com.jiangcl.dubbo.api.service.ConsumerService;
import com.jiangcl.dubbo.api.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {
    @Reference
    private ProviderService providerService;

    @Override
    public Order buyNewMovie(User user) {
        Movie movie = providerService.getNewMovie();

        Order order = new Order();
        order.setUserName(user.getName());
        order.setMovieName(movie.getMovieName());
        order.setMoviePrice(movie.getMoviePrice());
        return order;
    }
}
