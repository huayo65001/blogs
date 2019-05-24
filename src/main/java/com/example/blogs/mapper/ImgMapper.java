package com.example.blogs.mapper;

import com.example.blogs.domain.dto.ImgDTO;
import com.example.blogs.domain.po.ImgPO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ImgMapper {

    /**
     * 查询贴子的图片
     * @param postbarid
     * @return
     */
    @Select("select * from img where #{postbarid} = postbar_img_id")
    List<ImgPO> queryPostbar(int postbarid);

    @Insert("insert into img(postbar_img_id,postbar_img) values(#{postbarImgId},#{postbarImg})")
    int addImg(ImgDTO img);

    /**
     * 删除图片
     * @param imgid
     * @return
     */
    @Delete("delete from img where #{imgid} = img_id")
    int deleteImg(int imgid);




}
