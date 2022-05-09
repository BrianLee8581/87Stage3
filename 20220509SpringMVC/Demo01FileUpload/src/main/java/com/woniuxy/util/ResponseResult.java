package com.woniuxy.util;

/**
 * @Author： Brian
 * @Todo：
 * @Date： 2022/5/9 20:34
 * @Version： 1.0
 */
public class ResponseResult {
    private Integer code;
    private String message;
    private Object data;

    public ResponseResult() {
    }

    public ResponseResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
