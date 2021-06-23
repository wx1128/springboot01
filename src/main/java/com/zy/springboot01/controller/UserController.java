package com.zy.springboot01.controller;


import com.zy.springboot01.dao.UserMapper;
import com.zy.springboot01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:UserController
 * Package:com.zy.springboot01.controller
 * Description:
 *
 * @Date:2021/6/19 14:58
 * @Author:wx112820@163.com
 */

@Controller
public class UserController {
    @Autowired
    UserMapper um;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String loginuser(@RequestParam("username") String username, @RequestParam("password") String password){

                List<User> lotus=um.loginUser(username,password);

        for (User user : lotus) {
            System.out.println(user);
            if (user.getUserName() != null) {
                return "home";
            }
        }
        return "index";
    }

}
