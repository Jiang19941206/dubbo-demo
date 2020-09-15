package com.jiangcl.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jiangcl.dubbo.api.model.Movie;
import com.jiangcl.dubbo.api.service.ProviderService;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public Movie getNewMovie() {
        Movie movie = new Movie();
        movie.setMovieId("1");
        movie.setMovieName("妇联4");
        movie.setMoviePrice(45.5);
        System.out.println("getNewMovie被成功调用。。。");
        return movie;
    }
}
