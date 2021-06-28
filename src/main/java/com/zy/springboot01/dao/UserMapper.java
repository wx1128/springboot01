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
    List<User> loginUser(@Param("username") String username, @Param("password") String password);

    List<User> IdUser(@Param("id") int id);

    List<User> AllUser();

    int AddUser(@Param("loginName") String loginName, @Param("userName") String userName, @Param("password") String password, @Param("sex") int sex, @Param("identityCode") String identityCode, @Param("email") String email, @Param("mobile") String mobile, @Param("type") int type);

    int DelUser(@Param("id") int id);

    int UpUser(@Param("id") int id,@Param("loginName") String loginName, @Param("userName") String userName, @Param("password") String password, @Param("sex") int sex, @Param("identityCode") String identityCode, @Param("email") String email, @Param("mobile") String mobile);
}
