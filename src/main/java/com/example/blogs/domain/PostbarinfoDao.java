package com.example.blogs.domain;

import java.util.List;

public interface PostbarinfoDao {

    List<Postbarinfo> query();

    List<Postbarinfo> queryUserid(String userid);

    int addPostbarinfo(Postbarinfo postbarinfo);

    int updatePostbarinfo(Postbarinfo postbarinfo);

    int deletePostbarinfo(Postbarinfo postbarinfo);


}
