package com.woniuxy.model;

import java.io.Serializable;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 16:40
 * @Version： 1.0
 */
public class Role implements Serializable {
    private Integer id;
    private String name;
    private String desc;

    public Role() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
