package com.example.blogs.mapper;

import com.example.blogs.domain.po.BlogsPO;

import java.util.List;

public interface BlogsDao {


    List<BlogsPO> queryFuzzyBlogs(String blogsName);
    BlogsPO queryBlogs(String userName);
    List<BlogsPO> query();
    List<BlogsPO> queryUseridBlogs(String userid);
}
