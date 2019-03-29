package com.trm.service.Impl;

import com.trm.models.Spots;
import com.trm.repositroy.SpotsMapper;
import com.trm.service.SpotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpotsServiceimpl implements SpotsService {
    @Autowired(required = false)
    private SpotsMapper mapper;

    @Override

    public Spots findSpotsBysid(Integer sid) {
        return mapper.selectByPrimaryKey(sid);
}
    public List<Spots> getSpots() {
        return mapper.selectSpots();
    }

    @Override
    public List<Spots> getAllSpots(Integer aid) {
        return mapper.selectAll();
    }

    @Override
    public Integer getcount(Integer aid) {
        return mapper.selectcount(aid);
    }


    @Override
    public List<Spots> getpage(Integer aid, Integer begin, Integer num) {
        return mapper.selectpage(aid,begin,num);
    }



    @Override
    public List<Spots> getSpotsByaid(Integer aid) {
        return  mapper.selectSpotsByaid(aid);
    }



}

