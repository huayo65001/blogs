package com.example.blogs.domain;

import java.util.List;

public interface UserhistoryDao {
    List<Userhistory> queryUserid(String userid);

    int addUserhitory(Userhistory userhistory);

    int deleteUserhistory(Userhistory userhistory);

}
