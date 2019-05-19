package com.example.blogs.domain;

import java.util.List;

public interface UsercollectDao {

    List<Usercollect> queryUserid(String userid);

    int addUsercollect(Usercollect usercollect);

    int deleteUsercollect(Usercollect usercollect);


}