package com.trm.service.impl;

import com.trm.models.Areas;
import com.trm.repositroy.AreasMapper;
import com.trm.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("AreaService")
public class AreasServiceimpl implements AreasService {
    @Autowired(required = false)
    private AreasMapper dao ;
    @Override
    public List<Areas> findallareas() {
        return dao.selectAll();
    }
}
