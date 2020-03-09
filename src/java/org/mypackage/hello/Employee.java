/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

/**
 *
 * @author scott.burns
 */
public class Employee {
    
    private String ID;
    private String name;
    private String role;
    private String salary;

    public Employee(String ID, String name, String role, String salary) {
        this.ID = ID;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getSalary() {
        return salary;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", role=" + role + ", salary=" + salary + '}';
    }
    
    
    
    
    
}
