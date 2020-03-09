/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author scott.burns
 */
public class Roster {
    
    Scanner csvHandler;
    Scanner counter;
    FileReader db1;
    FileReader db2;
    Employee[] list;
    int empCount; //number of employees
    
    
    
    public Roster() throws FileNotFoundException {
        db1 = new FileReader("/Users/scott.burns/NetBeansProjects/ParsingCSV/employees.csv");
        db2 = new FileReader("/Users/scott.burns/NetBeansProjects/ParsingCSV/employees.csv");
        csvHandler = new Scanner(db1);
        csvHandler.useDelimiter(",");
        counter = new Scanner(db2);
        counter.useDelimiter(",");
        empCount = 0;
        System.out.println("huh?");
        int j = 0;
        while(counter.hasNext()) {
            String throwAway = counter.nextLine();
            System.out.println(throwAway);
            empCount++;
            System.out.println(empCount);
            j++;
        }
        list = new Employee[empCount];
        
        for(int i = 0; i < empCount; i++) {
            String id = csvHandler.next();
            System.out.println("id: " + id );
            String name = csvHandler.next();
            System.out.println("name: " + name );
            String role = csvHandler.next();
            System.out.println("role: " + role );
            String salary = csvHandler.next();
            System.out.println("salary: " + salary );
           
            
            list[i] = new Employee(id, name, role, salary);
            System.out.println(list[i]);
            System.out.println("Next: " + csvHandler.next());
        }
       
    }
    
    public String test() {
        return "&&&";
    }
    
    public String printEmplyeeList() {
        String output = "";
        for (Employee emp : list) {
            output += emp.getName() + " , ";
        }
        return output;
    }
    
    
    
}
