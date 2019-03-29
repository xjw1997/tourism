package com.trm.service;

import com.trm.models.Details;

import java.util.List;

public interface DatailsService {
    /**
     *查询全部
     * */
    List<Details> getAll();
    List<Details> AccordingToId(Integer id);
}
