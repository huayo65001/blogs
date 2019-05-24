package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.dto.UpdateReplySumDTO;
import com.example.blogs.domain.po.ReplyPO;
import com.example.blogs.service.ReplyService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reply")
@ApiModel(description = "回复管理模块")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @PostMapping("/getrepaylistbyuser")
    @ApiOperation(value = "根据用户查询回复", httpMethod = "POST", response = ResponseEntity.class)
    public Result getRepayListByUser(@RequestParam String userPhone) {
        return ResultGenerator.genSuccessResult(replyService.getReplyListByUser(userPhone));
    }

    @PostMapping("/getrepaylistbylocation")
    @ApiOperation(value = "根据帖子查询回复", httpMethod = "POST", response = ResponseEntity.class)
    public Result getRepayListByLocation(@RequestParam int location) {
        return ResultGenerator.genSuccessResult(replyService.getReplyListByLocation(location));
    }

    @PostMapping("/addrepay")
    @ApiOperation(value = "添加回复", httpMethod = "POST", response = ResponseEntity.class)
    public Result addRepay(@RequestBody ReplyPO reply) {
        try {
            replyService.addReply(reply);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }

    @PostMapping("/removereply")
    @ApiOperation(value = "删除回复", httpMethod = "POST", response = ResponseEntity.class)
    public Result removePostBarInfo(@RequestParam int replyId) {
        try {
            replyService.removeReply(replyId);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }
    @PostMapping("/modifyrepayunlikesum")
    @ApiOperation(value = "取消点赞回复", httpMethod = "POST", response = ResponseEntity.class)
    public Result modifyRepayUnlikeSum(@RequestBody UpdateReplySumDTO updateReplySumDTO) {
        try {
            replyService.modifyRepayUnlikeSum(updateReplySumDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }
    @PostMapping("/modifyrepaylikesum")
    @ApiOperation(value = "点赞回复", httpMethod = "POST", response = ResponseEntity.class)
    public Result modifyReplyLikeSum(@RequestBody UpdateReplySumDTO updateReplySumDTO) {
        try {
            replyService.modifyReplyLikeSum(updateReplySumDTO);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultGenerator.genFailResult(e.getMessage());
        }
        return ResultGenerator.genSuccessResult("");
    }
}
