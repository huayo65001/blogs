package com.example.blogs.service;

import com.example.blogs.domain.po.PostbarinfoPO;
import com.example.blogs.domain.po.UsercollectPO;
import com.example.blogs.mapper.UsercollectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserCollectService {
    @Autowired
    private UsercollectMapper usercollectMapper;

    public List<PostbarinfoPO> getUserCollectList(String userPhone) {
        return usercollectMapper.queryUserid(userPhone);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void addUserCollect(UsercollectPO usercollectPO) {
        int effectedNum = usercollectMapper.addUsercollect(usercollectPO);
        if (effectedNum <= 0) {
            throw new RuntimeException("插入失败");
        }
    }
}
