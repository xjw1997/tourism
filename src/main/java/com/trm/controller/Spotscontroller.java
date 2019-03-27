package com.trm.controller;

import com.trm.models.Areas;
import com.trm.models.Spots;
import com.trm.service.Impl.SpotsServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Controller
public class Spotscontroller {
    @Autowired(required = false)
    private SpotsServiceimpl spotsService;
    @RequestMapping("/spotstop")
    public String selectspots(HttpServletRequest request){
        List<Spots> spotsList = spotsService.getSpots();
        request.setAttribute("spotstop",spotsList);
        return "home";
    }
}
