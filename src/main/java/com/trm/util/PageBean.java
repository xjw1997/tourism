package com.trm.util;

public class PageBean {
    private int currPage;
    private int pageSize;
    private int totalCount;
    private int totalPage;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {

        this.totalPage = totalPage;
    }
    public PageBean(int currPage,int pageSize ,int totalCount){
        this.currPage = currPage;
        this.pageSize = pageSize;
        this.totalCount=totalCount;
        if (totalCount%pageSize ==0){
            totalPage = totalCount/pageSize;
        }else {
            totalPage = totalCount/pageSize+1;
        }
        if (currPage<=0){
            currPage =1;
        }
        if (currPage>totalPage+1){
            currPage = totalPage;
        }
    }
}
