package com.example.blogs.service;

import com.example.blogs.domain.dto.UpdateUserInfoDTO;
import com.example.blogs.domain.dto.UserDTO;
import com.example.blogs.domain.po.UserPO;
import com.example.blogs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/15 11:34 PM
 * @since JDK 1.8
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**\
     * 登陆校验
     * @param userName
     * @param password
     * @return
     */
    public UserPO login(String userName, String password) {

        String name = userName.trim();
        UserPO userPO = userMapper.findByUserName(name);
        if(userPO==null){
            return null;
        }
        if(password.equals(userPO.getUserPassword())){
            return userPO;
        }
        return null;

    }

    /**
     * 根据用户名字查询用户
     * @param userName
     * @return
     */
    public UserPO findByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    /**
     * 添加用户
     * @param userDTO
     * @return
     */
    public boolean addUser(UserDTO userDTO) {
        return userMapper.addUser(userDTO);
    }

    /**
     * 删除用户
     * @param userId
     * @return
     */
    public boolean deleteUser(Integer userId) {
        return userMapper.deleteUser(userId);
    }

    /**
     * 根据角色查询用户信息
     * @param userRoleId
     * @return
     */
    public List<UserPO> findByRole(Integer userRoleId) {
        return userMapper.findByRole(userRoleId);
    }

    /**
     * 更新用户
     * @param userDTO
     * @return
     */
    public boolean updateUser(UpdateUserInfoDTO userDTO) {
        return userMapper.updateUserInfo(userDTO);
    }
    public List<UserPO> findAllUser() {
        return userMapper.findAllUser();
    }

    public UserPO findByUserId(Integer shopMasterId) {
        return userMapper.findByUserId(shopMasterId);
    }


}
