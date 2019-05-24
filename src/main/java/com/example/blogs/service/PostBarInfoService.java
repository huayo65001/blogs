package com.example.blogs.service;

import com.example.blogs.domain.dto.PostBarInfoDTO;
import com.example.blogs.domain.po.PostbarinfoPO;
import com.example.blogs.mapper.PostbarinfoMapper;
import com.example.blogs.utils.PageCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PostBarInfoService {
    @Autowired
    private PostbarinfoMapper postbarinfoMapper;

    public List<PostbarinfoPO> getPostBarInfoListByUser(String userId) {
        return postbarinfoMapper.queryUserid(userId);
    }

    public List<PostbarinfoPO> getAllPostBarInfoList(int pageIndex) {
        int rowIndex = PageCalculator.calculateRowIndex(pageIndex, 10);
        return postbarinfoMapper.query(rowIndex);
    }

    public List<PostbarinfoPO> getPostBarInfoListByContent(String content) {
        return postbarinfoMapper.queryFuzzy(content);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void removePostBarInfo(long postBarId) throws RuntimeException {
        int effectedNum = postbarinfoMapper.deletePostbarinfo(postBarId);
        if (effectedNum <= 0) {
            throw new RuntimeException("删除失败");
        }
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void addPostBarInfo(PostBarInfoDTO postBarInfoDTO) throws RuntimeException {
        int effectedNum = postbarinfoMapper.addPostbarinfo(postBarInfoDTO);
        if (effectedNum <= 0) {
            throw new RuntimeException("添加失败");
        }
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void modifyPostBarInfo(PostbarinfoPO postbarinfoPO) throws RuntimeException {
        int effectedNum = postbarinfoMapper.updatePostbarinfo(postbarinfoPO);
        if (effectedNum <= 0) {
            throw new RuntimeException("修改失败");
        }
    }
}
