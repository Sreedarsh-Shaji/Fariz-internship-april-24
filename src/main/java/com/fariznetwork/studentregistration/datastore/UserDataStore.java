/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fariznetwork.studentregistration.datastore;

import java.util.ArrayList;
import com.fariznetwork.studentregistration.data.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.UUID;
import javax.swing.JOptionPane;

/**
 *
 * @author reshm
 */
public class UserDataStore {
    
   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/studentregistration";
   private static final String DATABASE_USERNAME = "root1";
   private static final String DATABASE_PASSWORD = "root1";
   
   public static String addUser(User newRegUser){
       newRegUser.setUserId(UUID.randomUUID());
       
       try{
       
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
           PreparedStatement psmt = conn.prepareStatement("INSERT INTO `user`(`ID`, `name`, `email`, `username`, `password`, `address`) VALUES "
                   + "('" + UUID.randomUUID() + "',"
                          + "'" + newRegUser.getName() + "',"
                          + "'" + newRegUser.getEmail() + "',"
                          + "'" + newRegUser.getUsername() + "',"
                          + "'" + newRegUser.getPassword() + "',"
                          + "'" + newRegUser.getAddress() + " ')");
           
           int rowsAdded = psmt.executeUpdate();
           
           if(rowsAdded > 0){
               return "Saved user";
           }
           return "saving failed";
           
       }
       catch(Exception e){
           System.out.println(e.getMessage());
       }
       
       return "USER ADDED";
   }
   
   public static void printAllUsers(){
       
   }
   
   public static int getSize(){
       return 0;
   }
    
}
