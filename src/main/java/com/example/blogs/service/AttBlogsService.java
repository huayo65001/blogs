package com.example.blogs.service;

import com.example.blogs.mapper.AttBlogsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttBlogsService  {
    @Autowired
    private AttBlogsMapper attBlogsMapper;

}
