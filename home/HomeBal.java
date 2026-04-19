/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import com.databaseCon.DB;

/**
 *
 * @author Acer
 */
public class HomeBal {
    //create method for inserting data..
    
    public void insert(HomeBean homeBean){
        // now inserting code would be here..
        
        try {
             DB.loadConnection(); // connect first
            //query of insert
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
    }
}
