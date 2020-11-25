package com.wyf.blog.common.exceptions;

import com.wyf.blog.common.response.ResponseCode;

/**
 * @Author wyf
 * @ClassName BusinessException
 * @Description 全局业务异常
 * @Date 2020/11/25 16:40
 * @Version 1.0.0
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 4868842805385777275L;

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public BusinessException() {}

    public BusinessException(String message) {
        super(message);
        this.code = -1;
    }

    public BusinessException(ResponseCode status) {
        super(status.message());
        this.code = status.code();
    }
}