package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.po.UsercollectPO;
import com.example.blogs.domain.po.UserhistoryPO;
import com.example.blogs.service.UserCollectService;
import com.example.blogs.service.UserHistoryService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userhistory")
@ApiModel(description = "用户历史管理模块")
public class UserHistoryController {
    @Autowired
    private UserHistoryService userHistoryService;

    @PostMapping("/getuserhistorylist")
    @ApiOperation(value = "查询用户历史列表", httpMethod = "POST", response = ResponseEntity.class)
    public Result getUserHistoryList(@RequestParam String userPhone) {
        return ResultGenerator.genSuccessResult(userHistoryService.getUserHistoryList(userPhone));
    }

    @PostMapping("/adduserhitory")
    @ApiOperation(value = "用户添加历史记录", httpMethod = "POST", response = ResponseEntity.class)
    public Result addUserHitory(@RequestBody UserhistoryPO userhistoryPO) {
        try {
            userHistoryService.addUserHitory(userhistoryPO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }


}
