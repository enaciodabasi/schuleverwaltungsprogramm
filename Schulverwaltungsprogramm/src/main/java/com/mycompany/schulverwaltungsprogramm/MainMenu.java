/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;
import javax.swing.ImageIcon;
import java.net.*;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author enaci
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        mainMenuPnl = new javax.swing.JPanel();
        studMenuBtn = new javax.swing.JButton();
        classroomMenuBtn = new javax.swing.JButton();
        lehrMenuBtn = new javax.swing.JButton();
        fachMenuBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Schulverwaltungsprogramm");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(905, 350));

        mainMenuPnl.setBackground(new java.awt.Color(255, 255, 255));

        studMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studMenuBtn.setText("Student");
        studMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studMenuBtnActionPerformed(evt);
            }
        });

        classroomMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        classroomMenuBtn.setText("Klasse");
        classroomMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classroomMenuBtnActionPerformed(evt);
            }
        });

        lehrMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lehrMenuBtn.setText("Lehrkraft");
        lehrMenuBtn.setMaximumSize(new java.awt.Dimension(94, 30));
        lehrMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lehrMenuBtnActionPerformed(evt);
            }
        });

        fachMenuBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fachMenuBtn.setText("Fach");
        fachMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fachMenuBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 51, 0));
        jLabel3.setText("Schulverwaltungsprogramm");

        javax.swing.GroupLayout mainMenuPnlLayout = new javax.swing.GroupLayout(mainMenuPnl);
        mainMenuPnl.setLayout(mainMenuPnlLayout);
        mainMenuPnlLayout.setHorizontalGroup(
            mainMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPnlLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(fachMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(lehrMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(studMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(classroomMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(mainMenuPnlLayout.createSequentialGroup()
                .addGap(319, 319, 319)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuPnlLayout.setVerticalGroup(
            mainMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(170, 170, 170)
                .addGroup(mainMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lehrMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fachMenuBtn)
                    .addComponent(studMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classroomMenuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenuPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fachMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fachMenuBtnActionPerformed
        this.dispose();
        new FachFrame().setVisible(true); 
    }//GEN-LAST:event_fachMenuBtnActionPerformed

    private void lehrMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lehrMenuBtnActionPerformed
       this.dispose();
       new LehrkraftFrame().setVisible(true);
    }//GEN-LAST:event_lehrMenuBtnActionPerformed

    private void studMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studMenuBtnActionPerformed
        this.dispose();
        new StudentFrame().setVisible(true);
    }//GEN-LAST:event_studMenuBtnActionPerformed

    private void classroomMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classroomMenuBtnActionPerformed
        this.dispose();
        new KlasseFrame().setVisible(true);
    }//GEN-LAST:event_classroomMenuBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classroomMenuBtn;
    private javax.swing.JButton fachMenuBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton lehrMenuBtn;
    private javax.swing.JPanel mainMenuPnl;
    private javax.swing.JButton studMenuBtn;
    // End of variables declaration//GEN-END:variables
}