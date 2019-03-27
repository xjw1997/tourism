package com.trm.service.Impl;

import com.trm.models.Spots;
import com.trm.repositroy.SpotsMapper;
import com.trm.service.SpotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpotsServiceimpl implements SpotsService {
    @Autowired(required = false)
    private SpotsMapper mapper;

    @Override
    public Spots findSpotsBysid(Integer sid) {
        return mapper.selectByPrimaryKey(sid);
    }
}
