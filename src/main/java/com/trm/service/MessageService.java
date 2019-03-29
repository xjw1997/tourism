package com.trm.service;

import com.trm.models.Message;

import java.util.List;

public interface MessageService {
    /**
     * 查询全部
     * */
    List<Message> getAll();
}
