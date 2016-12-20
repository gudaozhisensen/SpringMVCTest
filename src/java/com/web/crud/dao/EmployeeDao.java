/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.crud.dao;

import com.web.bean.Department;
import com.web.bean.Employee;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author FEng
 */
public class EmployeeDao {

    

    private Integer id;
    private static HashMap employees;

    static {
        employees = new HashMap();
//        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", 'F', new Department(101, "D-AA")));
//        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", 'F', new Department(102, "D-BB")));
//        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", 'M', new Department(103, "D-CC")));
//        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", 'M', new Department(104, "D-DD")));
//        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", 'F', new Department(105, "D-EE")));
        employees.put(1001, new Employee(1001, "E-AA", "aa@163.com", "F", new Department(101, "D-AA")));
        employees.put(1002, new Employee(1002, "E-BB", "bb@163.com", "F", new Department(102, "D-BB")));
        employees.put(1003, new Employee(1003, "E-CC", "cc@163.com", "M", new Department(103, "D-CC")));
        employees.put(1004, new Employee(1004, "E-DD", "dd@163.com", "M", new Department(104, "D-DD")));
        employees.put(1005, new Employee(1005, "E-EE", "ee@163.com", "F", new Department(105, "D-EE")));
    }

    public EmployeeDao() {
    }

    public void add(Integer id) {

    }

    public void delete(Integer id) {
    }

    public void get(Integer id) {
    }

    public static void update(Employee employee) {
        employees.remove(employee.getEmployee_id());
        employees.put(employee.getEmployee_id(), employee);
    }
    
    

    public static Collection getAllEmployees() {
        return employees.values();
    }
    public static Object getEmployeeById(int id){
//        HashMap hm = new HashMap();
        return employees.get(id);
    }
}
