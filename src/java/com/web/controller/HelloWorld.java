/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author anderson
 */

//@Controller 表示是spring的控制器
@Controller
public class HelloWorld {

    public HelloWorld() {
        System.out.println("init HelloWorld()");
    }

    //hello() 方法上方有@RequestMapping 用于匹配请求路径
    //这里是http://localhost:8090/SpringMVCTest/helloworld
    //在浏览器输入这个url时，如果在这个方法打断点了，就会跳入该方法。
    // Mapping 的 url /....   要与类名的小写相同 这里类名是HelloWorld Mapping 是helloworld
    @RequestMapping("/helloworld")
    public String hello() {
        System.out.println("HelloWorld()");
        //return 被dispatcher-servlet.xml 中的 InternalResourceViewResolver 截获
        return "test";
    }
    
    @RequestMapping("/helloworld/{id}")
    public String hello(@PathVariable(value="id") int id) {
        System.out.println("HelloWorld() id:"+id);
        //return 被dispatcher-servlet.xml 中的 InternalResourceViewResolver 截获
        return "test";
    }
}
