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
public class OtherController {
    
    
    
    
    
    @RequestMapping("/othercontroller")
    public String other(){
        System.out.println("other()");
        return "test";
    }
}
