package com.zy.springboot01.service;

import com.zy.springboot01.pojo.News;

import java.util.List;

/**
 * ClassName:NewsService
 * Package:com.zy.springboot01.service
 * Description:
 *
 * @Date:2021/9/26 16:16
 * @Author:wx112820@163.com
 */
public interface NewsService {
    //查询id
    public News finById(Integer id);
    //查询开头
    public News finBytitle(String title);
    //查询所有
    public List<News> finNewsAll();
}
