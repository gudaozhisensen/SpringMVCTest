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
public class DepartmentDao {

    public static void save(Employee employee) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Integer Id;
    private static HashMap  departments;
    static{
        departments = new HashMap();
         
        departments.put(101, new Department(101, "D-AA"));
        departments.put(102, new Department(102, "D-BB"));
        departments.put(103, new Department(103, "D-CC"));
        departments.put(104, new Department(104, "D-DD"));
        departments.put(105, new Department(105, "D-EE"));
    }
    
    public void add(Integer id){
        
    }
    
    public void delete(Integer id){
    }
    
    public void get(Integer id){
    }
    
    public void update(Integer id){
        
    }
    public static Collection<Department> getDepartments(){
        return departments.values();
    }
    
    public static Object getDepartmentById(Integer id){
        return departments.get(id);
    }
}
