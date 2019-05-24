package com.example.blogs.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 图片转换base64
 * @author Mcin
 *
 */
public class Base64ImgsUtil {

    static BASE64Encoder encoder = new BASE64Encoder();
    static BASE64Decoder decoder = new BASE64Decoder();


    /**
     * 将线上图片通过base64 转二进制
     *
     * @param imageUrl
     * @return
     * @throws Exception
     */
    public static String getURLImage(String imageUrl) throws Exception {
        //new一个URL对象  
        URL url = new URL(imageUrl);
        //打开链接  
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        //设置请求方式为"GET"  
        conn.setRequestMethod("GET");
        //超时响应时间为5秒  
        conn.setConnectTimeout(5 * 1000);
        //通过输入流获取图片数据  
        InputStream inStream = conn.getInputStream();
        //得到图片的二进制数据，以二进制封装得到数据，具有通用性  
        byte[] data = readInputStream(inStream);
        String prefix = TollUtil.suffixName(imageUrl);
        return TollUtil.imgsBase(prefix) + encoder.encode(data).trim();
    }

    /**
     * 读取图片流
     *
     * @param inStream
     * @return
     * @throws IOException
     */
    private static byte[] readInputStream(InputStream inStream) throws IOException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        //创建一个Buffer字符串  
        byte[] buffer = new byte[1024];
        //每次读取的字符串长度，如果为-1，代表全部读取完毕  
        int len = 0;
        //使用一个输入流从buffer里把数据读取出来  
        while ((len = inStream.read(buffer)) != -1) {
            //用输出流往buffer里写入数据，中间参数代表从哪个位置开始读，len代表读取的长度  
            outStream.write(buffer, 0, len);
        }
        //关闭输入流  
        inStream.close();
        //把outStream里的数据写入内存  
        return outStream.toByteArray();
    }

    /**
     * 将本地图片转换base64 的二进制 e:/123.jpg
     *
     * @param imgPath
     * @return
     */
    public static String getImageBinary(String imgPath) {
        File f = new File(imgPath.trim());
        BufferedImage bi;
        String prefix = TollUtil.suffixName(imgPath);
        try {
            bi = ImageIO.read(f);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bi, prefix, baos);  //经测试转换的图片是格式这里就什么格式，否则会失真
            byte[] bytes = baos.toByteArray();

            return TollUtil.imgsBase(prefix) + encoder.encodeBuffer(bytes).trim();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 将二进制转换为图片
     *
     * @param base64String base64转换后的
     * @param outPath      输出的地址
     */
    public static void base64StringToImage(String base64String, String outPath) {
        try {
            byte[] bytes = decoder.decodeBuffer(base64String);

            ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
            BufferedImage bi1 = ImageIO.read(bais);
            File file = new File(outPath);// 可以是jpg,png,gif格式  
            ImageIO.write(bi1, "jpg", file);// 不管输出什么格式图片，此处不需改动  
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}