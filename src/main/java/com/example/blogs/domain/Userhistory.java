package com.example.blogs.domain;


public class Userhistory {

    private long historyId;
    private String userId;
    private long postbarId;


    public long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(long historyId) {
        this.historyId = historyId;
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
