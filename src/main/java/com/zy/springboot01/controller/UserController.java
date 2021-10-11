package com.zy.springboot01.controller;


import com.zy.springboot01.dao.UserMapper;
import com.zy.springboot01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    //登录判断
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String logins(@RequestParam("username") String username, @RequestParam("password") String password) {

        List<User> lotus = um.loginUser(username, password);

        for (User user : lotus) {
            if (user.getUserName() != null) {
                return "redirect:homepage";
            }
        }
        return "index";
    }

    //主页加载用户全部信息
    @RequestMapping("homepage")
    public String SelUsers(Model model) {
        List<User> allUser = um.AllUser();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = df.format(new Date());// new Date()为获取当前系统时间
        model.addAttribute("allUser", allUser);
        model.addAttribute("time", time);
        return "home";
    }

    @RequestMapping("slhome")
    public String Slhome(int sex, Model model) {
        System.out.println(sex);
        List<User> allUser = null;
        if (sex >= 0 && sex < 2) {
            allUser = um.SlUser(sex);
            for (User user : allUser) {
                System.out.println(user);
            }
            model.addAttribute("allUser", allUser);
            model.addAttribute("err", "搜索信息如下");
            return "home";
        }
        if (sex == 6) {

            return "redirect:homepage";
        }

        model.addAttribute("allUser", allUser);
        model.addAttribute("err", "无此搜索项");
        return "home";
    }



    //注册
    @RequestMapping(value = "/toregister", method = RequestMethod.POST)
    public String AddUsers(@RequestParam("username") String username, @RequestParam("loginname") String loginname, @RequestParam("password") String password, @RequestParam("sex") String sx, @RequestParam("identityCode") String identityCode, @RequestParam("email") String email, @RequestParam("mobile") String mobile, @RequestParam("type") String tpe) {
        if(username=="" && loginname==""  && password==""  && identityCode==""  && email==""  && mobile==""){
            return  "register";
        }
        int sex=0;
        if (sx=="男"){
            sex=1;
        }
        int type=0;
        if (tpe!="0"){
            type=1;
        }
        Object ob=null;
                ob=um.AddUser(loginname, username, password, sex, identityCode, email, mobile, type);
        if (ob!=null) {
            return "index";
        }
        return "index";
    }
    //删除
    @RequestMapping("/del/{id}")
    public String DelUsers(@PathVariable("id")int id){
       um.DelUser(id);
            return "redirect:homepage";
    }


    //修改
    @RequestMapping("/upus/{id}")
    public String UpUsers(@PathVariable("id")int id,Model model){
        System.out.println(um.IdUser(id));
        model.addAttribute("user", um.IdUser(id));
        return "upuser";
    }
    @RequestMapping(value = "/toupus",method = RequestMethod.POST)
    public String UpUsers2(@RequestParam("id")String i,
                            @RequestParam("username") String username,
                           @RequestParam("loginname") String loginname,
                           @RequestParam("password") String password,
                           @RequestParam("sex") String sx,
                           @RequestParam("identityCode") String identityCode,
                           @RequestParam("email") String email,
                           @RequestParam("mobile") String mobile){
        System.out.println("00000000000000000000");
        if(username=="" && loginname==""  && password==""  && identityCode==""  && email==""  && mobile==""){
            return  "redirect:homepage";
        }

         int id= Integer.valueOf(i).intValue();

        int sex=0;
        if (sx.equals("男")){
            sex=1;
        }

        Object ob=um.UpUser(id,loginname, username, password, sex, identityCode, email, mobile);
        System.out.println(ob);
            return "redirect:homepage";

    }
}
