package com.example.blogs.domain;


public class Reply {

  private long replyId;
  private String replyCreateuserid;
  private String replyFirstuserid;
  private String firstusername;
  private String replySeconduserid;
  private String secondname;
  private String replyContent;
  private long replyLocation;
  private long replyLikesum;
  private long replyUnlikesum;


  public long getReplyId() {
    return replyId;
  }

  public void setReplyId(long replyId) {
    this.replyId = replyId;
  }


  public String getReplyCreateuserid() {
    return replyCreateuserid;
  }

  public void setReplyCreateuserid(String replyCreateuserid) {
    this.replyCreateuserid = replyCreateuserid;
  }


  public String getReplyFirstuserid() {
    return replyFirstuserid;
  }

  public void setReplyFirstuserid(String replyFirstuserid) {
    this.replyFirstuserid = replyFirstuserid;
  }


  public String getFirstusername() {
    return firstusername;
  }

  public void setFirstusername(String firstusername) {
    this.firstusername = firstusername;
  }


  public String getReplySeconduserid() {
    return replySeconduserid;
  }

  public void setReplySeconduserid(String replySeconduserid) {
    this.replySeconduserid = replySeconduserid;
  }


  public String getSecondname() {
    return secondname;
  }

  public void setSecondname(String secondname) {
    this.secondname = secondname;
  }


  public String getReplyContent() {
    return replyContent;
  }

  public void setReplyContent(String replyContent) {
    this.replyContent = replyContent;
  }


  public long getReplyLocation() {
    return replyLocation;
  }

  public void setReplyLocation(long replyLocation) {
    this.replyLocation = replyLocation;
  }


  public long getReplyLikesum() {
    return replyLikesum;
  }

  public void setReplyLikesum(long replyLikesum) {
    this.replyLikesum = replyLikesum;
  }


  public long getReplyUnlikesum() {
    return replyUnlikesum;
  }

  public void setReplyUnlikesum(long replyUnlikesum) {
    this.replyUnlikesum = replyUnlikesum;
  }

}
