package com.example.blogs.domain;

public class Usercollect {

    private long collectId;
    private String userId;
    private long postbarId;


    public long getCollectId() {
        return collectId;
    }

    public void setCollectId(long collectId) {
        this.collectId = collectId;
    }


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public long getPostbarId() {
        return postbarId;
    }

    public void setPostbarId(long postbarId) {
        this.postbarId = postbarId;
    }

}