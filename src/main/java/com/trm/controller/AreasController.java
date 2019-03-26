package com.trm.controller;

import com.trm.models.Areas;
import com.trm.service.Impl.AreasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Areascontroller {
    @Autowired(required = false)
    private AreasServiceImpl areasService;
    @RequestMapping("/areaslist")
    public ModelAndView seletcAll(ModelAndView mv){
        List<Areas> list = areasService.getAll();
        mv.addObject("Areaslist",list);
        mv.setViewName("/home");
        return mv;
    }
}
