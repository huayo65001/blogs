package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.dto.PostBarInfoDTO;
import com.example.blogs.domain.po.PostbarinfoPO;
import com.example.blogs.domain.po.UserPO;
import com.example.blogs.service.PostBarInfoService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postbarinfo")
@ApiModel(description = "帖子管理模块")
public class PostBarInfoController {
    @Autowired
    private PostBarInfoService postBarInfoService;

    @PostMapping("/getpostbarinfolist")
    @ApiOperation(value = "根据用户查询帖子", httpMethod = "POST", response = ResponseEntity.class)
    public Result getPostBarInfoListByUser(@RequestBody UserPO userPO) {
        return ResultGenerator.genSuccessResult(postBarInfoService.getPostBarInfoListByUser(userPO.getUserPhone()));
    }

    @PostMapping("/getallpostbarinfolist")
    @ApiOperation(value = "查询所有帖子", httpMethod = "POST", response = ResponseEntity.class)
    public Result getAllPostBarInfoList(@RequestParam int pageIndex) {
        return ResultGenerator.genSuccessResult(postBarInfoService.getAllPostBarInfoList(pageIndex));
    }

    @PostMapping("/getpostbarinfolistbycontent")
    @ApiOperation(value = "根据帖子内容模糊查询", httpMethod = "POST", response = ResponseEntity.class)
    public Result getPostBarInfoByContent(@RequestBody PostbarinfoPO postbarinfoPO) {
        return ResultGenerator.genSuccessResult(postBarInfoService.getPostBarInfoListByContent(postbarinfoPO.getPostbarContent()));
    }

    @PostMapping("/addpostbarinfo")
    @ApiOperation(value = "添加帖子", httpMethod = "POST", response = ResponseEntity.class)
    public Result addPostBarInfo(@RequestBody PostBarInfoDTO postbarinfoDTO) {
        try {
            postBarInfoService.addPostBarInfo(postbarinfoDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }

    @PostMapping("/removepostbarinfo")
    @ApiOperation(value = "删除帖子", httpMethod = "POST", response = ResponseEntity.class)
    public Result removePostBarInfo(@RequestBody PostbarinfoPO postbarinfoPO) {
        postBarInfoService.removePostBarInfo(postbarinfoPO.getPostbarId());
        return ResultGenerator.genSuccessResult("");
    }

    @PostMapping("/modifypostbarinfo")
    @ApiOperation(value = "修改帖子", httpMethod = "POST", response = ResponseEntity.class)
    public Result modifyPostBarInfo(@RequestBody PostbarinfoPO postbarinfoPO) {
        postBarInfoService.modifyPostBarInfo(postbarinfoPO);
        return ResultGenerator.genSuccessResult("");
    }
}
