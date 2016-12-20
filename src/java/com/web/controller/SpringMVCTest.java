/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import java.util.Date;
import java.util.Locale;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author anderson
 */

@Controller
@RequestMapping("/springmvctest")
public class SpringMVCTest {
    
//    @RequestMapping("/i18n")
//    public String testi18n(Locale locale){
////        ResourceBundleMessageSource ms = null;
////        String str = ms.getMessage("i18n.username",null, locale);
////        System.out.println("str:"+str);
//        return "i18n";
//    }
//    
//     @RequestMapping("/i18n2")
//    public String testi18n2(Locale locale){
////        ResourceBundleMessageSource ms = null;
////        String str = ms.getMessage("i18n.username",null, locale);
////        System.out.println("str:"+str);
//        return "i18n2";
//    }
    
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new  ModelAndView("test");
        mav.addObject("time", new Date());
        return mav;
    }
    @RequestMapping("/testRequestMapping/{id}")
    public String testRequestMapping(@PathVariable(value = "id") int id){        
        System.out.println("testRequestMapping()  id = "+id);
        return "test";
    }
       @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam (value="username") String username,@RequestParam (value="age",required=false,defaultValue="0") int age){
        System.out.println("testRequestParam()     username:"+username +"age:"+age);
        return "test";
    }
}
