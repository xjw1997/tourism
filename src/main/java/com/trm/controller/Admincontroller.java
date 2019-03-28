package com.trm.controller;

import com.trm.models.Admin;
import com.trm.service.AdminService;
import com.trm.service.Impl.AdminServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admincontroller {
    @Autowired(required = false)
    private AdminService adminServiceimpl;

    @RequestMapping("/lg")
    public String dl(){
        return "/login";
    }
    @RequestMapping("/zc")
    public String zc(){
        return "/signup";
    }
    /**
     * 登录方法
     * */
    @RequestMapping("/enter")
    public ModelAndView login(ModelAndView mv , @RequestParam("username") String username ,@RequestParam("password") String password){
        Admin admin = adminServiceimpl.login(username,password);
        if (admin.getUsername() ==null){
            mv.setViewName("/login");
        }else {
            mv.addObject("admin",admin);
            mv.setViewName("redirect:/areaslist");
        }
        return  mv;
    }
    /**
     * 注册方法
     * */
    @RequestMapping("/set")
    public ModelAndView insert(ModelAndView mv,@RequestParam("username") String username ,@RequestParam("password") String password){
        Admin admin = new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        int set = adminServiceimpl.insert(admin);
        return mv;
    }
}
