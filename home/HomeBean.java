/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class HomeBean {
    //create here instanca variable..
    
    private String firstname;
    private String lastName;
    private String gender;
    private String province;
    private Date date;
    private String address;
    
    //constructor..

    public HomeBean(String firstname, String lastName, String gender, String province, Date date, String address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.gender = gender;
        this.province = province;
        this.date = date;
        this.address = address;
    }
    // getter and setter methods..

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    

    
    }


    

        

    
    
    
    

