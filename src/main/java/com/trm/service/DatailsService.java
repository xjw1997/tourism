package com.trm.service;

import com.trm.models.Details;

import java.util.List;

public interface DatailsService {
    List<Details> getAll();
    List<Details> AccordingToId(Integer id);
}
