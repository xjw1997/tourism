package com.trm.service.Impl;

import com.trm.models.Hotel;
import com.trm.repositroy.HotelMapper;
import com.trm.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HotelServiceimpl implements HotelService {
    @Autowired(required = false)
    private HotelMapper mapper;
    @Override
    public List<Hotel> getAll() {
        return mapper.selectAll();
    }
}
