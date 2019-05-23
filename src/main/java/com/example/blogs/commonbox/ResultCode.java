package com.example.blogs.commonbox;

/**
 * Function:响应码枚举，参考HTTP状态码的语义
 *
 * @author liubing
 * Date: 2018/9/30 下午2:24
 * @since JDK 1.8
 */
public enum ResultCode {
    //成功
    SUCCESS(2000),
    //已获得许可
    YE_VERY(2001),
    //暂无数据
    NONE_DATA(2002),
    //失败
    FAIL(4000),
    //未认证（签名错误）
    UNAUTHORIZED(4001),
    NOT_AUTH(4002),
    //接口不存在
    NOT_FOUND(4004),
    //token失效
    TOKEN_TIMEOUT(4444),
    //认证造假（上传的假token） 或者token上传错误
    NO_AUTH(4445),
    //未获得许可（没有权限）
    //令牌错误
    TOKEN_ERROR(4446),
    //参数验证
    PARAM_VALID(4447),
    //http消息不可读
    HTTP_MESSAGE_NOT_READABLE(4448),
    //服务器内部错误
    INTERNAL_SERVER_ERROR(5000),
    //没那么智能，分辨不出正相关还是负相关
    NOT_SMART_ENOUGH(6008);

//    SUCCESS(2000, "Success"),
//    YE_VERY(2001, "Ye Very"),
//    NONE_DATA(2002, "None Data"),
//    FAIL(4000, "Fail"),
//    UNAUTHORIZED(4001, "Unauthorized"),
//    NOT_AUTH(4002, "Not Auth"),
//    NOT_FOUND(4004, "Not Found"),
//    TOKEN_TIMEOUT(4444, "Token TimeOut"),
//    NO_AUTH(4445, "No Auth"),
//    TOKEN_ERROR(4446, "Token Error"),
//    PARAM_VALID(4447, "Param Valid"),
//    HTTP_MESSAGE_NOT_READABLE(4448, "HTTP Message Not Readable"),
//    FILE_UPLOAD_ERROR(4449, "file upload error"),
//    FILE_UPLOAD_TYPE_ERROR(4450, "file upload type error"),
//    NO_PERMISSION(4451, "No Permission"),
//    USER_INFO_EXCEPTION(4552, "User Info Exception"),
//    GET_LAND_INFO_ERROR(4553, "Get Land Info Error"),
//    INTERNAL_SERVER_ERROR(5000, "Internal Server Error"),
//    NOT_SMART_ENOUGH(6008, "Not Smart Enough");

    public int code;

    ResultCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

}
