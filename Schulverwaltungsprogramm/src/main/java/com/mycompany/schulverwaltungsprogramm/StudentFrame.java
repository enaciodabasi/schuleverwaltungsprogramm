/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.schulverwaltungsprogramm;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Container;
import java.awt.Component;
import java.util.Arrays;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.JList;




/**
 *
 * @author enaci
 */
public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
        initComponents();
        setDisabled(addStudPnl, false);
        setDisabled(studDeletePnl, false);
        
        addStudBtn.setBackground(Color.WHITE);
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
        addStudBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        studDeleteBtn = new javax.swing.JButton();
        studListe = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addStudPnl = new javax.swing.JPanel();
        insertStudBtn = new javax.swing.JButton();
        vornameLbl = new javax.swing.JLabel();
        nachnameLbl = new javax.swing.JLabel();
        geburtsdatumLbl = new javax.swing.JLabel();
        geschlechtLbl = new javax.swing.JLabel();
        adresseLbl = new javax.swing.JLabel();
        vornameTf = new javax.swing.JTextField();
        nachnameTf = new javax.swing.JTextField();
        geschlechtCBox = new javax.swing.JComboBox<>();
        studNumLbl = new javax.swing.JLabel();
        studNumTf = new javax.swing.JTextField();
        studNumGeneratorBtn = new javax.swing.JButton();
        datumTf = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        indexTf = new javax.swing.JTextField();
        landTf = new javax.swing.JTextField();
        stadtTf = new javax.swing.JTextField();
        plzTf = new javax.swing.JTextField();
        strasseTf = new javax.swing.JTextField();
        hausnumTf = new javax.swing.JTextField();
        t??rnumTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        studDeletePnl = new javax.swing.JPanel();
        deleteStdBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        delIndexTf = new javax.swing.JTextField();
        delIdLbl = new javax.swing.JLabel();
        delMessageLbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        studentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1750, 750));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));

        addStudBtn.setText("Neu Student/Studentin hinzuf??gen");
        addStudBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Operationen");

        studDeleteBtn.setText("Student/ Studentin L??schen");
        studDeleteBtn.setPreferredSize(new java.awt.Dimension(160, 28));
        studDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studDeleteBtnActionPerformed(evt);
            }
        });

        studListe.setText("Studentliste Erstellen");
        studListe.setPreferredSize(new java.awt.Dimension(160, 28));
        studListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studListeActionPerformed(evt);
            }
        });

        backBtn.setText("Go Back");
        backBtn.setPreferredSize(new java.awt.Dimension(75, 30));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(addStudBtn)
                        .addGap(304, 304, 304)
                        .addComponent(studDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303)
                        .addComponent(studListe, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addStudBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studListe, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addStudPnl.setBackground(new java.awt.Color(255, 255, 255));
        addStudPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        addStudPnl.setPreferredSize(new java.awt.Dimension(460, 424));

        insertStudBtn.setText("Hinzuf??gen");
        insertStudBtn.setToolTipText("");
        insertStudBtn.setPreferredSize(new java.awt.Dimension(80, 50));
        insertStudBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertStudBtnActionPerformed(evt);
            }
        });

        vornameLbl.setText("Vorname:");

        nachnameLbl.setText("Nachname:");

        geburtsdatumLbl.setText("Geburtsdatum:");

        geschlechtLbl.setText("Geschlecht:");

        adresseLbl.setText("Adresse:");

        geschlechtCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bitte ein Geschlecht w??hlen", "Frau", "Mann" }));

        studNumLbl.setText("Studentnummer:");

        studNumGeneratorBtn.setText("Generate");
        studNumGeneratorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studNumGeneratorBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Index:");

        jLabel4.setText("Land:");

        jLabel5.setText("Stadt:");

        jLabel6.setText("PLZ:");

        jLabel7.setText("Stra??e");

        jLabel8.setText("Hausno:");

        jLabel9.setText("T??rNo:");

        javax.swing.GroupLayout addStudPnlLayout = new javax.swing.GroupLayout(addStudPnl);
        addStudPnl.setLayout(addStudPnlLayout);
        addStudPnlLayout.setHorizontalGroup(
            addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addStudPnlLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vornameLbl)
                    .addComponent(nachnameLbl)
                    .addComponent(geburtsdatumLbl)
                    .addComponent(geschlechtLbl)
                    .addComponent(adresseLbl)
                    .addComponent(studNumLbl))
                .addGap(32, 32, 32)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudPnlLayout.createSequentialGroup()
                        .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(vornameTf)
                                .addComponent(nachnameTf)
                                .addGroup(addStudPnlLayout.createSequentialGroup()
                                    .addComponent(studNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(studNumGeneratorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(datumTf, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudPnlLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(indexTf, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(addStudPnlLayout.createSequentialGroup()
                                .addComponent(resetBtn)
                                .addGap(75, 75, 75))))
                    .addGroup(addStudPnlLayout.createSequentialGroup()
                        .addComponent(insertStudBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addStudPnlLayout.createSequentialGroup()
                        .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addStudPnlLayout.createSequentialGroup()
                                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(addStudPnlLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(2, 2, 2)))
                                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(strasseTf, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(landTf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(stadtTf, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(hausnumTf))
                                .addGap(18, 18, 18)
                                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t??rnumTf, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(plzTf)))
                            .addComponent(geschlechtCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        addStudPnlLayout.setVerticalGroup(
            addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addStudPnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vornameLbl)
                    .addComponent(vornameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetBtn)
                    .addComponent(nachnameLbl)
                    .addComponent(nachnameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studNumLbl)
                    .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studNumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(studNumGeneratorBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(indexTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(datumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(geburtsdatumLbl)))
                .addGap(18, 18, 18)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geschlechtLbl)
                    .addComponent(geschlechtCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adresseLbl)
                    .addComponent(landTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stadtTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plzTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(addStudPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(strasseTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hausnumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t??rnumTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(insertStudBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        studDeletePnl.setBackground(new java.awt.Color(255, 255, 255));
        studDeletePnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        deleteStdBtn.setText("L??schen");
        deleteStdBtn.setToolTipText("");
        deleteStdBtn.setPreferredSize(new java.awt.Dimension(80, 50));
        deleteStdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStdBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("W??hlt Student ID von dem Studentliste, um er zu l??schen");

        delIdLbl.setText("ID:");

        javax.swing.GroupLayout studDeletePnlLayout = new javax.swing.GroupLayout(studDeletePnl);
        studDeletePnl.setLayout(studDeletePnlLayout);
        studDeletePnlLayout.setHorizontalGroup(
            studDeletePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studDeletePnlLayout.createSequentialGroup()
                .addGroup(studDeletePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studDeletePnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studDeletePnlLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(deleteStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studDeletePnlLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(delMessageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studDeletePnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(delIdLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delIndexTf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studDeletePnlLayout.setVerticalGroup(
            studDeletePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studDeletePnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(studDeletePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delIndexTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delIdLbl))
                .addGap(46, 46, 46)
                .addComponent(delMessageLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteStdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        studentTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        studentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Vorname", "Nachname", "Geschlecht", "Adresse", "Geburtsdatum", "Studentnummer"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(studentTable);
        if (studentTable.getColumnModel().getColumnCount() > 0) {
            studentTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            studentTable.getColumnModel().getColumn(4).setPreferredWidth(300);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(addStudPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(studDeletePnl, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1744, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studDeletePnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudPnl, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteStdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStdBtnActionPerformed

        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String userName = new com.sun.security.auth.module.NTSystem().getName();
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
            String delSql = "DELETE FROM tblStudenten WHERE id = ?";
            PreparedStatement delStmt = connection.prepareStatement(delSql);
            delStmt.setString(1, delIndexTf.getText());
            delStmt.executeUpdate();

            delMessageLbl.setForeground(Color.GREEN);
            delMessageLbl.setText("Student mit ID " + delIndexTf.getText() + "ist gel??scht!");
            connection.close();
        }catch(Exception e){
            delMessageLbl.setForeground(Color.RED);
            delMessageLbl.setText("Konnte den Student nicht finden!");
            System.err.println(e.getMessage());
        }

    }//GEN-LAST:event_deleteStdBtnActionPerformed

    private void studListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studListeActionPerformed

        try{
            DefaultTableModel aModel = (DefaultTableModel) studentTable.getModel();

            aModel.setRowCount(0);

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String userName = new com.sun.security.auth.module.NTSystem().getName();
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
            String sql = "select id ,Vorname, Nachname, Geschlecht, Adresse, Geburtsdatum, Studentnummer from tblStudenten";
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
                studentTable.setModel(aModel);
                connection.close();
            }
        }catch(Exception e){
            System.out.println("Error in connection");
        }

    }//GEN-LAST:event_studListeActionPerformed

    private void studDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studDeleteBtnActionPerformed
        if(deleteStdBtn.isEnabled())
        setDisabled(studDeletePnl, false);
        else if(!deleteStdBtn.isEnabled())
        setDisabled(studDeletePnl, true);
    }//GEN-LAST:event_studDeleteBtnActionPerformed

    private void addStudBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudBtnActionPerformed
        if(studNumGeneratorBtn.isEnabled())
        setDisabled(addStudPnl, false);
        else if(!studNumGeneratorBtn.isEnabled())
        setDisabled(addStudPnl, true);
    }//GEN-LAST:event_addStudBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed

        int input = JOptionPane.showConfirmDialog(null, "Sind sie sicher?");
        // 0 = yes, 1 = no, 2 = cancel
        if(input == 0)
        resetAddStudComponents();
        else
        ;

    }//GEN-LAST:event_resetBtnActionPerformed

    private void studNumGeneratorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studNumGeneratorBtnActionPerformed
        int randomNumb = (int)Math.floor(Math.random() * (701 - 1 + 1) + 1);

        studNumTf.setText(String.valueOf(randomNumb));
    }//GEN-LAST:event_studNumGeneratorBtnActionPerformed

    private void insertStudBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertStudBtnActionPerformed
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String userName = new com.sun.security.auth.module.NTSystem().getName();
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\" + userName + "\\Documents\\NetBeansProjects\\Schulverwaltungsprogramm\\src\\main\\studentDB.accdb");
            
            Adresse adres = new Adresse(landTf.getText(), stadtTf.getText(), plzTf.getText(), strasseTf.getText(), hausnumTf.getText(), t??rnumTf.getText());
            Student st = new Student(studNumTf.getText(),vornameTf.getText(), nachnameTf.getText(), datumTf.getText(), (String)geschlechtCBox.getSelectedItem(), adres);

            String q = "INSERT INTO tblStudenten ([id], [Vorname], [Nachname], [Geschlecht], [Adresse], [Geburtsdatum], [Studentnummer]) VALUES (? ,? , ?, ?, ?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(q);
            
            String studAdres = st.getAdres().getLand() + ", " + st.getAdres().getStadt() + ", " + st.getAdres().getPlz() + ", " + st.getAdres().getStrasse() + ", No:" + st.getAdres().getHausnummer() + ", D:" + st.getAdres().getT??rnummer();
            
            stmt.setString(1, indexTf.getText());
            stmt.setString(2, st.getVorname());
            stmt.setString(3, st.getNachname());
            stmt.setString(4, st.getGeschlect());
            stmt.setString(5, studAdres);
            stmt.setString(6, st.getDate());
            stmt.setString(7, st.getStdnum());
            stmt.executeUpdate();
            connection.close();
            st = new Student();
        }catch(Exception e){

        }
    }//GEN-LAST:event_insertStudBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed
    
   
    private void resetAddStudComponents(){
        vornameTf.setText("");
        nachnameTf.setText("");
        datumTf.setText("");
        geschlechtCBox.setSelectedIndex(0);
        
    }
    
   private Component[] getComponents(Component container) {
        ArrayList<Component> list = null;

        try {
            list = new ArrayList<Component>(Arrays.asList(
                  ((Container) container).getComponents()));
            for (int index = 0; index < list.size(); index++) {
                for (Component currentComponent : getComponents(list.get(index))) {
                    list.add(currentComponent);
                }
            }
        } catch (ClassCastException e) {
            list = new ArrayList<Component>();
        }

        return list.toArray(new Component[list.size()]);
        }
   
   private void setDisabled(Component container, boolean enabled){
       for(Component component : getComponents(container)){
           component.setEnabled(enabled);
       }
   }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudBtn;
    private javax.swing.JPanel addStudPnl;
    private javax.swing.JLabel adresseLbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField datumTf;
    private javax.swing.JLabel delIdLbl;
    private javax.swing.JTextField delIndexTf;
    private javax.swing.JLabel delMessageLbl;
    private javax.swing.JButton deleteStdBtn;
    private javax.swing.JLabel geburtsdatumLbl;
    private javax.swing.JComboBox<String> geschlechtCBox;
    private javax.swing.JLabel geschlechtLbl;
    private javax.swing.JTextField hausnumTf;
    private javax.swing.JTextField indexTf;
    private javax.swing.JButton insertStudBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField landTf;
    private javax.swing.JLabel nachnameLbl;
    private javax.swing.JTextField nachnameTf;
    private javax.swing.JTextField plzTf;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField stadtTf;
    private javax.swing.JTextField strasseTf;
    private javax.swing.JButton studDeleteBtn;
    private javax.swing.JPanel studDeletePnl;
    private javax.swing.JButton studListe;
    private javax.swing.JButton studNumGeneratorBtn;
    private javax.swing.JLabel studNumLbl;
    private javax.swing.JTextField studNumTf;
    private javax.swing.JTable studentTable;
    private javax.swing.JTextField t??rnumTf;
    private javax.swing.JLabel vornameLbl;
    private javax.swing.JTextField vornameTf;
    // End of variables declaration//GEN-END:variables
}
