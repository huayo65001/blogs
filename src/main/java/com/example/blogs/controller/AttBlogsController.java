package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultCode;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.dto.UserIdSDTO;
import com.example.blogs.domain.dto.UserPhoneDTO;
import com.example.blogs.domain.po.AttblogsPO;
import com.example.blogs.domain.po.BlogsPO;
import com.example.blogs.domain.po.UserinfoPO;
import com.example.blogs.service.AttBlogsService;
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
 * Date: 2019/5/24 8:46 PM
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/attBlogs")
@ApiModel(description = "关注帖吧管理模块")
public class AttBlogsController {

    @Autowired
    private AttBlogsService attBlogsService;

    /**
     * 根据用户编号查询关注的贴吧的详细信息
     * @return
     */
    @ApiOperation(value = "根据用户编号查询关注的贴吧的详细信息", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/obtainAttBlogs")
    public Result obtainAttBlogs(@RequestBody UserPhoneDTO userPhoneDTO){
        List<BlogsPO> list = attBlogsService.obtainAttBlogs(userPhoneDTO.getUserPhone());
        if(list!=null&&list.size()>0){
            return ResultGenerator.genSuccessResult(list);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);

    }
    /**
     * 某用户关注某吧
     * @return
     */
    @ApiOperation(value = "某用户关注某吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/addAttBlogs")
    public Result addAttBlogs(@RequestBody AttblogsPO attblogsPO){
        if(attBlogsService.addAttBlogs(attblogsPO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
    /**
     * 查看被关注的用户的详细信息
     * @return
     */
    @ApiOperation(value = "删除关注的贴吧", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/deleteAttBlogs")
    public Result deleteAttBlogs(@RequestBody AttblogsPO attblogsPO){
        if(attBlogsService.deleteAttBlogs(attblogsPO)){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    /**
     * 查询用户关注的贴吧数目
     * @return
     */
    @ApiOperation(value = "查询用户关注的贴吧数目", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/queryAttBlogsSum")
    public Result queryAttBlogsSum(@RequestBody UserPhoneDTO userPhoneDTO){
        Integer i = attBlogsService.queryAttBlogsSum(userPhoneDTO.getUserPhone());
        if(i!=null){
            return ResultGenerator.genSuccessResult(i);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }


}
