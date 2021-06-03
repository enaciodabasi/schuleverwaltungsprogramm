/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enaci
 */
public class AlleKlassenFrame extends javax.swing.JFrame {

    /**
     * Creates new form AlleKlassenFrame
     */
    public AlleKlassenFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        klasseListPnl1 = new javax.swing.JScrollPane();
        klasseListTbl = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        studTbl = new javax.swing.JTable();
        stdBtn = new javax.swing.JButton();
        klassBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(990, 490));

        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.lightGray, 2, true));

        backBtn.setText("Go Back");
        backBtn.setPreferredSize(new java.awt.Dimension(75, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        klasseListTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fachname", "ID 1", "ID 2", "ID 3", "ID 4", "ID 5", "ID 6", "ID 7", "ID 8", "ID 9", "ID 10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        klasseListTbl.setPreferredSize(new java.awt.Dimension(175, 400));
        klasseListPnl1.setViewportView(klasseListTbl);
        if (klasseListTbl.getColumnModel().getColumnCount() > 0) {
            klasseListTbl.getColumnModel().getColumn(0).setPreferredWidth(200);
        }

        studTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vorname", "Nachname"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        studTbl.setPreferredSize(new java.awt.Dimension(175, 400));
        jScrollPane1.setViewportView(studTbl);

        stdBtn.setText("Student Listen");
        stdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stdBtnActionPerformed(evt);
            }
        });

        klassBtn.setText("Klassen Listen");
        klassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klassBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(klasseListPnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(stdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                .addComponent(klassBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stdBtn)
                    .addComponent(klassBtn))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(klasseListPnl1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 809, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(8, 8, 8)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
       this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void stdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stdBtnActionPerformed
        try{
            DefaultTableModel aModel = (DefaultTableModel) studTbl.getModel();

            aModel.setRowCount(0);

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String userName = new com.sun.security.auth.module.NTSystem().getName();
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
            String sql = "select id ,Vorname, Nachname from tblStudenten";
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            int colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] objects = new Object[colNo];
                for(int i = 0; i < colNo; i++){
                    objects[i] = rs.getObject(i+1);
                }
                aModel.addRow(objects);
                studTbl.setModel(aModel);
                connection.close();
            }
        }catch(Exception e){
            System.out.println("Error in connection");
        }
    }//GEN-LAST:event_stdBtnActionPerformed

    private void klassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klassBtnActionPerformed
        try{
            
         DefaultTableModel aModel = (DefaultTableModel)klasseListTbl.getModel();
        aModel.setRowCount(0);
        
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String userName = new com.sun.security.auth.module.NTSystem().getName();
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
        
        String sql = "select Fachname ,Student1, Student2, Student3, Student4, Student5, Student6, Student7, Student8, Student9, Student10 from klasseTbl";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        
        ResultSet rs = stmt.executeQuery();
        
        java.sql.ResultSetMetaData rsmd = rs.getMetaData();
            int colNo = rsmd.getColumnCount();
            while(rs.next()){
                Object[] objects = new Object[colNo];
                for(int i = 0; i <colNo; i++){
                    objects[i] = rs.getObject(i+1);
                }
                aModel.addRow(objects);
                klasseListTbl.setModel(aModel);
                
            }
        connection.close();
            
            
        }catch(Exception e){
            System.out.println("Error in connection");
        }
    }//GEN-LAST:event_klassBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton klassBtn;
    private javax.swing.JScrollPane klasseListPnl1;
    private javax.swing.JTable klasseListTbl;
    private javax.swing.JButton stdBtn;
    private javax.swing.JTable studTbl;
    // End of variables declaration//GEN-END:variables
}
