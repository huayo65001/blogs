package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 7:06 PM
 * @since JDK 1.8
 */
public class BlogsIdDTO {
    private Integer blogsId;

    public BlogsIdDTO() {
    }

    public BlogsIdDTO(Integer blogsId) {
        this.blogsId = blogsId;
    }

    @Override
    public String toString() {
        return "BlogsIdDTO{" +
                "blogsId=" + blogsId +
                '}';
    }

    public Integer getBlogsId() {
        return blogsId;
    }

    public void setBlogsId(Integer blogsId) {
        this.blogsId = blogsId;
    }
}
