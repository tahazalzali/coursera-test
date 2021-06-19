/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.sql.*;
/**
 *
 * @author Zeinab
 */
public class mysql {
     public static void main (String [] args) throws ClassNotFoundException{
    PreparedStatement ps ;
         
         try {
           Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        
            Statement stmt =(Statement) con.createStatement();
      System.out.print("Connection : ");
      
            stmt.close();
             con.close();
       
        } 
        
  
        
        catch (SQLException e) {
            System.out.println("SQL Exception: "+e.toString());
        }
                
    }
}
