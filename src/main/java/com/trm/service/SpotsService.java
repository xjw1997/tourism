package com.trm.service;

import com.trm.models.Spots;

import java.util.List;
import java.util.Map;


public interface SpotsService {
    /**
     * 根据景点sid查询一条数据
     * */
    Spots findSpotsBysid(Integer sid);
    /**
     * 查询前五条数据
     * */
    List<Spots> getSpots();

    Integer getcount(Integer aid);
    List<Spots> getpage(Integer aid,Integer begin,Integer num);
}

