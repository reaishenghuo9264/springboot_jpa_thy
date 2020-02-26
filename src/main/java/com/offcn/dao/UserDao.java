package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wjzh
 * @ClassName: UserDao
 * @Date: Created in 21:26 2020/2/25
 * @Description:
 */
public interface UserDao extends JpaRepository<User,Long> {
    public User findByNameIs(String name);

    public User findByNameAndAge(String name,Integer age);

}
