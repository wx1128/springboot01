package com.zy.springboot01.dao;

import com.zy.springboot01.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName:UserMapper
 * Package:com.zy.springboot01.dao
 * Description:
 *
 * @Date:2021/6/19 14:58
 * @Author:wx112820@163.com
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> loginUser(@Param("username")String username, @Param("password")String password);
}
