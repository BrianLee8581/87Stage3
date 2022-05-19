package com.woniuxy.service;

import com.woniuxy.entity.RbacManager;

import java.util.List;
import java.util.Map;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 20:11
 * @Version： 1.0
 */
public interface RbacManagerService {
    List<Map<String,Object>> findAll();
    void sss();
    int deleteOne(int id);
    int addOne(RbacManager rbacManager);
}
