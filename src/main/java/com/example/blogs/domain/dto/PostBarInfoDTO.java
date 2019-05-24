package com.example.blogs.domain.dto;

public class PostBarInfoDTO {
    private String postbarUserid;
    private String postbarContent;
    private long postbarLocation;
    private String postbarImg;

    public PostBarInfoDTO(String postbarUserid, String postbarContent, long postbarLocation, String postbarImg) {
        this.postbarUserid = postbarUserid;
        this.postbarContent = postbarContent;
        this.postbarLocation = postbarLocation;
        this.postbarImg = postbarImg;
    }

    @Override
    public String toString() {
        return "PostBarInfoDTO{" +
                "postbarUserid='" + postbarUserid + '\'' +
                ", postbarContent='" + postbarContent + '\'' +
                ", postbarLocation=" + postbarLocation +
                ", postbarImg='" + postbarImg + '\'' +
                '}';
    }

    public String getPostbarUserid() {
        return postbarUserid;
    }

    public void setPostbarUserid(String postbarUserid) {
        this.postbarUserid = postbarUserid;
    }

    public String getPostbarContent() {
        return postbarContent;
    }

    public void setPostbarContent(String postbarContent) {
        this.postbarContent = postbarContent;
    }

    public long getPostbarLocation() {
        return postbarLocation;
    }

    public void setPostbarLocation(long postbarLocation) {
        this.postbarLocation = postbarLocation;
    }

    public String getPostbarImg() {
        return postbarImg;
    }

    public void setPostbarImg(String postbarImg) {
        this.postbarImg = postbarImg;
    }
}
