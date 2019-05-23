package com.example.blogs.domain.po;

import java.util.Date;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/17 3:48 PM
 * @since JDK 1.8
 */
public class UserPO {
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
     * 是否上锁
     */
    private Boolean locked;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 角色
     */
    private Integer userRole;
    /**
     * 角色名字
     */
    private String roleName;
    /**
     * 角色描述
     */
    private String roleDescription;
    /**
     * 权限id
     */
    private Integer permissionId;
    /**
     * 权限名字
     */
    private String permissionName;
    /**
     * 权限描述
     */
    private String permissionDescription;
    /**
     * 身份证
     */
    private String userIdCard;
    /**
     * 真实姓名
     */
    private String userRealName;

    public UserPO() {
    }

    public UserPO(Integer userId, String userName, String userSex, String userPhone, String userMail, String userPassword, Boolean locked, Date createTime, Date updateTime, Integer userRole, String roleName, String roleDescription, Integer permissionId, String permissionName, String permissionDescription, String userIdCard, String userRealName) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userMail = userMail;
        this.userPassword = userPassword;
        this.locked = locked;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.userRole = userRole;
        this.roleName = roleName;
        this.roleDescription = roleDescription;
        this.permissionId = permissionId;
        this.permissionName = permissionName;
        this.permissionDescription = permissionDescription;
        this.userIdCard = userIdCard;
        this.userRealName = userRealName;
    }

    @Override
    public String toString() {
        return "UserPO{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", locked=" + locked +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", userRole=" + userRole +
                ", roleName='" + roleName + '\'' +
                ", roleDescription='" + roleDescription + '\'' +
                ", permissionId=" + permissionId +
                ", permissionName='" + permissionName + '\'' +
                ", permissionDescription='" + permissionDescription + '\'' +
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

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUserRole() {
        return userRole;
    }

    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription;
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
