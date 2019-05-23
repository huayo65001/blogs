package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/17 3:40 PM
 * @since JDK 1.8
 */
public class UserDTO {
    /**
     * 用户id
     */
    private Integer userId;
    /**、
     * 用户姓名
     */
    private String userName;
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
     * 角色
     */
    private Integer userRole;
    /**
     * 身份证
     */
    private String userIdCard;
    /**
     * 真实姓名
     */
    private String userRealName;

    public UserDTO() {
    }

    public UserDTO(Integer userId, String userName, String userSex, String userPhone, String userMail, String userPassword, Integer userRole, String userIdCard, String userRealName) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.userRole = userRole;
        this.userIdCard = userIdCard;
        this.userRealName = userRealName;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userRole=" + userRole +
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
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
