package com.zy.springboot01.pojo;

/**
 * ClassName:News
 * Package:com.zy.springboot01.pojo
 * Description:
 *
 * @Date:2021/9/26 15:59
 * @Author:wx112820@163.com
 */
public class News {
    private Integer id;
    private String title;
    private String content;
    private String createTime;

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
