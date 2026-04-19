/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import com.databaseCon.DB;
import java.util.Date;

public class HomeBal {

    public List<HomeBean> loadData(){
        List<HomeBean> list = new ArrayList<>();

        try {
            DB.loadConnection();

            String query = "SELECT * FROM employee";
            PreparedStatement ps = DB.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("Id");
                String first_Name = rs.getString("first_name");
                String last_Name = rs.getString("last_name");
                String gender = rs.getString("gender");
                String province = rs.getString("province");
                Date date = rs.getDate("date");
                String address = rs.getString("address");
              //create homebean object
                HomeBean bean = new HomeBean(id, first_Name, last_Name, gender, province, date, address);
                list.add(bean); // add bean in list
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }

        return list;
    }

    //CREATE METHOD FOR UPDATE
    public HomeBean returnAllDataToTextFields(int id){
        HomeBean bean = null;

    try {
        DB.loadConnection();

        String query = "SELECT * FROM employee WHERE id = ?";
        PreparedStatement ps = DB.con.prepareStatement(query);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            String firstName = rs.getString("first_name");
            String lastName = rs.getString("last_name");
            String gender = rs.getString("gender");
            String province = rs.getString("province");
            java.util.Date date = rs.getDate("date");
            String address = rs.getString("address");

            bean = new HomeBean(id, firstName, lastName, gender, province, date, address);
        }
    
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "" + e);
    }

    return bean;

    }
    
    
    // ✅ NOW INSIDE CLASS
    public void insert(HomeBean homeBean){
        try {
            DB.loadConnection();

            String query = "insert into employee values (null, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = DB.con.prepareStatement(query);

            ps.setString(1, homeBean.getFirstname());
            ps.setString(2, homeBean.getLastName());
            ps.setString(3, homeBean.getGender());
            ps.setString(4, homeBean.getProvince());
            ps.setObject(5, homeBean.getDate());
            ps.setString(6, homeBean.getAddress());

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "A record has been inserted....");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }}
