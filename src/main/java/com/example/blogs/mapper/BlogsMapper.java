package com.example.blogs.mapper;

import com.example.blogs.domain.dto.BlogsDTO;
import com.example.blogs.domain.po.BlogsPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BlogsMapper {


    /**
     * 模糊查询贴吧信息
     * @param blogsName
     * @return
     */
    @Select("select * from blogs where blogs_name like '%#{blogsName}%'")
    List<BlogsPO> queryFuzzyBlogs(String blogsName);

    /**
     * 根据用户名查询贴吧信息
     * @param userId
     * @return
     */
    @Select("select * from blogs where #{userId} = blogs_userid")
    List<BlogsPO> queryBlogs(String userId);

    @Select("select * from blogs")
    List<BlogsPO> query();

    /**
     * 用户创建贴吧的数目
     * @param userid
     * @return
     */
    @Select("select sum(blogs_info_id) from blogs where blogs_userid = #{userid}")
    Integer queryUseridBlogsSum(String userid);

    /**
     * 增加贴吧信息
     */
    @Insert("insert into blogs(blogs_name,blogs_remark,blogs_img,blogs_userid) values(#{blogsName},#{blogsRemark},#{blogsImg},#{blogs_userid})")
    boolean addBlogs(BlogsDTO blogsDTO);

    /**
     * 根据名字查询贴吧
     * @param blogsName
     * @return
     */
    @Select("select * from blogs where blogs_name = #{blogsName}")
    BlogsPO findByName(String blogsName);

    /**
     * 根据贴吧的id删除贴吧
     * @param blogsId
     * @return
     */
    @Delete("delete from blogs where blogs_info_id = #{blogsId}")
    boolean deleteBlogsById(Integer blogsId);
}
