package com.strive.common.response;

/**
 * @ClassName BaseResponse
 * @author Karl.Zhang
 * @Date 2019/3/27 22:11
 * @Version 1.0
 * @Description 返回客户端数据基类
 */
public class BaseResponse {

    /** 状态 */
    private Boolean status;

    /** 信息 */
    private String message;

    public BaseResponse() {
    }

    public BaseResponse(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "BaseResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                '}';
    }
}
