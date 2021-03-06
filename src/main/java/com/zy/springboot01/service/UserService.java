package com.zy.springboot01.service;

import com.zy.springboot01.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * ClassName:UserService
 * Package:com.zy.springboot01.service
 * Description:
 *
 * @Date:2021/6/19 14:59
 * @Author:wx112820@163.com
 */
public interface UserService {
    List<User> loginUser(String username, String password);
    List<User> IdUser(int id);
    List<User> AllUser();
    List<User> SlUser(int sex);
    int AddUser(String loginName,String userName,String password,int sex,String identityCode,String email,String mobile,int type);
    int DelUser(int id);
    int UpUser(int id,String loginName,String userName,String password,int sex,String identityCode,String email,String mobile);
}
