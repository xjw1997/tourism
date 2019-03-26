package com.trm.service.impl;

import com.trm.repositroy.AdminMapper;
import com.trm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdminService")
public class AdminServiceimpl implements AdminService {
    @Autowired(required = false)
    private AdminMapper dao;
    @Override
    public int login(String adname, String password) {

        return 0;
    }
}
