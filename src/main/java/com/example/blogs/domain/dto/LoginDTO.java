package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/17 3:08 PM
 * @since JDK 1.8
 */
public class LoginDTO {
    private String userName;
    private String password;

    public LoginDTO() {
    }

    public LoginDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
