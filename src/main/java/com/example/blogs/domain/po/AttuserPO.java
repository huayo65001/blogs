package com.example.blogs.domain.po;


public class AttuserPO {

  private long attId;
  private String userAttId;
  private String userAttedId;

  public AttuserPO(String userAttId, String userAttedId) {
    this.userAttId = userAttId;
    this.userAttedId = userAttedId;
  }

  public AttuserPO(long attId, String userAttId, String userAttedId) {
    this.attId = attId;
    this.userAttId = userAttId;
    this.userAttedId = userAttedId;
  }

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
