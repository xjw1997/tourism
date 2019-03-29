package com.trm.service;

import com.trm.models.Areas;

import java.util.List;


public interface AreasService {
    /**
     * 查询全部
     * */
    List<Areas> getAll();
    /**
     * 根据景点表的aid查询
     * */
    Areas getName(Integer aid);
}



