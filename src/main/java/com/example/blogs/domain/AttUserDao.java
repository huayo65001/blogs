package com.example.blogs.domain;

import java.util.List;

public interface AttUserDao {
    int queryAttSum(String userid);

    int queryAttedSum(String userid);

    List<Attuser> queryattUser(String userid);

    List<Attuser> queryattedUser(String userid);

    int addAttUser(Attuser attuser);

    int deleteAttUser(Attuser attuser);

}
