package com.trm.controller;

import com.trm.models.Details;
import com.trm.service.DatailsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Detailscontroller {
    @Autowired(required = false)
    private DatailsService datailsService;
    @RequestMapping("/detailsById")
    public ModelAndView detailsById(ModelAndView mv, @Param("id") Integer id){
       List<Details> detailsList = datailsService.AccordingToId(id);
       mv.addObject("detailsList",detailsList);
       mv.setViewName("/detailed");
       return mv;
    }
}
