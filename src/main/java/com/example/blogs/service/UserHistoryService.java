package com.example.blogs.service;

import com.example.blogs.domain.po.PostbarinfoPO;
import com.example.blogs.domain.po.UserhistoryPO;
import com.example.blogs.mapper.UserhistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserHistoryService {
    @Autowired
    private UserhistoryMapper userhistoryMapper;

    public List<PostbarinfoPO> getUserHistoryList(String userPhone) {
        return userhistoryMapper.queryUserid(userPhone);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void addUserHitory(UserhistoryPO userhistoryPO) {
        int effectedNum = userhistoryMapper.addUserhitory(userhistoryPO);
        if (effectedNum <= 0) {
            throw new RuntimeException("插入失败");
        }
    }
}
