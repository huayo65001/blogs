package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/18 7:58 PM
 * @since JDK 1.8
 */
public class UpdateUserInfoDTO {

    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 性别
     */
    private String userSex;
    /**
     * 手机号
     */
    private String userPhone;
    /**
     * 邮箱
     */
    private String userMail;
    /**
     * 密码
     */
    private String userPassword;
    /**
     * 身份证
     */
    private String userIdCard;
    /**
     * 真实姓名
     */
    private String userRealName;

    public UpdateUserInfoDTO() {
    }

    public UpdateUserInfoDTO(Integer userId, String userSex, String userPhone, String userMail, String userPassword, String userIdCard, String userRealName) {
        this.userId = userId;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.userIdCard = userIdCard;
        this.userRealName = userRealName;
    }

    @Override
    public String toString() {
        return "UpdateUserInfoDTO{" +
                "userId=" + userId +
                ", userSex='" + userSex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userIdCard='" + userIdCard + '\'' +
                ", userRealName='" + userRealName + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }
}
