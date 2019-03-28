package com.trm.service;

import com.trm.models.Spots;

import java.util.List;


public interface SpotsService {
    Spots findSpotsBysid(Integer sid);
    List<Spots> getSpots();
}

