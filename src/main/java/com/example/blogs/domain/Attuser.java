package com.example.blogs.domain;


public class Attuser {

  private long attId;
  private String userAttId;
  private String userAttedId;


  public long getAttId() {
    return attId;
  }

  public void setAttId(long attId) {
    this.attId = attId;
  }


  public String getUserAttId() {
    return userAttId;
  }

  public void setUserAttId(String userAttId) {
    this.userAttId = userAttId;
  }


  public String getUserAttedId() {
    return userAttedId;
  }

  public void setUserAttedId(String userAttedId) {
    this.userAttedId = userAttedId;
  }

}
