package com.example.blogs.domain.dto;

public class BlogsDTO {
    private String blogsName;
    private String blogsRemark;
    private String blogsImg;
    private String blogsUserid;

    public BlogsDTO(String blogsName, String blogsRemark, String blogsImg, String blogsUserid) {
        this.blogsName = blogsName;
        this.blogsRemark = blogsRemark;
        this.blogsImg = blogsImg;
        this.blogsUserid = blogsUserid;
    }

    @Override
    public String toString() {
        return "BlogsDTO{" +
                "blogsName='" + blogsName + '\'' +
                ", blogsRemark='" + blogsRemark + '\'' +
                ", blogsImg='" + blogsImg + '\'' +
                ", blogsUserid='" + blogsUserid + '\'' +
                '}';
    }

    public String getBlogsName() {
        return blogsName;
    }

    public void setBlogsName(String blogsName) {
        this.blogsName = blogsName;
    }

    public String getBlogsRemark() {
        return blogsRemark;
    }

    public void setBlogsRemark(String blogsRemark) {
        this.blogsRemark = blogsRemark;
    }

    public String getBlogsImg() {
        return blogsImg;
    }

    public void setBlogsImg(String blogsImg) {
        this.blogsImg = blogsImg;
    }

    public String getBlogsUserid() {
        return blogsUserid;
    }

    public void setBlogsUserid(String blogsUserid) {
        this.blogsUserid = blogsUserid;
    }
}
