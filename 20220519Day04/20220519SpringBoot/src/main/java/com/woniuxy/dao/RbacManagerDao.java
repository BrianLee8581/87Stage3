package com.woniuxy.dao;

import com.woniuxy.entity.RbacManager;

import java.util.List;
import java.util.Map;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 20:10
 * @Version： 1.0
 */

public interface RbacManagerDao {
    /**
     * 找到所有
     *
     * @return {@link List}<{@link Map}<{@link String}, {@link Object}>>
     */
    List<Map<String,Object>> findAll();

    /**
     * 删除通过id
     *
     * @param id id
     * @return int
     */
    int deleteById(int id);

    /**
     * 添加一个
     *
     * @param rbacManager rbac经理
     * @return int
     */
    int addOne(RbacManager rbacManager);
}
