package com.example.blogs.service;

import com.example.blogs.domain.po.AttblogsPO;
import com.example.blogs.domain.po.BlogsPO;
import com.example.blogs.mapper.AttBlogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttBlogsService  {
    @Autowired
    private AttBlogsMapper attBlogsMapper;
    public List<BlogsPO> obtainAttBlogs(String userPhone){
        return attBlogsMapper.obtainAttBlogs(userPhone);
    }
    public Boolean addAttBlogs(AttblogsPO attblogsPO){
        return attBlogsMapper.addAttBlogs(attblogsPO);
    }
    public Boolean deleteAttBlogs(AttblogsPO attblogsPO){
        return attBlogsMapper.deleteAttBlogs(attblogsPO);
    }
    public Integer queryAttBlogsSum(String userPhone){
        return attBlogsMapper.queryAttBlogsSum(userPhone);
    }
}
