package com.trm.service.Impl;

import com.trm.models.Details;
import com.trm.repositroy.DetailsMapper;
import com.trm.service.DatailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DatailsServiceimpl implements DatailsService {
    @Autowired(required = false)
    private DetailsMapper mapper;
    @Override
    public List<Details> getAll() {
        return mapper.selectAll();
    }

    @Override
    public List<Details> AccordingToId(Integer id) {
        return mapper.detailsById(id);
    }

}