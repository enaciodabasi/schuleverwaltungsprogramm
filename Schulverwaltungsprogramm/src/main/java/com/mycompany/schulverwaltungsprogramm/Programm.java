/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
/**
 *
 * @author enaci
 */
public class Programm {
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
        
        
        /*
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String userName = new com.sun.security.auth.module.NTSystem().getName();
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
            String colSql = "SELECT * FROM tblStudenten";
            PreparedStatement colStmt = connection.prepareStatement(colSql);
            ResultSet colRs = colStmt.executeQuery();
            ResultSetMetaData rsmd = colRs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            System.out.println(columnCount);
        }catch(Exception e){
            
        }
        */
    }
    
   

}
