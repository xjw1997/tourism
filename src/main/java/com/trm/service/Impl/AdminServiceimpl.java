package com.trm.service.Impl;

import com.trm.models.Admin;
import com.trm.repositroy.AdminMapper;
import com.trm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceimpl implements AdminService {
    @Autowired(required = false)
    private AdminMapper dao;
    @Override
    public Admin login(String username, String password) {
        return dao.login(username,password);
    }

    @Override
    public int insert(Admin record) {
        return dao.insert(record);
    }
}
