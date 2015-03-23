package com.travel.model;

import java.io.Serializable;

public class RouteInfo implements Serializable {

    private static final long serialVersionUID = 3093888313738791822L;
    private int id;
    private String name;
    private String city;
    private String region;
    private String info;
    private String schematic;
    private int isperfect;
    private String bright;
    private String watch;
    private String attention;
        
    public int getId() {
        return this.id;
    }

    public RouteInfo setId(int id) {
        this.id = id;
        return this;
    }
        
    public String getName() {
        return this.name;
    }

    public RouteInfo setName(String name) {
        this.name = name;
        return this;
    }
        
    public String getCity() {
        return this.city;
    }

    public RouteInfo setCity(String city) {
        this.city = city;
        return this;
    }
        
    public String getRegion() {
        return this.region;
    }

    public RouteInfo setRegion(String region) {
        this.region = region;
        return this;
    }
        
    public String getInfo() {
        return this.info;
    }

    public RouteInfo setInfo(String info) {
        this.info = info;
        return this;
    }
        
    public String getSchematic() {
        return this.schematic;
    }

    public RouteInfo setSchematic(String schematic) {
        this.schematic = schematic;
        return this;
    }
        
    public int getIsperfect() {
        return this.isperfect;
    }

    public RouteInfo setIsperfect(int isperfect) {
        this.isperfect = isperfect;
        return this;
    }
        
    public String getBright() {
        return this.bright;
    }

    public RouteInfo setBright(String bright) {
        this.bright = bright;
        return this;
    }
        
    public String getWatch() {
        return this.watch;
    }

    public RouteInfo setWatch(String watch) {
        this.watch = watch;
        return this;
    }
        
    public String getAttention() {
        return this.attention;
    }

    public RouteInfo setAttention(String attention) {
        this.attention = attention;
        return this;
    }

}
