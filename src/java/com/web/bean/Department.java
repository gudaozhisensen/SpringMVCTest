/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.bean;

/**
 *
 * @author FEng
 */
public class Department {

    private int department_id;//部门ID
    private String departmentName;//部门名称

    public Department(int department_id, String departmentName) {
        this.department_id = department_id;
        this.departmentName = departmentName;
    }

    public Department() {
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String toString() {
        return "Department : [department_id=" + department_id + ", departmentName=" + departmentName + "]";
    }
}
