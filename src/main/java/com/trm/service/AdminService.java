package com.trm.service;

import com.trm.models.Admin;

public interface AdminService {
    Admin login(String username, String password);
    int insert(Admin record);
}
