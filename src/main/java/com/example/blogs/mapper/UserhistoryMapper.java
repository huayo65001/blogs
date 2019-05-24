package com.example.blogs.mapper;

import com.example.blogs.domain.po.PostbarinfoPO;
import com.example.blogs.domain.po.UserhistoryPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserhistoryMapper {

    /**
     * 查询用户的浏览历史
     * @param userid
     * @return
     */
    @Select("select p.postbar_id,postbar_userid,postbar_content,postbar_location,postbar_tx,postbar_img,postbar_likesum,postbar_unlikesum,postbar_replysum from postbarinfo p,userhistory u where user_id = #{userid} and p.postbar_id = u.postbar_id")
    List<PostbarinfoPO> queryUserid(String userid);

    /**
     * 插入用户浏览历史
     * @param userhistoryPO
     * @return
     */
    @Insert("insert into userhistory(user_id,postbar_id) values(#{userId},#{postbarId})")
    int addUserhitory(UserhistoryPO userhistoryPO);

    /**
     * 删除用户浏览历史
     * @param userhistoryPO
     * @return
     */
    @Delete("delete from userhistory where #{userId} = user_id and postbar_id = #{postbarId}")
    int deleteUserhistory(UserhistoryPO userhistoryPO);

}
