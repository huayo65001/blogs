package com.example.blogs.mapper;

import com.example.blogs.domain.po.UserinfoPO;

import java.util.List;

public interface UserInfoDao {

    List<UserinfoPO> getAttUser(String userid);

    List<UserinfoPO> getAttedUser(String userid);

    UserinfoPO login(String userid, String password);

    int updateUserinfo(UserinfoPO userinfo);
}
