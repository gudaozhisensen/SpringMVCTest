/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.bean;

import java.util.Date;

/**
 *
 * @author FEng
 */
public class Employee {
    private Integer employee_id;//员工ID
    private String employeeName;//员工名字
    private String email;//员工邮箱
    private String gender;//员工性别
    private Department department;//员工所属部门
    private Date birth;//员工生日
    private Float salary;//员工薪水
    private boolean isNewEmployee;

    public Employee(Integer employee_id, String employeeName, String email, String gender, Department department) {
        this.employee_id = employee_id;
        this.employeeName = employeeName;
        this.email = email;
        this.gender = gender;
        this.department = department;
    }

    public Employee() {
    }

    public boolean isIsNewEmployee() {
        return isNewEmployee;
    }

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

     public String toString() {
        return "Employee [employee_id=" + employee_id + ", employeeName=" + employeeName + ", email="
                + email + ", gender=" + gender + ", department=" + department
                + ", birth=" + birth + ", salary=" + salary + "]";
    }
    
}
