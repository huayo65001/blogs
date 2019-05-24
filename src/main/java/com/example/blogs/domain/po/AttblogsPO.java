package com.example.blogs.domain.po;


public class AttblogsPO {

  private long attblogsId;
  private String userAttId;
  private long blogsAttedId;


  public long getAttblogsId() {
    return attblogsId;
  }

  public void setAttblogsId(long attblogsId) {
    this.attblogsId = attblogsId;
  }


  public String getUserAttId() {
    return userAttId;
  }

  public void setUserAttId(String userAttId) {
    this.userAttId = userAttId;
  }


  public long getBlogsAttedId() {
    return blogsAttedId;
  }

  public void setBlogsAttedId(long blogsAttedId) {
    this.blogsAttedId = blogsAttedId;
  }

}
