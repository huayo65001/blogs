package com.example.blogs.domain;

import java.util.List;

public interface ImgDao {
    List<Img> queryPostbar(int postbarid);

    int addImg(Img img);

    int deleteImg(Img img);




}
