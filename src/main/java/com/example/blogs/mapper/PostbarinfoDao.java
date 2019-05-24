package com.example.blogs.mapper;

import com.example.blogs.domain.po.PostbarinfoPO;

import java.util.List;

public interface PostbarinfoDao {

    List<PostbarinfoPO> query();

    List<PostbarinfoPO> queryUserid(String userid);

    int addPostbarinfo(PostbarinfoPO postbarinfo);

    int updatePostbarinfo(PostbarinfoPO postbarinfo);

    int deletePostbarinfo(PostbarinfoPO postbarinfo);


}
