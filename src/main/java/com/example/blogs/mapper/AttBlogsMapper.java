package com.example.blogs.mapper;

import com.example.blogs.domain.po.AttblogsPO;
import com.example.blogs.domain.po.BlogsPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AttBlogsMapper {
    /**
     * 根据用户编号查询关注的贴吧的详细信息
     */

    @Select("select b.blogs_info_id,b.blogs_name,b.blogs_remark,b.blogs_img,b.blogs_postbar_sum,b.blogs_userid from blogs b,attblogs a where #{userid} = user_att_id and blogs_atted_id = blogs_info_id")
    List<BlogsPO> obtainAttBlogs(String userid);

    /**
     * 增加用户关注的贴吧
     */
    @Insert("insert into attblogs(user_att_id,blogs_atted_id) values(#{userAttId},#{blogsAttedId})")
    int addAttBlogs(AttblogsPO attblogs);


    /**
     * 删除用户关注的贴吧
     */
    @Delete("delete from attblogs where user_att_id = #{userAttId} and blogs_atted_id = #{blogsAttedId}")
    int deleteAttBlogs(AttblogsPO attblogs);


    /**
     * 查询用户关注的贴吧数目
     * @param userid
     * @return
     */
    @Select("select count(user_att_id) from attblogs where user_att_id = #{userid}")
    int queryAttBlogsSum(String userid);
}
