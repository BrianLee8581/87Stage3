package com.woniuxy.service.impl;

import com.woniuxy.dao.RbacManagerDao;
import com.woniuxy.entity.RbacManager;
import com.woniuxy.service.RbacManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/19 20:11
 * @Version： 1.0
 */
@Service
public class RbacManagerServiceImpl implements RbacManagerService {
    @Autowired
    RbacManagerDao rbacManagerDao;

    /**
     * 找到所有
     *
     * @return {@link List}<{@link Map}<{@link String}, {@link Object}>>
     */
    @Override
    public List<Map<String, Object>> findAll() {
        return rbacManagerDao.findAll();
    }

    /**
     * 控制台打印普通方法
     */
    @Override
    public void sss(){
        System.out.println("my normal method");
    }

    /**
     * 删除一个
     *
     * @param id id
     * @return int
     */
    @Override
    @Transactional()
    public int deleteOne(int id) {
        int i =rbacManagerDao.deleteById(id);
        return i;
    }

    /**
     * 添加一个
     *
     * @param rbacManager rbac经理
     * @return int
     */
    @Override
    public int addOne(RbacManager rbacManager) {
        return rbacManagerDao.addOne(rbacManager);
    }
}
