package com.example.blogs.domain;

import java.util.List;

public interface UserInfoDao {

    List<Userinfo> getAttUser(String userid);

    List<Userinfo> getAttedUser(String userid);

    Userinfo login(String userid,String password);

    int updateUserinfo(Userinfo userinfo);
}
