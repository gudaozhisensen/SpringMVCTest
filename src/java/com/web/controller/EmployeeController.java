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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author FEng
 */
@Controller
public class EmployeeController {

    private EmployeeDao eDao = EmployeeDao.getInstance();

    @RequestMapping(value = "/employee_edit/employee_update", method = RequestMethod.POST)
    public String employeeUpdate(Employee employee, Department department) {
        employee.setDepartment((Department) DepartmentDao.getDepartmentById(employee.getDepartment().getDepartment_id()));
        if (employee.getEmployee_id()!=null) {//如果ID不为空，就update
            eDao.update(employee);
        } else {//如果ID为空，则新增
            eDao.add(employee);
        }
        return "redirect:/emps";
    }

    @RequestMapping("/employee_edit/")
    public ModelAndView employeeEdit() {
        ModelAndView mav = new ModelAndView("employee_edit");
        mav.addObject("employees", new Employee());
        HashMap gender = new HashMap();
        gender.put("F", "Female");
        gender.put("M", "Male");
        mav.addObject("gender", gender);
        mav.addObject("departments", DepartmentDao.getDepartments());
        return mav;
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

    @RequestMapping("/emps")
    public String showAllEmployees(HashMap hm) {//方法里的参数会传到页面上去
        hm.put("employees", EmployeeDao.getAllEmployees());
        return "employees";
    }

    @RequestMapping("/employee_delete/{id}")
    public ModelAndView employeeDelete(@PathVariable(value = "id") int id) {
        ModelAndView mav = new ModelAndView("redirect:/emps");
        eDao.delete(id);
        return mav;
    }

}
