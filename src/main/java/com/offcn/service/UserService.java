package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

/**
 * @Author: wjzh
 * @ClassName: UserService
 * @Date: Created in 21:28 2020/2/25
 * @Description:
 */
public interface UserService {
        // 新增用户
        public void add(User user);

        // 修改
        public void update(Long id,User user);

        // 删除
        public void delete(Long id);

        // 根据 id 获取用户信息
        public User findOne(Long id);

        // 获取全部用户信息
        public List<User> findAll(); }
