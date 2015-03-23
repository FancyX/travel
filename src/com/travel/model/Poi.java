package com.travel.model;

import java.io.Serializable;

public class Poi implements Serializable {

    private static final long serialVersionUID = 6492821777371468706L;
    private int id;
    private String img;
    private String word;
    private String video;
    private double x;
    private double y;
    private int pathId;
        
    public int getId() {
        return this.id;
    }

    public Poi setId(int id) {
        this.id = id;
        return this;
    }
        
    public String getImg() {
        return this.img;
    }

    public Poi setImg(String img) {
        this.img = img;
        return this;
    }
        
    public String getWord() {
        return this.word;
    }

    public Poi setWord(String word) {
        this.word = word;
        return this;
    }
        
    public String getVideo() {
        return this.video;
    }

    public Poi setVideo(String video) {
        this.video = video;
        return this;
    }
        
    public double getX() {
        return this.x;
    }

    public Poi setX(double x) {
        this.x = x;
        return this;
    }
        
    public double getY() {
        return this.y;
    }

    public Poi setY(double y) {
        this.y = y;
        return this;
    }
        
    public int getPathId() {
        return this.pathId;
    }

    public Poi setPathId(int pathId) {
        this.pathId = pathId;
        return this;
    }

}
