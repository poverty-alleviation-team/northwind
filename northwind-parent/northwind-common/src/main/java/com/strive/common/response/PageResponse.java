package com.strive.common.response;

import com.strive.common.page.PageInfo;

import java.util.List;

/**
 * @ClassName PageResponse
 * @auther Karl.Zhang
 * @Date 2019/3/27 22:46
 * @Version 1.0
 * @Description 返回分页数据
 */
public class PageResponse<T> extends BaseResponse{

    /** 分页信息 */
    private PageInfo pageInfo;

    /** 数据 */
    private List<T> data;

    public PageResponse() {
    }

    public PageResponse(Boolean status, String message, PageInfo pageInfo, List<T> data) {
        super(status, message);
        this.pageInfo = pageInfo;
        this.data = data;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
