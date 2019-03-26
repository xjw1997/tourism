package com.trm.controller;

import com.trm.models.Areas;
import com.trm.service.impl.AreasServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AreasController {
    @Autowired(required = false)
    private AreasServiceimpl areasServiceimpl;
    @RequestMapping("/Areaslist")
    public ModelAndView selectAreas(ModelAndView mv){
        List<Areas> list = areasServiceimpl.findallareas();
        mv.addObject("Areaslist",list);
        mv.setViewName("home");
        return mv;
    }
}
