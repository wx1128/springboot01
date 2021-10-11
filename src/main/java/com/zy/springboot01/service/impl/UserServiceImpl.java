package com.zy.springboot01.service.impl;

import com.zy.springboot01.dao.UserMapper;
import com.zy.springboot01.pojo.User;
import com.zy.springboot01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UserServiceImpl
 * Package:com.zy.springboot01.service.impl
 * Description:
 *
 * @Date:2021/6/19 14:59
 * @Author:wx112820@163.com
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper um;

    @Override
    public List<User> loginUser(String username, String password) {
        return um.loginUser(username,password);
    }

    @Override
    public List<User> IdUser(int id) {
        return um.IdUser(id);
    }

    @Override
    public List<User> AllUser() {
        return um.AllUser();
    }

    @Override
    public List<User> SlUser(int sex) {
        return um.SlUser(sex);
    }

    @Override
    public int AddUser(String loginName, String userName, String password, int sex, String identityCode, String email, String mobile, int type) {
        return um.AddUser(loginName,userName ,password,sex ,identityCode,email ,mobile,type);

    }

    @Override
    public int DelUser(int id) {
        return um.DelUser(id);
    }

    @Override
    public int UpUser(int id,String loginName, String userName, String password, int sex, String identityCode, String email, String mobile) {
        return um.UpUser(id,loginName,userName,password,sex,identityCode,email,mobile);
    }


}
