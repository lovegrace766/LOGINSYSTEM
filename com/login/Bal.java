/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import com.databaseCon.DB;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Bal {

    // SIGNUP METHOD
    public void insertDataSignup(Bean beanObj) {
        try {
            DB.loadConnection();

            if (DB.con == null) {
                JOptionPane.showMessageDialog(null, "Database not connected");
                return;
            }

            String query = "INSERT INTO signup VALUES (null, ?, ?, ?)";
            PreparedStatement ps = DB.con.prepareStatement(query);

            ps.setString(1, beanObj.getFullName());
            ps.setString(2, beanObj.getEmail());
            ps.setString(3, beanObj.getPass());

            int result = ps.executeUpdate();

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "You have signup successfully, now go login");
            } else {
                JOptionPane.showMessageDialog(null, "Signup failed");
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    // LOGIN METHOD
    public boolean checkLogin(String email, String pass) {
        boolean b = false;

        try {
            DB.loadConnection();

            String query = "SELECT Email, Password FROM signup WHERE Email='" 
                    + email + "' AND Password='" + pass + "'";

            Statement st = DB.con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                b = true;
            }else{
                JOptionPane.showMessageDialog(null, "Invalid email or password try again...");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e);
        }

        return b;
    }
}




