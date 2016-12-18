/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author anderson
 */
@Controller
public class LoginController{
    
    //@RequestParam 通过绑定表单中的数据达到传参效果
    @RequestMapping(value = "logincontroller",method = RequestMethod.POST)
    public String login(UserBean userbean){
        System.out.println("userbean:"+userbean);
        return "test";
    }
//    
    @RequestMapping(value = "logincontroller/{username}",method = RequestMethod.DELETE)
    public String delete(@PathVariable String username){
        System.out.println("DELETE()");
        return "test";
    }
    
    @RequestMapping(value = "logincontroller/{username}",method = RequestMethod.PUT)
    public String put(@PathVariable String username){
        System.out.println("PUT()");
        return "test";
    }
    
    //@PathVariable 通过绑定url中的参数达到传参效果
    @RequestMapping(value = "logincontroller/{username}/{password}",method = RequestMethod.GET)
    public String login(@PathVariable String username,@PathVariable String password,Model model){
        System.out.println("username:"+username+" password:"+password+" model:"+model);
        return "test";
    }
}
