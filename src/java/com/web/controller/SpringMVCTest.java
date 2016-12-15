/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author anderson
 */
@RequestMapping("/springmvctest")
@Controller
public class SpringMVCTest {

    public SpringMVCTest() {
        System.out.println("init SpringMVCTest()");
    }
    // /springmvc/testRequestMapping
//     @RequestMapping("/testRequestMapping/{id}")
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
