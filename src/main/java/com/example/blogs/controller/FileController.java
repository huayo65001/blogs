package com.example.blogs.controller;

import com.example.blogs.commonbox.Result;
import com.example.blogs.commonbox.ResultGenerator;
import com.example.blogs.domain.dto.UrlDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/5/24 7:13 PM
 * @since JDK 1.8
 */
@RestController
@RequestMapping("/file")
@ApiModel(description = "文件管理模块")
public class FileController {
    /**
     * 上传课件
     * @param file
     * @param request
     * @return
     */
    @ApiOperation(value = "上传文件", httpMethod = "POST", response = ResponseEntity.class)
    @PostMapping("/uploadFile")
    public Result uploadFile(@RequestParam(value = "file") MultipartFile file, HttpServletRequest request)throws IOException {
        //todo path需要改成服务器上某个文件的路径
        String url = "/usr/local/tomcat8/picture/";
//        String url = "/Users/liubing/Desktop/";
        try {
            url = url+file.getOriginalFilename();
            File date = new File (url);
            if(date.exists()){
                return ResultGenerator.genFailResult("文件已经存在");
            }
            file.transferTo(date);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return ResultGenerator.genFailResult("文件上传失败");
        }
        UrlDTO urlDTO = new UrlDTO();
        urlDTO.setUrl(url);
        return ResultGenerator.genSuccessResult(urlDTO);
    }

    /**
     * 下载课件
     * @param response
     * @param request
     * @throws Exception
     */
    @ApiOperation(value = "下载图片", httpMethod = "GET")
    @RequestMapping(value = "/downloadPicture",method = RequestMethod.GET)
    public void downloadAttachment(@RequestParam("fileName")String fileName, HttpServletResponse response, HttpServletRequest request) throws Exception {
        //todo path需要改成服务器上某个文件的路径
        String filePath = "/usr/local/tomcat8/picture/";
//        String filePath = "/Users/liubing/Desktop/";
        response.setContentType("application/octet-stream");
        response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileName, "UTF-8"));
        File file;
        FileInputStream fileIn = null;
        ServletOutputStream out = null;
        try {
            file = new File(filePath+fileName);
            if(file.exists()){
                fileIn = new FileInputStream(file);
                out = response.getOutputStream();
                int lenth = fileIn.available();
                byte[] outputByte = new byte[lenth];
                if((fileIn.read(outputByte,0,lenth)) != -1){
                    out.write(outputByte, 0, lenth); //并不是每次都能读到1024个字节，所有用readTmp作为每次读取数据的长度，否则会出现文件损坏的错误
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if(fileIn!=null){
                fileIn.close();
            }
            if(out!=null){
                out.flush();
                out.close();
            }
        }
    }
}
