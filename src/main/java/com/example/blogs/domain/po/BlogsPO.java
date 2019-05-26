package com.example.blogs.domain.po;


public class BlogsPO {

  private long blogsInfoId;
  private String blogsName;
  private String blogsRemark;
  private String blogsImg;
  private long blogsPostbarSum;
  private String blogsUserid;
  private long blogsFlag;

  public long getBlogsFlag() {
    return blogsFlag;
  }

  public void setBlogsFlag(long blogsFlag) {
    this.blogsFlag = blogsFlag;
  }

  public long getBlogsInfoId() {
    return blogsInfoId;
  }

  public void setBlogsInfoId(long blogsInfoId) {
    this.blogsInfoId = blogsInfoId;
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


  public long getBlogsPostbarSum() {
    return blogsPostbarSum;
  }

  public void setBlogsPostbarSum(long blogsPostbarSum) {
    this.blogsPostbarSum = blogsPostbarSum;
  }


  public String getBlogsUserid() {
    return blogsUserid;
  }

  public void setBlogsUserid(String blogsUserid) {
    this.blogsUserid = blogsUserid;
  }

}
