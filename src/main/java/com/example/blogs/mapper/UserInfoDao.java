package com.example.blogs.mapper;

import com.example.blogs.domain.po.UserinfoPO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface UserInfoDao {

    List<UserinfoPO> getAttUser(String userid);

    List<UserinfoPO> getAttedUser(String userid);

    UserinfoPO login(String userid, String password);

    int updateUserinfo(UserinfoPO userinfo);
}
