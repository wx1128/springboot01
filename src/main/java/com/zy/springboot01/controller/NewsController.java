package com.zy.springboot01.controller;

import com.google.gson.Gson;
import com.zy.springboot01.pojo.News;
import com.zy.springboot01.service.NewsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:NewsController
 * Package:com.zy.springboot01.controller
 * Description:
 *
 * @Date:2021/9/26 16:19
 * @Author:wx112820@163.com
 */

@Controller
@RequestMapping("/mynews")
public class NewsController {
    @Autowired
    private NewsService newsService;


    @RequestMapping(value = "/news")
    public String myHomeNew(){
        return "news";
    }
    @ResponseBody
    @GetMapping("getnews")
    public News getNews(@Param("id") Integer id){
        News news=newsService.finById(id);
        System.out.println(news);
        return news;
    }
    @GetMapping("gettitle")
    public String getTitle(@Param("title")String title){
        News news =newsService.finBytitle(title);
                return news.getTitle();
    }
    @ResponseBody
    @GetMapping("getAll")
    public List<News> getAll(){
        List<News> newsList =newsService.finNewsAll();
        return newsList;
    }
    @GetMapping("getJson")
    public String getJson(){
        List<News> news =newsService.finNewsAll();
        Gson gson =new Gson();
        return gson.toJson(news);
    }
}
