package com.example.blogs.controller;

import com.example.blogs.service.AttBlogsService;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 8:46 PM
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/attBlogs")
@ApiModel(description = "关注帖吧管理模块")
public class AttBlogsController {

    @Autowired
    private AttBlogsService attBlogsService;


}
