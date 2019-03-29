package com.trm.service;

import com.trm.models.Admin;

public interface AdminService {
    /**
     * 登录方法
     * */
    Admin login(String username, String password);

    /**
     * 注册方法
     * */
    int insert(Admin record);
}
