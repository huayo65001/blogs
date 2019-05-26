package com.example.blogs.mapper;

import com.example.blogs.domain.dto.PostBarInfoDTO;
import com.example.blogs.domain.po.PostbarinfoPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface PostbarinfoMapper {


    /**
     * 查询全部的贴子信息
     *
     * @return
     */
    @Select("select * from postbarinfo where postbar_flag =1 limit #{rowIndex},10")
    List<PostbarinfoPO> query(int rowIndex);

    /**
     * 根据用户查询贴子信息
     *
     * @param userid
     * @return
     */
    @Select("select * from postbarinfo where postbar_userid = #{userid} and postbar_flag = 1")
    List<PostbarinfoPO> queryUserid(String userid);

    /**
     * 添加用户的贴子
     *
     * @return
     */
    @Insert("insert into postbarinfo(postbar_userid,postbar_content,postbar_location,postbar_img) values(#{postbarUserid},#{postbarContent},#{postbarLocation},#{postbarImg})")
    int addPostbarinfo(PostBarInfoDTO postBarInfoDTO);

    /**
     * 更新用户的贴子
     *
     * @param postbarinfo
     * @return
     */
    int updatePostbarinfo(PostbarinfoPO postbarinfo);

    /**
     * 删除用户的贴子
     *
     * @return
     */
    @Delete("delete from postbarinfo where postbar_id = #{postbarId}")
    int deletePostbarinfo(long postbarId);

    @Delete("delete from postbarinfo where postbar_location = #{blogsId}")
    boolean deletePostBarByBlogsId(Integer blogsId);

    @Select("select * from postbarinfo where postbar_content like concat('%',#{postBarInfoName},'%') and postbar_flag = 1")
    List<PostbarinfoPO> queryFuzzy(String postBarInfoName);
}
