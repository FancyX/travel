package com.travel.model;

import java.io.Serializable;

public class Topic implements Serializable {

    private static final long serialVersionUID = -6376990267287878590L;
    private int id;
    private String title;
    private String content;
    private int score;
    private String prompt;
    private int pathId;
    private int type;
    private int random;
    private String answer;
        
    public int getId() {
        return this.id;
    }

    public Topic setId(int id) {
        this.id = id;
        return this;
    }
        
    public String getTitle() {
        return this.title;
    }

    public Topic setTitle(String title) {
        this.title = title;
        return this;
    }
        
    public String getContent() {
        return this.content;
    }

    public Topic setContent(String content) {
        this.content = content;
        return this;
    }
        
    public int getScore() {
        return this.score;
    }

    public Topic setScore(int score) {
        this.score = score;
        return this;
    }
        
    public String getPrompt() {
        return this.prompt;
    }

    public Topic setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
        
    public int getPathId() {
        return this.pathId;
    }

    public Topic setPathId(int pathId) {
        this.pathId = pathId;
        return this;
    }
        
    public int getType() {
        return this.type;
    }

    public Topic setType(int type) {
        this.type = type;
        return this;
    }
        
    public int getRandom() {
        return this.random;
    }

    public Topic setRandom(int random) {
        this.random = random;
        return this;
    }
        
    public String getAnswer() {
        return this.answer;
    }

    public Topic setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

}
