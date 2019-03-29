package com.trm.controller;

import com.trm.models.Areas;
import com.trm.models.Spots;
import com.trm.service.AreasService;
import com.trm.service.SpotsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class Spotscontroller {
    @Autowired(required = false)
    private SpotsService spotsService;
    @Autowired(required = false)
    private AreasService areasService;
    @RequestMapping("/findSpots")
    public ModelAndView findSpots(ModelAndView mv , @RequestParam("sid") Integer sid) {
        Spots spots = new Spots();
        spots = spotsService.findSpotsBysid(sid);
        Areas areas = areasService.getName(spots.getaId());
        mv.addObject("areas",areas);
        mv.addObject("spots", spots);
        mv.setViewName("detailed");
        return mv;
    }
    @RequestMapping("/spotsaid")
    public  ModelAndView selectspotsbyaid(ModelAndView mv){
        List<Spots> spotsList = spotsService.getSpots();
        mv.addObject("spotstop", spotsList);
        for (int i =1;i<=5;i++){
            List<Spots>  spotslist = spotsService.getSpotsByaid(i);
            mv.addObject("spotsbyaid"+i,spotslist);
        }
        mv.setViewName("/home");
        return  mv;
    }
}