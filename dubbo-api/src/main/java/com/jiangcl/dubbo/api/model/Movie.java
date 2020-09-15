package com.jiangcl.dubbo.api.model;

import java.io.Serializable;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
public class Movie implements Serializable {
    private String movieId;

    private String movieName;

    private double moviePrice;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
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
