package com.example.blogs.commonbox;


/**
 * Function: 响应结果生成工具
 *
 * @author liubing
 * Date: 2018/9/30 下午2:24
 * @since JDK 1.8
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    /**
     * 成功时返回的数据结构
     *
     * @return 结果
     */
    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }

    /**
     * 成功时返回的数据结构
     *
     * @param data 可传入时间作为消息值
     * @return 结果
     */
    public static Result genSuccessResult(Object data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    /**
     * 失败时返回的数据结构
     *
     * @param message 失败的原因
     * @return 结果
     */
    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }


    /**
     * 中立参数，有些值介于对和错之间
     * @param resultCode 状态码 需要指定枚举值
     * @param message 要发送的消息
     * @return 结果集
     */
    public static Result genNeutralResult(ResultCode resultCode, String message) {
        return new Result()
                .setCode(resultCode)
                .setMessage(message);
    }

    /**
     *
     * @param resultCode
     * @return
     */
    public static Result genNeutralResult(ResultCode resultCode) {
        return new Result()
                .setCode(resultCode);
    }

    /**
     * 中立参数，有些值介于对和错之间
     * @param resultCode 状态码
     * @param message 要发送的消息
     * @return 结果集
     */
    public static Result genNeutralResult(int resultCode, String message) {
        return new Result()
                .setCode(resultCode)
                .setMessage(message);
    }

}
