/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Turab Bajeer
 */
public class DBConnection {
    
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if(con == null){
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_department", "root", "root");
            }
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
        
        return con;
    }
    
}
