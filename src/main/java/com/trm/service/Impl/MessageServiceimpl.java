package com.trm.service.Impl;

import com.trm.models.Message;
import com.trm.repositroy.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MessageServiceimpl implements MessageMapper {
    @Autowired(required = false)
    private MessageMapper mapper;
    @Override
    public int insert(Message record) {
        return 0;
    }

    @Override
    public List<Message> selectAll() {
        return mapper.selectAll();
    }
}
