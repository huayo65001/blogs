package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/17 3:45 PM
 * @since JDK 1.8
 */
public class UserIdDTO {
    private Integer userId;

    public UserIdDTO() {
    }

    public UserIdDTO(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserIdDTO{" +
                "userId=" + userId +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
