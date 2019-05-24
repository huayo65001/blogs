package com.example.blogs.service;

import com.example.blogs.domain.dto.UpdateReplySumDTO;
import com.example.blogs.domain.po.ReplyPO;
import com.example.blogs.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    public List<ReplyPO> getReplyListByLocation(int location) {
        return replyMapper.queryLocation(location);
    }

    public List<ReplyPO> getReplyListByUser(String userPhone) {
        return replyMapper.queryUserid(userPhone);
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void addReply(ReplyPO reply) throws RuntimeException {
        int effectedNum = replyMapper.addReply(reply);
        if (effectedNum <= 0) {
            throw new RuntimeException("添加失败");
        }
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void removeReply(int replyId) throws RuntimeException {
        int effectedNum = replyMapper.deleteReply(replyId);
        if (effectedNum <= 0) {
            throw new RuntimeException("删除失败");
        }
    }

    @Transactional(rollbackFor = RuntimeException.class)
    public void modifyReplyLikeSum(UpdateReplySumDTO updateReplySumDTO) throws RuntimeException {
        int effectedNum = replyMapper.updatelikesum(updateReplySumDTO);
        if (effectedNum <= 0) {
            throw new RuntimeException("点赞失败");
        }
    }


    @Transactional(rollbackFor = RuntimeException.class)
    public void modifyRepayUnlikeSum(UpdateReplySumDTO updateReplySumDTO) throws RuntimeException {
        int effectedNum = replyMapper.updateunlikesum(updateReplySumDTO);
        if (effectedNum <= 0) {
            throw new RuntimeException("点赞失败");
        }
    }
}
