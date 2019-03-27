package com.strive.common.page;

/**
 * @ClassName PageInfo
 * @auther Karl.Zhang
 * @Date 2019/3/27 22:40
 * @Version 1.0
 * @Description 分页信息
 */
public class PageInfo {

    /** 总记录数 */
    private int total;

    /** 当前页 记录条数*/
    private int pageSize;

    /** 页码 */
    private int pageNo;

    public PageInfo() {
    }

    public PageInfo(int total, int pageSize, int pageNo) {
        this.total = total;
        this.pageSize = pageSize;
        this.pageNo = pageNo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    @Override
    public String toString() {
        return "PageInfo{" +
                "total=" + total +
                ", pageSize=" + pageSize +
                ", pageNo=" + pageNo +
                '}';
    }
}
