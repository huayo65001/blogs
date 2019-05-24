package com.example.blogs.mapper;

import com.example.blogs.domain.dto.BlogsDTO;
import com.example.blogs.domain.po.BlogsPO;
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
     * @param userName
     * @return
     */
    @Select("select * from blogs where #{userName} = blogs_userid")
    List<BlogsPO> queryBlogs(String userName);

    @Select("select * from blogs")
    List<BlogsPO> query();

    /**
     * 用户创建贴吧的数目
     * @param userid
     * @return
     */
    @Select("select sum(blogs_info_id) from blogs where blogs_userid = #{userid}")
    int queryUseridBlogsSum(String userid);

    /**
     * 增加贴吧信息
     */
    @Insert("insert into blogs(blogs_name,blogs_remark,blogs_img,blogs_userid) values(#{blogsName},#{blogsRemark},#{blogsImg},#{blogs_userid})")
    int addBlogs(BlogsDTO blogsDTO);
}
