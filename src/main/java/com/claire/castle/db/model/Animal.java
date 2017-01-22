package com.claire.castle.db.model;

/**
 * Created by zhongnanhuang209074 on 2017/1/2.
 */
public class Animal {

    private int id;
    private String name;//名称
    private String cover;//封面图
    private String publisher;//由谁上传


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
