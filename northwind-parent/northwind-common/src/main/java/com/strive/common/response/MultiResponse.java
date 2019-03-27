package com.strive.common.response;

import java.util.List;

/**
 * @auther Karl.Zhang
 * @ClassName MultiResponse
 * @Date 2019/3/27 22:26
 * @Version 1.0
 * @Description 返回多条数据
 */
public class MultiResponse<T> extends BaseResponse{

    /** 数据 */
    private List<T> data;

    public MultiResponse() {
    }

    public MultiResponse(List<T> data) {
        this.data = data;
    }

    public MultiResponse(Boolean status, String message, List<T> data) {
        super(status, message);
        this.data = data;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
