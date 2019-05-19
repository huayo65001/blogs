package com.example.blogs.domain;

import java.util.List;

public interface BlogsDao {
    List<Blogs> queryFuzzyBlogs(String blogsName);
    Blogs queryBlogs(String userName);
    List<Blogs> query();
    List<Blogs> queryUseridBlogs(String userid);
}
