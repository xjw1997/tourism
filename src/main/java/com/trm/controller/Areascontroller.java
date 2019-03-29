package com.trm.controller;

import com.trm.models.Areas;
import com.trm.service.AreasService;
import com.trm.service.Impl.AreasServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Areascontroller {
    @Autowired(required = false)
    private AreasService areasService;
    /**
     * 查询所有方法
     * */
    @RequestMapping("/areaslist")
    public String selectall(HttpSession request){
        List<Areas> list = areasService.getAll();
        request.setAttribute("areaslist",list);
        return "redirect:/spotsaid";
    }
}
