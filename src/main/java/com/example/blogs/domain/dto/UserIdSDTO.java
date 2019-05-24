package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 8:50 PM
 * @since JDK 1.8
 */
public class UserIdSDTO {
    private String userSendId;
    private String userReceiveId;

    public UserIdSDTO() {
    }

    public UserIdSDTO(String userSendId, String userReceiveId) {
        this.userSendId = userSendId;
        this.userReceiveId = userReceiveId;
    }

    @Override
    public String toString() {
        return "UserIdSDTO{" +
                "userSendId=" + userSendId +
                ", userReceiveId=" + userReceiveId +
                '}';
    }

    public String getUserSendId() {
        return userSendId;
    }

    public void setUserSendId(String userSendId) {
        this.userSendId = userSendId;
    }

    public String getUserReceiveId() {
        return userReceiveId;
    }

    public void setUserReceiveId(String userReceiveId) {
        this.userReceiveId = userReceiveId;
    }
}
