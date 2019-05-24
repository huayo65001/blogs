package com.example.blogs.mapper;

import com.example.blogs.domain.dto.UpdateReplySumDTO;
import com.example.blogs.domain.po.ReplyPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReplyMapper {


    /**
     * 根据贴子的信息查询回复
     * @param location
     * @return
     */
    @Select("select * from reply where replyLocation = #{location}")
    List<ReplyPO> queryLocation(int location);

    /**
     * 根据用户的编号查询回复
     * @param userid
     * @return
     */
    @Select("select * from reply where replyFirstuserid = #{userid}")
    List<ReplyPO> queryUserid(String userid);

    /**
     * 添加回复
     * @param reply
     * @return
     */
    @Insert("insert into reply(reply_createuserid,reply_firstuserid,firstusername,reply_seconduserid,secondname,reply_content,reply_location) values(#{replyCreateuserid},#{replyFirstuserid},#{firstusername},#{replySeconduserid},#{secondname},#{replyContent},#{replyLocation})")
    int addReply(ReplyPO reply);

    /**
     * 删除回复
     * @param replyid
     * @return
     */
    @Delete("delete from reply where reply_id = #{replyid}")
    int deleteReply(int replyid);

    @Update("update reply set reply_likesum = #{sum} where reply_id = #{replyId}")
    int updatelikesum(UpdateReplySumDTO updateReplySumDTO);

    @Update("update reply set reply_unlikesum = #{sum} where reply_id = #{replyId}")
    int updateunlikesum(UpdateReplySumDTO updateReplySumDTO);
}
