package com.example.blogs.domain.dto;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/20 1:49 PM
 * @since JDK 1.8
 */
public class UrlDTO {
    private String url;

    public UrlDTO() {
    }

    public UrlDTO(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "UrlDTO{" +
                "url='" + url + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
