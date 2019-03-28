package com.trm.service;

import com.trm.models.Spots;

import java.util.List;
import java.util.Map;


public interface SpotsService {
    Spots findSpotsBysid(Integer sid);
    List<Spots> getSpots();
    List<Spots> getAllSpots(Integer aid);
    Integer getcount(Integer aid);
    List<Spots> getpage(Map map, Integer aid);
}

