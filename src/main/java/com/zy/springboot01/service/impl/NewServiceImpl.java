package com.zy.springboot01.service.impl;

import com.zy.springboot01.dao.NewsMapper;
import com.zy.springboot01.pojo.News;
import com.zy.springboot01.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:NewServiceImpl
 * Package:com.zy.springboot01.service.impl
 * Description:
 *
 * @Date:2021/9/26 16:17
 * @Author:wx112820@163.com
 */
@Service
public class NewServiceImpl implements NewsService {
   @Autowired
    private  NewsMapper newsMapper;
    @Override
    public News finById(Integer id) {
        return newsMapper.finById(id);
    }

    @Override
    public News finBytitle(String title) {
        return newsMapper.finBytitle(title);
    }

    @Override
    public List<News> finNewsAll() {
        return newsMapper.finNewsAll();
    }
}
