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
public class NameHandler {
    private String firstName;
    private String lastName;
    private int x;
    private String combine;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
        //return "garbage";
    }

    public String getLastName() {
        return lastName;
    }
   

    public String getCombine() {
        return combine;
    }
    
    public String combine() {
        return getLastName() + ", " + getFirstName();
    }
    
    public NameHandler() {
        firstName = null;
        lastName = null;
        
        x = 10;
    }
    
    public NameHandler(String name) {
        this.firstName = name;
        x = 10;
    }

  

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }
    
    public String combine(int in, String inString)  {
        return inString + ":" +in;
    }
    
    public String test() {
        return "***";
    }
}
