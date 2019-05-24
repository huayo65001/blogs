package com.example.blogs.utils;

import org.apache.commons.lang.StringUtils;

public class TollUtil {



/**
     * base64开头部分
     * @param suffix
     * @return
     */
    public static String imgsBase (String suffix){
        StringBuilder sBuilder = new StringBuilder(); 
        sBuilder.append("data:image/");
        sBuilder.append(suffix);
        sBuilder.append(";base64,");
        return sBuilder.toString();
    }
    
    /**
     * 获取文件扩展名称
     * @param fileName
     * @return
     */
    public static String suffixName (String fileName){
        if (StringUtils.isNotBlank(fileName)) {
            return fileName.trim().substring(fileName.trim().lastIndexOf(".")+1);
        }
        return null;
    }
}