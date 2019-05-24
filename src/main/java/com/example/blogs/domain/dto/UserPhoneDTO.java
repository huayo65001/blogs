package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 7:00 PM
 * @since JDK 1.8
 */
public class UserPhoneDTO {
    private String userPhone;

    public UserPhoneDTO() {
    }

    public UserPhoneDTO(String userPhone) {
        this.userPhone = userPhone;
    }

    @Override
    public String toString() {
        return "UserPhoneDTO{" +
                "userPhone='" + userPhone + '\'' +
                '}';
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
