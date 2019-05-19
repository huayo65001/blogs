package com.example.blogs.domain;

import java.util.List;

public interface AttBlogsDao {
    int queryAttBlogsSum(String userid);

    int queryAttedBlogsSum(String usrid);

    int addAttBlogs(Attblogs attblogs);

    int deleteAttBlogs(Attblogs attblogs);

    List<Attblogs> queryAttBlogs(String userid);
}
