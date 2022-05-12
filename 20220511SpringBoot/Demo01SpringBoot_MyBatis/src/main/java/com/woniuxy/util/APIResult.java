package com.woniuxy.util;

/**
 * @Author： Brian
 * @Todo：相应的结果集
 * @Date： 2022/5/11 15:33
 * @Version： 1.0
 * @param <T>  数据类型
 */
public final class APIResult<T> {
    private Integer status; //状态码
    private String msg; //消息
    private T data; //数据

    private static final Integer CODE_OK = 10000; //成功
    private static final String SUCCESS_MSG = "成功";

    private APIResult() {
        this(CODE_OK,SUCCESS_MSG);
    }

    public static <T> APIResult<T> error(){
        return new APIResult<>(20000,"失败");
    }

    /**
     * 返回成功，不带数据，只有状态码和消息
     * @return APIResult
     * @param <T>
     */
    public static <T> APIResult<T> success(){
        return new APIResult<>();
    }

    /**
     * 返回成功，带数据（数据由自己指定）
     * @param data
     * @return
     * @param <T>
     */
    public static <T> APIResult<T> success(T data){
        APIResult<T> apiResult = new APIResult<>();
        apiResult.setData(data);
        return apiResult;
    }
    public APIResult(Integer status, String message) {
        this.status = status;
        this.msg = message;
    }

    public APIResult(Integer status, String message, T data) {
        this.status = status;
        this.msg = message;
        this.data = data;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String message) {
        this.msg = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
