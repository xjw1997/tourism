package com.trm.controller;

import com.trm.models.Areas;
import com.trm.models.Spots;
import com.trm.service.AreasService;
import com.trm.service.SpotsService;
import com.trm.util.PageBean;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Spotscontroller {
    @Autowired(required = false)
    private SpotsService spotsService;
    @Autowired(required = false)
    private AreasService areasService;
    /**
     * 根据景点sid查询景点表
     * */
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
    /**
     * 查询景点前五条数据
     * */
        @RequestMapping("/spotstop")
        public String selectspots (HttpServletRequest request){
            List<Spots> spotsList = spotsService.getSpots();
            request.setAttribute("spotstop", spotsList);
            return "home";
    @RequestMapping("/spotsaid")
    public  ModelAndView selectspotsbyaid(ModelAndView mv){
        List<Spots> spotsList = spotsService.getSpots();
        mv.addObject("spotstop", spotsList);
        for (int i =1;i<=5;i++){
            List<Spots>  spotslist = spotsService.getSpotsByaid(i);
            mv.addObject("spotsbyaid"+i,spotslist);
        }
        @RequestMapping("/AllSpots")
        public ModelAndView selectAllSpots(ModelAndView mv, @RequestParam("aid") Integer aid){
        List<Spots> list = spotsService.getAllSpots(aid);
        mv.addObject("AllSpot",list);
        mv.setViewName("type");
            return mv;
        }


        @RequestMapping("/page")
        public String selectpage(@RequestParam(name="currPage") int currPage, Model model,@RequestParam(name = "aid") Integer aid){
            PageBean pageBean = new PageBean(currPage,10,spotsService.getcount(aid));
            Integer begin = currPage*10-10;
            Integer num = 10;
            List<Spots> list = spotsService.getpage(aid,begin,num);
            model.addAttribute("spotsPage",list);
            model.addAttribute("currPage",pageBean.getCurrPage());
            model.addAttribute("totalPage",pageBean.getTotalPage());
            model.addAttribute("aid",aid);
            return "type";
        }
        mv.setViewName("/home");
        return  mv;
    }
}