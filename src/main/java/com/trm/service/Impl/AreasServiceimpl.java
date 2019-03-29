package com.trm.service.Impl;

import com.trm.models.Areas;
import com.trm.repositroy.AreasMapper;
import com.trm.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreasServiceimpl implements AreasService {
    @Autowired(required = false)
    private AreasMapper mapper ;

    @Override
    public List<Areas> getAll() {
        return mapper.selectAll();
    }

    @Override
    public Areas getName(Integer id) {
        return mapper.selectBysId(id);
    }
}
