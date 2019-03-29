package com.trm.util;

public class PageBean {

    

    


    private int currPage; //当前页数
    private int pageSize; //每页显示记录数
    private int totalCount; //总记录数
    private int totalPage; //总页数

    public PageBean(int currPagePara, int pageSizePara, int totalCountPara)
    {
        currPage = currPagePara;
        pageSize = pageSizePara;
        totalCount = totalCountPara;

        if (totalCount % pageSize == 0)
        {
            totalPage = totalCount / pageSize;
        }
        else
        {
            totalPage = totalCount / pageSize + 1;
        }

        if (currPage <= 0)
        {
            currPage = 1;
        }
        if (currPage >= totalPage + 1)
        {
            currPage = totalPage;
        }
    }


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
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
    

      
    

}
