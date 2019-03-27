package com.strive.common.response;

/**
 * @ClassName SingleResponse
 * @auther Karl.Zhang
 * @Date 2019/3/27 22:31
 * @Version 1.0
 * @Description 返回单条数据
 */
public class SingleResponse<T> extends BaseResponse{

    /** 数据 */
    private T data;

    public SingleResponse(T data) {
        this.data = data;
    }

    public SingleResponse(Boolean status, String message, T data) {
        super(status, message);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
