package com.jiangcl.dubbo.api.model;

import java.io.Serializable;

/**
 * @author jiangcl
 * @date 2020/9/11
 * @desc
 */
public class User implements Serializable {
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
