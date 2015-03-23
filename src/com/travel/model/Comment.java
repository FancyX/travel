package com.travel.model;

import java.io.Serializable;

public class Comment implements Serializable {

    private static final long serialVersionUID = -1056138189894629187L;
    private int id;
    private int routeId;
    private int userId;
    private String content;
    private java.sql.Timestamp time;
        
    public int getId() {
        return this.id;
    }

    public Comment setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getRouteId() {
        return this.routeId;
    }

    public Comment setRouteId(int routeId) {
        this.routeId = routeId;
        return this;
    }
        
    public int getUserId() {
        return this.userId;
    }

    public Comment setUserId(int userId) {
        this.userId = userId;
        return this;
    }
        
    public String getContent() {
        return this.content;
    }

    public Comment setContent(String content) {
        this.content = content;
        return this;
    }
        
    public java.sql.Timestamp getTime() {
        return this.time;
    }

    public Comment setTime(java.sql.Timestamp time) {
        this.time = time;
        return this;
    }

}
