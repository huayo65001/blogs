package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/22 1:07 AM
 * @since JDK 1.8
 */
public class UserIdCardAndNameDTO {
    private Integer userId;
    private String userIdCard;
    private String userName;

    public UserIdCardAndNameDTO() {
    }

    public UserIdCardAndNameDTO(Integer userId, String userIdCard, String userName) {
        this.userId = userId;
        this.userIdCard = userIdCard;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserIdCardAndNameDTO{" +
                "userId=" + userId +
                ", userIdCard='" + userIdCard + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
