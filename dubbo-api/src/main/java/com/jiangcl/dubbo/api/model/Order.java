package com.jiangcl.dubbo.api.model;

import java.io.Serializable;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
public class Order implements Serializable {
    private String userName;

    private String movieName;

    private double moviePrice;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }
}
