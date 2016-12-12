/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author anderson
 */
public class TestController implements Controller{

    public TestController() {
        System.out.println("TestController()");
    }
    
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception {
        System.out.println("ModelAndView()");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","Controller Test");
        mv.setViewName("test");        
        return mv;
    }
    
}
