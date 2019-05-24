package com.example.blogs.mapper;

import com.example.blogs.domain.po.ImgPO;

import java.util.List;

public interface ImgDao {


    List<ImgPO> queryPostbar(int postbarid);

    int addImg(ImgPO img);

    int deleteImg(ImgPO img);




}
