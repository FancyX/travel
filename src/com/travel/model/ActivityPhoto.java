package com.travel.model;

import java.io.Serializable;

public class ActivityPhoto implements Serializable {

    private static final long serialVersionUID = -8819324862233721093L;
    private int id;
    private String url;
    private int routeId;
    private int userId;
    private String desc;
    private java.sql.Timestamp time;
        
    public int getId() {
        return this.id;
    }

    public ActivityPhoto setId(int id) {
        this.id = id;
        return this;
    }
        
    public String getUrl() {
        return this.url;
    }

    public ActivityPhoto setUrl(String url) {
        this.url = url;
        return this;
    }
        
    public int getRouteId() {
        return this.routeId;
    }

    public ActivityPhoto setRouteId(int routeId) {
        this.routeId = routeId;
        return this;
    }
        
    public int getUserId() {
        return this.userId;
    }

    public ActivityPhoto setUserId(int userId) {
        this.userId = userId;
        return this;
    }
        
    public String getDesc() {
        return this.desc;
    }

    public ActivityPhoto setDesc(String desc) {
        this.desc = desc;
        return this;
    }
        
    public java.sql.Timestamp getTime() {
        return this.time;
    }

    public ActivityPhoto setTime(java.sql.Timestamp time) {
        this.time = time;
        return this;
    }

}
