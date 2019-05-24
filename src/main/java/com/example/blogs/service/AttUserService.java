package com.example.blogs.service;

import com.example.blogs.domain.po.AttuserPO;
import com.example.blogs.domain.po.UserinfoPO;
import com.example.blogs.mapper.AttUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 8:47 PM
 * @since JDK 1.8
 */
@Service
public class AttUserService {
    @Autowired
    private AttUserMapper attUserMapper;

    public boolean addAttUser(String userSendId, String userReceiveId) {
        return attUserMapper.addAttUser(new AttuserPO(userSendId,userReceiveId));
    }
    public Boolean deleteAttUser(String userSendId, String userReceiveId){
        return attUserMapper.deleteAttUser(new AttuserPO(userSendId,userReceiveId));
    }
    public List<UserinfoPO> queryattedUser(String userPhone){
        return attUserMapper.queryattedUser(userPhone);
    }
    public List<UserinfoPO> queryattUser(String userPhone){
        return attUserMapper.queryattUser(userPhone);
    }
    public Integer queryAttedSum(String userPhone){
        return attUserMapper.queryAttedSum(userPhone);
    }
    public Integer queryAttSum(String userPhone){
        return attUserMapper.queryAttSum(userPhone);
    }
}
