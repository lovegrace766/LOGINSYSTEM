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
    private int id;
    private String first_name;
    private String last_Name;
    private String gender;
    private String province;
    private Date date;
    private String address;
    
    //constructor..

    public HomeBean(int id, String first_name, String last_Name, String gender, String province, Date date, String address) {
        this.id = id;
        this.first_name = first_name;
        this.last_Name = last_Name;
        this.gender = gender;
        this.province = province;
        this.date = date;
        this.address = address;
    }
    // getter and setter methods..

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return first_name;
    }

    public void setFirstname(String firstname) {
        this.first_name = firstname;
    }

    public String getLastName() {
        return last_Name;
    }

    public void setLastName(String lastName) {
        this.last_Name = lastName;
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


    

        

    
    
    
    

