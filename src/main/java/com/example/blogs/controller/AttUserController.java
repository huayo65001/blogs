package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultCode;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.dto.*;
import com.example.blogs.domain.po.UserinfoPO;
import com.example.blogs.service.AttUserService;
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
@RequestMapping("/attUsers")
@ApiModel(description = "关注用户管理模块")
public class AttUserController {
    @Autowired
    private AttUserService attUserService;
    /**
     * 添加贴吧
     * @param userIdSDTO
     * @return
     */
    @ApiOperation(value = "某用户关注某用户", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/addAttUser")
    public Result addAttUser(@RequestBody UserIdSDTO userIdSDTO){
        if(attUserService.addAttUser(userIdSDTO.getUserSendId(),userIdSDTO.getUserReceiveId())){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genSuccessResult("某用户关注某用户失败");

    }
    /**
     * 删除某用户关注某用户
     * @return
     */
    @ApiOperation(value = "删除某用户关注某用户", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/deleteAttUser")
    public Result deleteAttUser(@RequestBody UserIdSDTO userIdSDTO){
        if(attUserService.deleteAttUser(userIdSDTO.getUserSendId(),userIdSDTO.getUserReceiveId())){
            return ResultGenerator.genSuccessResult();
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
    /**
     * 查看被关注的用户的详细信息
     * @param userPhoneDTO
     * @return
     */
    @ApiOperation(value = "查看被关注的用户的详细信息", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/queryattedUser")
    public Result queryattedUser(@RequestBody UserPhoneDTO userPhoneDTO){
        List<UserinfoPO> pos =  attUserService.queryattedUser(userPhoneDTO.getUserPhone());
        if(pos!=null&&pos.size()>0){
            return ResultGenerator.genSuccessResult(pos);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    /**
     * 查看关注的用户的详细信息
     * @return
     */
    @ApiOperation(value = "查看关注的用户的详细信息", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/queryattUser")
    public Result queryattUser(@RequestBody UserPhoneDTO userPhoneDTO){
        List<UserinfoPO> pos = attUserService.queryattUser(userPhoneDTO.getUserPhone());
        if(pos!=null&&pos.size()>0){
            return ResultGenerator.genSuccessResult(pos);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }

    /**
     * 查看用户的粉丝数量
     * @return
     */
    @ApiOperation(value = "查看用户的粉丝数量", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/queryAttedSum")
    public Result queryAttedSum(@RequestBody UserPhoneDTO userPhoneDTO){
        Integer num = attUserService.queryAttedSum(userPhoneDTO.getUserPhone());
        if(num!=null){
            return ResultGenerator.genSuccessResult(num);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
    /**
     * 查看某用户关注量
     * @return
     */
    @ApiOperation(value = "查看某用户关注量", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/queryAttSum")
    public Result queryAttSum(@RequestBody UserPhoneDTO userPhoneDTO){
        Integer num = attUserService.queryAttSum(userPhoneDTO.getUserPhone());
        if(num!=null){
            return ResultGenerator.genSuccessResult(num);
        }
        return ResultGenerator.genSuccessResult(ResultCode.NONE_DATA);
    }
}
