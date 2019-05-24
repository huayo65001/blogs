package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 3:59 PM
 * @since JDK 1.8
 */
public class UserIconDTO {
    private Integer userId;
    private String userIcon;

    public UserIconDTO() {
    }

    public UserIconDTO(Integer userId, String userIcon) {
        this.userId = userId;
        this.userIcon = userIcon;
    }

    @Override
    public String toString() {
        return "UserIconDTO{" +
                "userId=" + userId +
                ", userIcon='" + userIcon + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(String userIcon) {
        this.userIcon = userIcon;
    }
}
