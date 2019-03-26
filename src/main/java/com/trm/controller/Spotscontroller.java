package com.trm.controller;

import com.trm.models.Spots;
import com.trm.service.SpotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Spotscontroller {
    @Autowired(required = false)
    private SpotsService spotsService;
    @RequestMapping("/spotstop")
    public ModelAndView selectspots(ModelAndView mv){
        List<Spots> spotsList = spotsService.getSpots();
        mv.addObject("spotstop5",spotsList);
        mv.setViewName("/home");
        return mv;
    }
}
