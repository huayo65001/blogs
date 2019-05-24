package com.example.blogs.mapper;

import com.example.blogs.domain.dto.UpdateUserInfoDTO;
import com.example.blogs.domain.dto.UserDTO;
import com.example.blogs.domain.dto.UserIconDTO;
import com.example.blogs.domain.po.UserPO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/4/15 11:34 PM
 * @since JDK 1.8
 */
@Mapper
public interface UserMapper {
    /**
     * 根据用户名跟密码
     * @param userName
     * @return
     */
    @Select("select user_password from users where user_name = #{userName}")
    String getPasswordByName(String userName);

    /**
     * 根据用户名字查询用户
     * @param userName
     * @return
     */
    @Select("select u.user_id, u.user_name, u.user_sex, u.user_phone, u.user_mail, u.user_password, u.locked, u.create_time,u.update_time,u.user_role,r.role_name,r.role_description,p.permission_id,p.permission_name,p.permission_description,u.user_id_card,u.user_real_name from users as u,role as r,permissions as p where r.role_id = u.user_role and u.user_name = #{userName} and r.permission_id = p.permission_id")
    UserPO findByUserName(String userName);

    /**
     * 插入用户
     * @param userDTO
     * @return
     */
    @Insert("insert into users(user_name, user_sex, user_phone, user_mail, user_password,user_role,user_id_card,user_real_name) " +
            "values(#{userName}, #{userSex}, #{userPhone}, #{userMail}, #{userPassword},#{userRole},#{userIdCard},#{userRealName})")
    boolean addUser(UserDTO userDTO);

    /**
     * 根据用户id删除用户
     * @param userId
     * @return
     */
    @Delete("delete from users where user_id = #{userId}")
    boolean deleteUser(Integer userId);

    /**
     * 根据角色查询用户信息
     * @param userRoleId
     * @return
     */
    @Select("select u.user_id, u.user_name, u.user_sex, u.user_phone, u.user_mail, u.user_password, u.locked, u.create_time,u.update_time,u.user_role,r.role_name,r.role_description,p.permission_id,p.permission_name,p.permission_description,u.user_id_card,u.user_real_name from users as u,role as r,permissions as p where r.role_id = u.user_role and r.permission_id = p.permission_id and r.role_id = #{userRoleId}")
    List<UserPO> findByRole(Integer userRoleId);

    /**
     * 更新用户
     * @param updateUserInfoDTO
     * @return
     */
    @Update("update users set user_sex = #{userSex},user_mail = #{userMail},user_password = #{userPassword},user_phone = #{userPhone},user_id_card = #{userIdCard},user_real_name = #{userRealName} where user_id = #{userId}")
    Boolean updateUserInfo(UpdateUserInfoDTO updateUserInfoDTO);


    @Select("select u.user_id, u.user_name, u.user_sex, u.user_phone, u.user_mail, u.user_password, u.locked, u.create_time,u.update_time,u.user_role,r.role_name,r.role_description,p.permission_id,p.permission_name,p.permission_description,u.user_id_card,u.user_real_name from users as u,role as r,permissions as p where r.role_id = u.user_role and r.permission_id = p.permission_id")
    List<UserPO> findAllUser();

    @Select("select u.user_id, u.user_name, u.user_sex, u.user_phone, u.user_mail, u.user_password, u.locked, u.create_time,u.update_time,u.user_role,r.role_name,r.role_description,p.permission_id,p.permission_name,p.permission_description,u.user_id_card,u.user_real_name from users as u,role as r,permissions as p where r.role_id = u.user_role and r.permission_id = p.permission_id and u.user_id = #{shopMasterId}")
    UserPO findByUserId(Integer shopMasterId);

    @Select("select user_id_card from users where user_id = #{userId}")
    String isAuth(Integer userId);

    @Delete("delete from users_icon where user_id = #{userId}")
    Boolean deleteIcon(Integer userId);

    @Insert("insert into users_icon(user_id,user_icon) values(#{userId},#{userIcon})")
    boolean addIcon(UserIconDTO userIconDTO);

    @Select("select user_id,user_icon from users_icon where user_id = #{userId}")
    UserIconDTO findUserIcon(Integer userId);
}
