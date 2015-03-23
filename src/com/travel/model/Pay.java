package com.travel.model;

import java.io.Serializable;

public class Pay implements Serializable {

    private static final long serialVersionUID = 7530265267343921462L;
    private int id;
    private int routeId;
    private int userId;
    private double price;
    private java.sql.Timestamp jointime;
    private java.sql.Timestamp buytime;
    private double totalprice;
        
    public int getId() {
        return this.id;
    }

    public Pay setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getRouteId() {
        return this.routeId;
    }

    public Pay setRouteId(int routeId) {
        this.routeId = routeId;
        return this;
    }
        
    public int getUserId() {
        return this.userId;
    }

    public Pay setUserId(int userId) {
        this.userId = userId;
        return this;
    }
        
    public double getPrice() {
        return this.price;
    }

    public Pay setPrice(double price) {
        this.price = price;
        return this;
    }
        
    public java.sql.Timestamp getJointime() {
        return this.jointime;
    }

    public Pay setJointime(java.sql.Timestamp jointime) {
        this.jointime = jointime;
        return this;
    }
        
    public java.sql.Timestamp getBuytime() {
        return this.buytime;
    }

    public Pay setBuytime(java.sql.Timestamp buytime) {
        this.buytime = buytime;
        return this;
    }
        
    public double getTotalprice() {
        return this.totalprice;
    }

    public Pay setTotalprice(double totalprice) {
        this.totalprice = totalprice;
        return this;
    }

}
