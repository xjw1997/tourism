package com.trm.service.Impl;

import com.trm.repositroy.OrderMapper;
import com.trm.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceimpl implements OrderService {
    @Autowired(required = false)
    private OrderMapper mapper;
}
