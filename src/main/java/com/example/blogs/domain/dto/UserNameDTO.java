package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/17 3:54 PM
 * @since JDK 1.8
 */
public class UserNameDTO {
    private String userName;

    public UserNameDTO() {
    }

    public UserNameDTO(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserNameDTO{" +
                "userName='" + userName + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
