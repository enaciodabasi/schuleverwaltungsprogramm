/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.Component;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author enaci
 */
public class LehrkraftFrame extends javax.swing.JFrame {

    /**
     * Creates new form LehrkraftFrame
     */
    public LehrkraftFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lehrPnl = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        lehrKraftListe = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lehrTbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lehrPnl.setBackground(new java.awt.Color(255, 255, 255));
        lehrPnl.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 2, true));

        backBtn.setText("Go Back");
        backBtn.setPreferredSize(new java.awt.Dimension(75, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lehrKraftListe.setText("Lehrkraftliste Erstellen");
        lehrKraftListe.setPreferredSize(new java.awt.Dimension(160, 28));
        lehrKraftListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lehrKraftListeActionPerformed(evt);
            }
        });

        lehrTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vorname", "Nachname", "Adresse", "Geschlecht"
            }
        ));
        jScrollPane2.setViewportView(lehrTbl);
        if (lehrTbl.getColumnModel().getColumnCount() > 0) {
            lehrTbl.getColumnModel().getColumn(3).setPreferredWidth(300);
        }

        javax.swing.GroupLayout lehrPnlLayout = new javax.swing.GroupLayout(lehrPnl);
        lehrPnl.setLayout(lehrPnlLayout);
        lehrPnlLayout.setHorizontalGroup(
            lehrPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lehrPnlLayout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(lehrKraftListe, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lehrPnlLayout.createSequentialGroup()
                .addContainerGap(256, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        lehrPnlLayout.setVerticalGroup(
            lehrPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lehrPnlLayout.createSequentialGroup()
                .addGroup(lehrPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lehrKraftListe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lehrPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lehrPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void lehrKraftListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lehrKraftListeActionPerformed
            try{
                DefaultTableModel aModel = (DefaultTableModel)lehrTbl.getModel();
                aModel.setRowCount(0);
                
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                String userName = new com.sun.security.auth.module.NTSystem().getName();
                Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
                
                String sql = "SELECT id, Vorname, Nachname, Adresse, Geschlecht FROM lehrkraftTbl";
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                
                java.sql.ResultSetMetaData rsmd = rs.getMetaData();
                int colNo = rsmd.getColumnCount();
                while(rs.next()){
                    Object[] objects = new Object[colNo];
                    for(int i = 0; i  < colNo; i++){
                        objects[i] = rs.getObject(i+1);
                    }
                    aModel.addRow(objects);
                    lehrTbl.setModel(aModel);
                }
            }catch(Exception e){
                System.out.println("Error in connection.");
            }
    }//GEN-LAST:event_lehrKraftListeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lehrKraftListe;
    private javax.swing.JPanel lehrPnl;
    private javax.swing.JTable lehrTbl;
    // End of variables declaration//GEN-END:variables
}
