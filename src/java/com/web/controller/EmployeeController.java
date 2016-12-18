/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.bean.Department;
import com.web.bean.Employee;
import com.web.crud.dao.EmployeeDao;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author FEng
 */
@Controller
public class EmployeeController {

    @RequestMapping("/emps1")
    public ModelAndView employees() {
        ModelAndView mav = new ModelAndView("employees");

        HashMap<String, Collection> hm = new HashMap();
        hm.put("employees", EmployeeDao.getAllEmployees());
//        hm.put("gender", "0");
//        hm.put("email", "262643608@qq.com");
        Iterator it = hm.get("employees").iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        System.out.println("id:" + hm.get("employees"));
//        mav.addObject("emp", hm);
        return mav;
    }
    @RequestMapping("/emps")
    public String employees(Map<String, Object> map) {
        map.put("employees", EmployeeDao.getAllEmployees());
        System.out.println("map:"+map.get("employees"));
        return "employees";
    }
}
