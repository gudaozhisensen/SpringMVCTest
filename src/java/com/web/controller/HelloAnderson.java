/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author anderson
 */
@Controller
public class HelloAnderson {

    public HelloAnderson() {
        System.out.println("init HelloAnderson()");
    }
    
    @RequestMapping("/helloanderson")
    public String otherMethodName() {
        System.out.println("hello anderson");
        return "anderson";
    }
    
}
