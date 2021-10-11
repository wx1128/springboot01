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
    //登入验证
    List<User> loginUser(String username, String password);

    List<User> IdUser(int id);

    List<User> AllUser();

    List<User> SlUser(int sex);

    int AddUser(String loginName,String userName,  String password,int sex,  String identityCode, String email, String mobile, int type);

    int DelUser( int id);

    int UpUser(int id, String loginName,
                String userName, String password,
               int sex,String identityCode,
               String email, String mobile);
}
