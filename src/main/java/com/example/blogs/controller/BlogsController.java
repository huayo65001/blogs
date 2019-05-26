package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultCode;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.dto.*;
import com.example.blogs.domain.po.BlogsPO;
import com.example.blogs.domain.po.UserPO;
import com.example.blogs.service.BlogsService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 4:13 PM
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/blogs")
@ApiModel(description = "帖吧管理模块")
public class BlogsController {

    @Autowired
    private BlogsService blogsService;
    /**
     * 添加贴吧
     * @param blogsDTO
     * @return
     */
    @ApiOperation(value = "添加贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/addBlogs")
    public Result addBlogs(@RequestBody BlogsDTO blogsDTO){
        if(blogsService.findByName(blogsDTO.getBlogsName())!=null){
            return ResultGenerator.genSuccessResult("贴吧已经存在");
        }
        if(blogsService.addBlogs(blogsDTO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genSuccessResult("添加贴吧失败");
    }
    /**
     * 根据名字模糊查询贴吧
     * @param blogsNameDTO
     * @return
     */
    @ApiOperation(value = "根据名字模糊查询贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/findBlogsByBlogsName")
    public Result findBlogsByBlogsName(@RequestBody BlogsNameDTO blogsNameDTO){
        List<BlogsPO> pos = blogsService.findBlogsByName(blogsNameDTO.getBlogsName());
        if(pos!=null&&pos.size()>0){
            return ResultGenerator.genSuccessResult(pos);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
    /**
     * 根据用户的手机号
     * @param userPhoneDTO
     * @return
     */
    @ApiOperation(value = "查询某用户创建的贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/findBlogsByUserPhone")
    public Result findBlogsByUserPhone(@RequestBody UserPhoneDTO userPhoneDTO){
        List<BlogsPO> pos = blogsService.findBlogsByUserPhone(userPhoneDTO.getUserPhone());
        if(pos!=null&&pos.size()>0){
            return ResultGenerator.genSuccessResult(pos);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    /**
     * 查询所有的贴吧
     * @return
     */
    @ApiOperation(value = "查询所有的贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/findAllBlogs")
    public Result findAllBlogs(){
        List<BlogsPO> pos = blogsService.findAllBlogs();
        if(pos!=null&&pos.size()>0){
            return ResultGenerator.genSuccessResult(pos);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    @ApiOperation(value = "查询所有未审核的贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/findAllBlogsunfy")
    public Result findAllBlogsUndenfy(){
        List<BlogsPO> pos = blogsService.findAllBlogs();
        if(pos!=null&&pos.size()>0){
            return ResultGenerator.genSuccessResult(pos);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    /**
     * 查询用户创建贴吧的数量
     * @return
     */
    @ApiOperation(value = "查询用户创建贴吧的数量", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/findBlogsNumByUser")
    public Result findBlogsNumByUser(@RequestBody UserPhoneDTO userPhoneDTO){
        Integer num = blogsService.findBlogsNumByUser(userPhoneDTO.getUserPhone());
        if(num!=null){
            return ResultGenerator.genSuccessResult(num);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
    /**
     * 删除贴吧
     * @param blogsIdDTO
     * @return
     */
    @ApiOperation(value = "删除贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/deleteBlogsById")
    public Result deleteBlogsById(@RequestBody BlogsIdDTO blogsIdDTO){
        if(blogsService.deleteBlogsById(blogsIdDTO.getBlogsId())){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genSuccessResult("删除贴吧失败");
    }
}
