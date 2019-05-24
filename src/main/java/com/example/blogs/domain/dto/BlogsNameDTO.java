package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 4:28 PM
 * @since JDK 1.8
 */
public class BlogsNameDTO {
    private String blogsName;

    public BlogsNameDTO() {
    }

    public BlogsNameDTO(String blogsName) {
        this.blogsName = blogsName;
    }

    @Override
    public String toString() {
        return "BlogsNameDTO{" +
                "blogsName='" + blogsName + '\'' +
                '}';
    }

    public String getBlogsName() {
        return blogsName;
    }

    public void setBlogsName(String blogsName) {
        this.blogsName = blogsName;
    }
}
