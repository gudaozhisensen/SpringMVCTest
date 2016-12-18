/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author FEng
 */
@Controller
@RequestMapping("/cookiecontroller")
public class CookieController {
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookieValue){
        System.out.println("cookieValue:"+cookieValue);
        return "test";
    }
    @RequestMapping("/testNoCookieValue")
    public String testNoCookieValue(){
        return "test";
    }
}
