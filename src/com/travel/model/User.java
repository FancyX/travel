package com.travel.model;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = -2475081600218844439L;
    private int id;
    private String wechatNum;
    private String phone;
    private int age;
    private int sex;
    private String photo;
        
    public int getId() {
        return this.id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }
        
    public String getWechatNum() {
        return this.wechatNum;
    }

    public User setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
        return this;
    }
        
    public String getPhone() {
        return this.phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }
        
    public int getAge() {
        return this.age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }
        
    public int getSex() {
        return this.sex;
    }

    public User setSex(int sex) {
        this.sex = sex;
        return this;
    }
        
    public String getPhoto() {
        return this.photo;
    }

    public User setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

}
