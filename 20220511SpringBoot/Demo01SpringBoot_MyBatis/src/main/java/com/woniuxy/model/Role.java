package com.woniuxy.model;

import com.woniuxy.mapper.RoleMapper;

import java.io.Serializable;
import java.util.List;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/11 14:28
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