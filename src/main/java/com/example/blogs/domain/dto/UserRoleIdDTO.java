package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/17 3:47 PM
 * @since JDK 1.8
 */
public class UserRoleIdDTO {
    private Integer userRoleId;

    public UserRoleIdDTO() {
    }

    public UserRoleIdDTO(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Override
    public String toString() {
        return "UserRoleIdDTO{" +
                "userRoleId=" + userRoleId +
                '}';
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }
}
