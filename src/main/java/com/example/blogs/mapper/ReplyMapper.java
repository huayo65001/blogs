package com.example.blogs.mapper;

import com.example.blogs.domain.dto.UpdateReplySumDTO;
import com.example.blogs.domain.po.ReplyPO;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReplyMapper {


    List<ReplyPO> queryLocation(int location);

    List<ReplyPO> queryUserid(String userid);

    int addReply(ReplyPO reply);

    int deleteReply(ReplyPO reply);

    int updateReply(ReplyPO reply);

    @Update("update reply set reply_likesum = #{sum} where reply_id = #{replyId}")
    int updatelikesum(UpdateReplySumDTO updateReplySumDTO);

    @Update("update reply set reply_unlikesum = #{sum} where reply_id = #{replyId}")
    int updateunlikesum();
}
