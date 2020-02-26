package com.offcn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author: wjzh
 * @ClassName: Person
 * @Date: Created in 20:59 2020/2/24
 * @Description:
 */

@Entity //声明类为实体或表
@Table(name = "tb_user")///声明表名
public class User {

    @Id  //声明主键
    @GeneratedValue //自增长
    private  Long id;
    //字段名, 是否可以为空, 长度
    @Column(name = "name",nullable = true,length = 20)
    private String name;

    @Column(name = "age",nullable = true,length = 4)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
