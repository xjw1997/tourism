package com.trm.service.Impl;

import com.trm.repositroy.RouteMapper;
import com.trm.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RouteServiceimpl implements RouteService {
    @Autowired(required = false)
    private RouteMapper mapper;
}
