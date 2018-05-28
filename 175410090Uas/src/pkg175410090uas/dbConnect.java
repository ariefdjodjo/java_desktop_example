/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175410090uas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dzikra
 */
public class dbConnect {
   public void registerDriver() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("SUKSES REGISTER DRIVER MYSQL");
        } catch (ClassNotFoundException ex) {
                   
        }
    }
    
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/java_uas","root", "");
        } catch (SQLException ex) {
            
            return null;
        }
    } 
}
