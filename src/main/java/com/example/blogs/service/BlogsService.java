package com.example.blogs.service;

import com.example.blogs.domain.dto.BlogsDTO;
import com.example.blogs.domain.po.BlogsPO;
import com.example.blogs.mapper.BlogsMapper;
import com.example.blogs.mapper.PostbarinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 4:13 PM
 * @since JDK 1.8
 */
@Service
public class BlogsService {
    @Autowired
    private BlogsMapper blogsMapper;
    @Autowired
    private PostbarinfoMapper postbarinfoMapper;
    public boolean addBlogs(BlogsDTO blogsDTO) {
        return blogsMapper.addBlogs(blogsDTO);
    }

    public BlogsPO findByName(String blogsName) {
        return blogsMapper.findByName(blogsName);
    }

    public List<BlogsPO> findBlogsByName(String blogsName) {
        return blogsMapper.queryFuzzyBlogs(blogsName);
    }

    public List<BlogsPO> findBlogsByUserPhone(String userPhone) {
        return blogsMapper.queryBlogs(userPhone);
    }

    public List<BlogsPO> findAllBlogs() {
        return blogsMapper.query();
    }

    public List<BlogsPO> findAllBlogsUndenfy() {
        return blogsMapper.queryUndenfy();
    }

    public Integer findBlogsNumByUser(String userId) {
        return blogsMapper.queryUseridBlogsSum(userId);
    }

    public boolean deleteBlogsById(Integer blogsId) {
        //级连删除本贴吧所有的帖子，根据贴吧的id删除帖子
        if(!postbarinfoMapper.deletePostBarByBlogsId(blogsId)){
            return false;
        }
        return blogsMapper.deleteBlogsById(blogsId);
    }
}
