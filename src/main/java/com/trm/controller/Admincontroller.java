package com.trm.controller;

import com.trm.models.Admin;
import com.trm.service.Impl.AdminServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admincontroller {
    @Autowired(required = false)
    private AdminServiceimpl adminServiceimpl;

    public ModelAndView login(ModelAndView mv , @RequestParam String username ,@RequestParam String password){
        Admin admin = adminServiceimpl.login(username, password);
          if (admin.getUsername() != null){
              mv.addObject("admin",admin);
              mv.setViewName("/home");
              return mv;
          }else{
              mv.setViewName("/login");
            return  mv;
          }

    }
}
