/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.bean.UserBean;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.Controller;

/**
 *
 * @author anderson
 */
public class LoginController extends AbstractController {

    public LoginController() {
        System.out.println("LoginController()");
    }

//    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        System.out.println("username:"+username+"password:"+password);
//        UserBean ub = new UserBean();
//        ub.setUsername(username);
//        ub.setPassword(password);
//        ModelAndView mv = new ModelAndView();
//        if (ub.login()) {
//            mv.addObject("message", "Login Success!");
//        } else {
//            mv.addObject("message", "Login Fail!");
//        }
//        mv.setViewName("loginResult");
//        return mv;
//    }

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        System.out.println("handleRequestInternal()");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username:"+username+"password:"+password);
        UserBean ub = new UserBean();
        ub.setUsername(username);
        ub.setPassword(password);
        ModelAndView mv = new ModelAndView();
        if (ub.login()) {
            mv.addObject("message", "Login Success!");
        } else {
            mv.addObject("message", "Login Fail!");
        }
        mv.setViewName("loginResult");
        return mv;
    }

}
