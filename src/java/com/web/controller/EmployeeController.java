/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.controller;

import com.web.bean.Department;
import com.web.bean.Employee;
import com.web.crud.dao.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author FEng
 */
@Controller
public class EmployeeController {

    @RequestMapping("/employee_edit/employee_save")
    public String employeeSave(Employee employee) {
        System.out.println("employeeSave()");
        System.out.println(employee.getId());
        return "employees";
    }

    @RequestMapping("/employee_edit/{id}")
    public ModelAndView employeeEdit(@PathVariable(value = "id") int id) {
        ModelAndView mav = new ModelAndView("employee_edit");
        
        mav.addObject("employees", EmployeeDao.getEmployeeById(id));
        HashMap gender = new HashMap();
        gender.put("F", "Female");
        gender.put("M", "Male");
        mav.addObject("gender", gender);
        mav.addObject("departments", DepartmentDao.getDepartments());
        return mav;
    }

    @RequestMapping("/emps1")
    public ModelAndView employees_() {
        ModelAndView mav = new ModelAndView("employees_");
//        mav.addObject("employees", hm);
        mav.addObject("employees", EmployeeDao.getAllEmployees());
        return mav;
    }

    @RequestMapping("/emps")
    public String employees(HashMap hm) {//方法里的参数会传到页面上去
        hm.put("employees", EmployeeDao.getAllEmployees());
        return "employees";
    }

    @RequestMapping("/emps2")
    public ModelAndView employees_2() {
        ModelAndView mav = new ModelAndView("employees_2");
        HashMap hm = new HashMap();
        hm.put("employees", EmployeeDao.getAllEmployees());
        mav.addObject("employees", hm);
        return mav;
    }
}
