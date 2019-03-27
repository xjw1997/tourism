package com.trm.controller;

import com.trm.models.Spots;
import com.trm.service.SpotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Spotscontroller {
    @Autowired(required = false)
    private SpotsService spotsService;
    @RequestMapping("/findSpots")
    public ModelAndView findSpots(ModelAndView mv , @RequestParam("sid") Integer sid){
        Spots spots = new Spots();
        spots = spotsService.findSpotsBysid(sid);
        mv.addObject("spots",spots);
        mv.setViewName("/detailed");
        return  mv;
    }
}
