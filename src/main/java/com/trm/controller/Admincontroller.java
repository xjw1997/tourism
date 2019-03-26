package com.trm.controller;

import com.trm.service.Impl.AdminServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Admincontroller {
    @Autowired(required = false)
    private AdminServiceimpl adminServiceimpl;
    public ModelAndView login(ModelAndView mv , @RequestParam String adname ,@RequestParam String password){
        return  mv;
    }
}
