package com.zy.springboot01.dao;

import com.zy.springboot01.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName:NewsMapper
 * Package:com.zy.springboot01.dao
 * Description:
 *
 * @Date:2021/9/26 16:04
 * @Author:wx112820@163.com
 */
@Mapper
@Repository
public interface NewsMapper {
    //查询id
    public News finById(Integer id);
    //查询开头
    public News finBytitle(String title);
    //查询所有
    public List<News> finNewsAll();
}