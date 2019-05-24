package com.example.blogs.domain.dto;

public class ImgDTO {

    private long postbarImgId;
    private String postbarImg;

    public ImgDTO(long postbarImgId, String postbarImg) {
        this.postbarImgId = postbarImgId;
        this.postbarImg = postbarImg;
    }

    @Override
    public String toString() {
        return "ImgDTO{" +
                "postbarImgId=" + postbarImgId +
                ", postbarImg='" + postbarImg + '\'' +
                '}';
    }

    public long getPostbarImgId() {
        return postbarImgId;
    }

    public void setPostbarImgId(long postbarImgId) {
        this.postbarImgId = postbarImgId;
    }

    public String getPostbarImg() {
        return postbarImg;
    }

    public void setPostbarImg(String postbarImg) {
        this.postbarImg = postbarImg;
    }
}
