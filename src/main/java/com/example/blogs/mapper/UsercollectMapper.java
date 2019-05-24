package com.example.blogs.mapper;

import com.example.blogs.domain.po.PostbarinfoPO;
import com.example.blogs.domain.po.UsercollectPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UsercollectMapper {

    /**
     * 查询用户收藏的贴子信息
     * @param userid
     * @return
     */
    @Select("select p.postbar_id,postbar_userid,postbar_content,postbar_location,postbar_tx,postbar_img,postbar_likesum,postbar_unlikesum,postbar_replysum from postbarinfo p,usercollect u where user_id = #{userid} and p.postbar_id = u.postbar_id")
    List<PostbarinfoPO> queryUserid(String userid);

    /**
     * 增加用户收藏的贴子
     * @param usercollectPO
     * @return
     */
    @Insert("insert into usercollect(user_id,postbar_id) values(#{userId},#{postbarId})")
    int addUsercollect(UsercollectPO usercollectPO);

    /**
     * 删除用户收藏的贴子
     * @param usercollectPO
     * @return
     */
    @Delete("delete from usercollect where #{userId} = user_id and postbar_id = #{postbarId}")
    int deleteUsercollect(UsercollectPO usercollectPO);


}