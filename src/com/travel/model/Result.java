package com.travel.model;

import java.io.Serializable;

public class Result implements Serializable {

    private static final long serialVersionUID = -465692344735333451L;
    private int id;
    private int topicId;
    private String content;
        
    public int getId() {
        return this.id;
    }

    public Result setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getTopicId() {
        return this.topicId;
    }

    public Result setTopicId(int topicId) {
        this.topicId = topicId;
        return this;
    }
        
    public String getContent() {
        return this.content;
    }

    public Result setContent(String content) {
        this.content = content;
        return this;
    }

}
