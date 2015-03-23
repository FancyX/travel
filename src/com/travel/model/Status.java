package com.travel.model;

import java.io.Serializable;

public class Status implements Serializable {

    private static final long serialVersionUID = 9076518518220839237L;
    private int id;
    private int userId;
    private int score;
    private int ranking;
    private String certificateIds;
    private int progress;
        
    public int getId() {
        return this.id;
    }

    public Status setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getUserId() {
        return this.userId;
    }

    public Status setUserId(int userId) {
        this.userId = userId;
        return this;
    }
        
    public int getScore() {
        return this.score;
    }

    public Status setScore(int score) {
        this.score = score;
        return this;
    }
        
    public int getRanking() {
        return this.ranking;
    }

    public Status setRanking(int ranking) {
        this.ranking = ranking;
        return this;
    }
        
    public String getCertificateIds() {
        return this.certificateIds;
    }

    public Status setCertificateIds(String certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }
        
    public int getProgress() {
        return this.progress;
    }

    public Status setProgress(int progress) {
        this.progress = progress;
        return this;
    }

}
