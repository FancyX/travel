package com.travel.model;

import java.io.Serializable;

public class RouteIntroduce implements Serializable {

    private static final long serialVersionUID = 4656061893975649509L;
    private int id;
    private int routeId;
    private String img;
    private String word;
        
    public int getId() {
        return this.id;
    }

    public RouteIntroduce setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getRouteId() {
        return this.routeId;
    }

    public RouteIntroduce setRouteId(int routeId) {
        this.routeId = routeId;
        return this;
    }
        
    public String getImg() {
        return this.img;
    }

    public RouteIntroduce setImg(String img) {
        this.img = img;
        return this;
    }
        
    public String getWord() {
        return this.word;
    }

    public RouteIntroduce setWord(String word) {
        this.word = word;
        return this;
    }

}
