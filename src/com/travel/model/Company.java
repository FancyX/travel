package com.travel.model;

import java.io.Serializable;

public class Company implements Serializable {

    private static final long serialVersionUID = -2462187751197297297L;
    private int id;
    private String name;
    private String wechatNum;
    private String contactway;
    private String address;
    private String mails;
    private String tel;
        
    public int getId() {
        return this.id;
    }

    public Company setId(int id) {
        this.id = id;
        return this;
    }
        
    public String getName() {
        return this.name;
    }

    public Company setName(String name) {
        this.name = name;
        return this;
    }
        
    public String getWechatNum() {
        return this.wechatNum;
    }

    public Company setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
        return this;
    }
        
    public String getContactway() {
        return this.contactway;
    }

    public Company setContactway(String contactway) {
        this.contactway = contactway;
        return this;
    }
        
    public String getAddress() {
        return this.address;
    }

    public Company setAddress(String address) {
        this.address = address;
        return this;
    }
        
    public String getMails() {
        return this.mails;
    }

    public Company setMails(String mails) {
        this.mails = mails;
        return this;
    }
        
    public String getTel() {
        return this.tel;
    }

    public Company setTel(String tel) {
        this.tel = tel;
        return this;
    }

}
