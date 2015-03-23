package com.travel.model;

import java.io.Serializable;

public class Certificate implements Serializable {

    private static final long serialVersionUID = 4922966734954442975L;
    private int id;
    private int routId;
    private String imgs;
    private String medal;
        
    public int getId() {
        return this.id;
    }

    public Certificate setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getRoutId() {
        return this.routId;
    }

    public Certificate setRoutId(int routId) {
        this.routId = routId;
        return this;
    }
        
    public String getImgs() {
        return this.imgs;
    }

    public Certificate setImgs(String imgs) {
        this.imgs = imgs;
        return this;
    }
        
    public String getMedal() {
        return this.medal;
    }

    public Certificate setMedal(String medal) {
        this.medal = medal;
        return this;
    }

}
