package com.trm.controller;

import com.trm.models.Admin;
import com.trm.service.Impl.AdminServiceimpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admincontroller {
    @Autowired(required = false)
    private AdminServiceimpl adminServiceimpl;
    @RequestMapping("/lg")
    public  String  lg(){
        return "login";
    }
    @RequestMapping("/zc")
    public  String  set(){
        return "signup";
    }

    @RequestMapping("/enter")
    public ModelAndView login(ModelAndView mv , @RequestParam("username") String username ,@RequestParam("password") String password){
        Admin admin = adminServiceimpl.login(username, password);
          if (admin.getUsername() != null){
              mv.addObject("admin",admin);
              mv.setViewName("redirect:/areaslist");
              return mv;
          }else{
              mv.setViewName("/login");
            return  mv;
          }
    }
    @RequestMapping("/set")
    public  ModelAndView insert(ModelAndView mv, @RequestParam("username") String username, @RequestParam("password") String password){
          Admin admin = new Admin();
          admin.setUsername(username);
          admin.setPassword(password);
          int insert = adminServiceimpl.insert(admin);
          mv.setViewName("redirect:/lg");
        return mv;
    }
}
