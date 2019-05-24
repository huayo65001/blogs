package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.po.UsercollectPO;
import com.example.blogs.service.UserCollectService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usercollect")
@ApiModel(description = "用户收藏管理模块")
public class UserCollectController {
    @Autowired
    private UserCollectService userCollectService;

    @PostMapping("/getusercollectlist")
    @ApiOperation(value = "查询用户收藏列表", httpMethod = "POST", response = ResponseEntity.class)
    public Result getUserCollectList(@RequestParam String userPhone) {
        return ResultGenerator.genSuccessResult(userCollectService.getUserCollectList(userPhone));
    }

    @PostMapping("/addusercollect")
    @ApiOperation(value = "用户添加收藏", httpMethod = "POST", response = ResponseEntity.class)
    public Result addUserCollect(@RequestBody UsercollectPO usercollectPO) {
        try {
            userCollectService.addUserCollect(usercollectPO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }


}
