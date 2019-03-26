package com.trm.controller;


import com.trm.service.Impl.CustomerServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired(required = false)
    private CustomerServiceimpl customerServiceimpl;
    public ModelAndView insertCustomer(ModelAndView mv){
        return mv;
    }

}
