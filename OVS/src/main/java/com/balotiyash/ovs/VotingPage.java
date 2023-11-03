package com.balotiyash.ovs;

import java.awt.Color;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VotingPage extends javax.swing.JFrame {

    public VotingPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        voteLogo_lbl = new javax.swing.JLabel();
        nvsp_lbl = new javax.swing.JLabel();
        vote_lbl = new javax.swing.JLabel();
        note_lbl = new javax.swing.JLabel();
        voterId_lbl = new javax.swing.JLabel();
        voterId_pf = new javax.swing.JPasswordField();
        name_tf = new javax.swing.JTextField();
        name_lbl = new javax.swing.JLabel();
        aadhar_lbl = new javax.swing.JLabel();
        aadhar_pf = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        bspLogo_lbl = new javax.swing.JLabel();
        aapLogo_lbl = new javax.swing.JLabel();
        incLogo_lbl = new javax.swing.JLabel();
        bjpLogo_lbl = new javax.swing.JLabel();
        cpiLogo_lbl = new javax.swing.JLabel();
        aap_rdo = new javax.swing.JRadioButton();
        bjp_rdo = new javax.swing.JRadioButton();
        bsp_rdo = new javax.swing.JRadioButton();
        cpi_rdo = new javax.swing.JRadioButton();
        inc_rdo = new javax.swing.JRadioButton();
        submit_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        aap_lbl = new javax.swing.JLabel();
        bjp_lbl = new javax.swing.JLabel();
        inc_lbl = new javax.swing.JLabel();
        cpi_lbl = new javax.swing.JLabel();
        bsp_lbl = new javax.swing.JLabel();
        verify_btn1 = new javax.swing.JButton();
        verify_btn2 = new javax.swing.JButton();
        verify_btn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Voting System - New Voting");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        voteLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\VotingImg2 - 200.jpg")); // NOI18N

        nvsp_lbl.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        nvsp_lbl.setText("NATIONAL VOTERS' SERVICE PORTAL");

        vote_lbl.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        vote_lbl.setForeground(new java.awt.Color(0, 0, 153));
        vote_lbl.setText("Register Your Vote");

        note_lbl.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        note_lbl.setForeground(new java.awt.Color(255, 0, 0));
        note_lbl.setText("**Note: Please fill the form carefully. Enter your valid VoterID and verify it before Voting. Once voted you will not be able to change your choice.**");

        voterId_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        voterId_lbl.setText("Enter your Voter ID");

        voterId_pf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        name_tf.setEditable(false);
        name_tf.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N

        name_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        name_lbl.setText("Your Full Name");

        aadhar_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        aadhar_lbl.setText("Enter Last 4 Digits of your Aadhar Number");

        aadhar_pf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        bspLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\BSP.png")); // NOI18N
        bspLogo_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bspLogo_lblMouseClicked(evt);
            }
        });

        aapLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\AAP.jpeg")); // NOI18N
        aapLogo_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aapLogo_lblMouseClicked(evt);
            }
        });

        incLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\INC.png")); // NOI18N
        incLogo_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                incLogo_lblMouseClicked(evt);
            }
        });

        bjpLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\BJP.jpeg")); // NOI18N
        bjpLogo_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bjpLogo_lblMouseClicked(evt);
            }
        });

        cpiLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\CPI2.png")); // NOI18N
        cpiLogo_lbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cpiLogo_lblMouseClicked(evt);
            }
        });

        buttonGroup1.add(aap_rdo);
        aap_rdo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        aap_rdo.setText("AAP");
        aap_rdo.setEnabled(false);

        buttonGroup1.add(bjp_rdo);
        bjp_rdo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bjp_rdo.setText("BJP");
        bjp_rdo.setEnabled(false);

        buttonGroup1.add(bsp_rdo);
        bsp_rdo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        bsp_rdo.setText("BSP");
        bsp_rdo.setEnabled(false);

        buttonGroup1.add(cpi_rdo);
        cpi_rdo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cpi_rdo.setText("CPI");
        cpi_rdo.setEnabled(false);

        buttonGroup1.add(inc_rdo);
        inc_rdo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        inc_rdo.setText("INC");
        inc_rdo.setEnabled(false);

        submit_btn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        submit_btn.setText("SUBMIT");
        submit_btn.setEnabled(false);
        submit_btn.setPreferredSize(new java.awt.Dimension(150, 49));
        submit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_btnActionPerformed(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        exit_btn.setText("EXIT");
        exit_btn.setPreferredSize(new java.awt.Dimension(150, 49));
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        aap_lbl.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        aap_lbl.setForeground(new java.awt.Color(255, 0, 0));
        aap_lbl.setText("Aam Aadmi Party");

        bjp_lbl.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        bjp_lbl.setForeground(new java.awt.Color(255, 0, 0));
        bjp_lbl.setText("Bharatiya Janta Party");

        inc_lbl.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        inc_lbl.setForeground(new java.awt.Color(255, 0, 0));
        inc_lbl.setText("Indain National Congress");

        cpi_lbl.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        cpi_lbl.setForeground(new java.awt.Color(255, 0, 0));
        cpi_lbl.setText("Communist Party of India");

        bsp_lbl.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        bsp_lbl.setForeground(new java.awt.Color(255, 0, 0));
        bsp_lbl.setText("Bahujan Samaj Party");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(aap_rdo)
                        .addGap(146, 146, 146)
                        .addComponent(bjp_rdo)
                        .addGap(150, 150, 150)
                        .addComponent(bsp_rdo)
                        .addGap(158, 158, 158)
                        .addComponent(cpi_rdo)
                        .addGap(153, 153, 153)
                        .addComponent(inc_rdo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aapLogo_lbl)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(aap_lbl)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bjpLogo_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(bspLogo_lbl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(bjp_lbl)
                                .addGap(62, 62, 62)
                                .addComponent(bsp_lbl)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cpi_lbl)
                                .addGap(26, 26, 26)
                                .addComponent(inc_lbl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cpiLogo_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(incLogo_lbl)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aapLogo_lbl)
                    .addComponent(bjpLogo_lbl)
                    .addComponent(incLogo_lbl)
                    .addComponent(bspLogo_lbl)
                    .addComponent(cpiLogo_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aap_rdo)
                    .addComponent(bjp_rdo)
                    .addComponent(bsp_rdo)
                    .addComponent(cpi_rdo)
                    .addComponent(inc_rdo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aap_lbl)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inc_lbl)
                        .addComponent(cpi_lbl))
                    .addComponent(bjp_lbl)
                    .addComponent(bsp_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(submit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        verify_btn1.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        verify_btn1.setText("Verify");
        verify_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify_btn1ActionPerformed(evt);
            }
        });

        verify_btn2.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        verify_btn2.setText("Verify");
        verify_btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify_btn2ActionPerformed(evt);
            }
        });

        verify_btn3.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        verify_btn3.setText("Verify");
        verify_btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify_btn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(voteLogo_lbl)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(vote_lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nvsp_lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(note_lbl)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aadhar_lbl)
                            .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(voterId_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aadhar_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(verify_btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(voterId_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(verify_btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(verify_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voteLogo_lbl)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(nvsp_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(vote_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(note_lbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voterId_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verify_btn1)
                    .addComponent(voterId_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verify_btn2)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verify_btn3)
                    .addComponent(aadhar_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aadhar_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    boolean flag1 = false, flag2 = false, flag3 = false;
    String aadharOTP, $voterID;

    private void verify_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify_btn1ActionPerformed
        // TODO add your handling code here:
        String voterId = new String(voterId_pf.getPassword());
//        int voterId = Integer.parseInt(voterIdTxt);

        try {
            String query = "SELECT * FROM voters where voter_id = ?";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, voterId);
            ResultSet rs = st.executeQuery();  // Corrected to use executeQuery()
        
            if (rs.next()) {
                $voterID = rs.getString("voter_id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String aadhar = rs.getString("aadhar_no");

                name_tf.setText(fname + " " + lname);

                aadharOTP = getLastFourDigits(aadhar);
            } else {
                JOptionPane.showMessageDialog(null, "Voter with the Voter ID " + voterId + " do not exist.\n Please Register yourself first.", "Voter Not Found", JOptionPane.ERROR_MESSAGE);
                voterId_pf.setText("");
                name_tf.setText("");
                aadhar_pf.setText("");
                // flag2 = false;
            }
            
            flag2 = false;
            name_tf.setBackground(new Color(242, 242, 242));

            st.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Error in fetching data: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
    }//GEN-LAST:event_verify_btn1ActionPerformed

    private void verify_btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify_btn2ActionPerformed
        // TODO add your handling code here:
        if (name_tf.getText().isEmpty()) {
            flag2 = false;
            JOptionPane.showMessageDialog(null, "Please Verify your Voter ID.", "Field Verification Failed", JOptionPane.ERROR_MESSAGE);
        } else {
            flag2 = true;
            name_tf.setBackground(Color.GREEN);
        }
        // System.out.println("flag2 = " + flag2);
    }//GEN-LAST:event_verify_btn2ActionPerformed

    private void verify_btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify_btn3ActionPerformed
        // TODO add your handling code here:
        String aadhar = new String(aadhar_pf.getPassword());

        if (aadhar.equals(aadharOTP)) {
            try {
                String query = "SELECT * FROM votes WHERE voter_id = ?";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1, $voterID);
                ResultSet rs = st.executeQuery();  // Corrected to use executeQuery()
            
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Voter with the Voter ID " + $voterID + " has alerady Voated.\nYou cannot vote again.", "Voting Result Submission Failed.", JOptionPane.ERROR_MESSAGE);
                    resetFields();
                } else {
                    if (flag2) {
                        JOptionPane.showMessageDialog(null, "Select your Candidate Carefully.", "Select Candidate.", JOptionPane.INFORMATION_MESSAGE);
                        aap_rdo.setEnabled(true);
                        bjp_rdo.setEnabled(true);
                        bsp_rdo.setEnabled(true);
                        cpi_rdo.setEnabled(true);
                        inc_rdo.setEnabled(true);
                        aap_lbl.setEnabled(true);
                        bjp_lbl.setEnabled(true);
                        bsp_lbl.setEnabled(true);
                        cpi_lbl.setEnabled(true);
                        inc_lbl.setEnabled(true);
                        submit_btn.setEnabled(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please Verify all Fields.", "Field Verification Failed", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                st.close();
                rs.close();
                con.close();
            } catch (SQLException e) {
                System.err.println("Error in fetching data: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR: " + e);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Aadhar Number.", "Field Verification Failed", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verify_btn3ActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(  
            null,
            "Are you sure? You want to cancel this Activity?\nNote: You will be navigated to Home Page." ,
            "Confirm Exit",
            JOptionPane.YES_NO_OPTION
        );

        if(n == JOptionPane.YES_OPTION) {
            HomePage hp = new HomePage();
            dispose();
            hp.display();
        }
    }//GEN-LAST:event_exit_btnActionPerformed

    private void aapLogo_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aapLogo_lblMouseClicked
        // TODO add your handling code here:
        if (aap_rdo.isEnabled())
            aap_rdo.setSelected(true);
    }//GEN-LAST:event_aapLogo_lblMouseClicked

    private void bjpLogo_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bjpLogo_lblMouseClicked
        // TODO add your handling code here:
        if (bjp_rdo.isEnabled())
            bjp_rdo.setSelected(true);
    }//GEN-LAST:event_bjpLogo_lblMouseClicked

    private void bspLogo_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bspLogo_lblMouseClicked
        // TODO add your handling code here:
        if (bsp_rdo.isEnabled())
            bsp_rdo.setSelected(true);
    }//GEN-LAST:event_bspLogo_lblMouseClicked

    private void cpiLogo_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cpiLogo_lblMouseClicked
        // TODO add your handling code here:
        if (cpi_rdo.isEnabled())
            cpi_rdo.setSelected(true);
    }//GEN-LAST:event_cpiLogo_lblMouseClicked

    private void incLogo_lblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_incLogo_lblMouseClicked
        // TODO add your handling code here:
        if (inc_rdo.isEnabled())
            inc_rdo.setSelected(true);
    }//GEN-LAST:event_incLogo_lblMouseClicked

    private void submit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_btnActionPerformed
        // TODO add your handling code here:
        try {
            // Establish the database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
            
            // Create a prepared statement with the insert query
            String query = "INSERT INTO VOTES VALUES (?, ?, ?, ?);";

            PreparedStatement pstmt = con.prepareStatement(query);

            Date currentDate = new Date();
            InetAddress ipAddress = InetAddress.getLocalHost();

            String candidate = null, candidate_ff = null;

            if (aap_rdo.isSelected()) {
                candidate = aap_rdo.getText();
                candidate_ff = aap_lbl.getText();
            } else if (bjp_rdo.isSelected()) {
                candidate = bjp_rdo.getText();
                candidate_ff = bjp_lbl.getText();
            } else if (bsp_rdo.isSelected()) {
                candidate = bsp_rdo.getText();
                candidate_ff = bsp_lbl.getText();
            } else if (cpi_rdo.isSelected()) {
                candidate = cpi_rdo.getText();
                candidate_ff = cpi_lbl.getText();
            } else if (inc_rdo.isSelected()) {
                candidate = inc_rdo.getText();
                candidate_ff = inc_lbl.getText();
            }

            if ("".equals(candidate)) {
                JOptionPane.showMessageDialog(null, "Please Select Your Candidate before Submitting.", "Select Candidate", JOptionPane.ERROR_MESSAGE);
                return;
            }

            int n = JOptionPane.showConfirmDialog(  
                null,
                candidate_ff + " - " + candidate + "\nYou selected '" + candidate + "' as your Governer.\nNote: Once you've made a selection, it cannot be changed later.",
                "Confirm Submit",
                JOptionPane.YES_NO_OPTION
            );

            if(n == JOptionPane.YES_OPTION) {
        
                // Set the parameter values
                pstmt.setString(1, $voterID);
                pstmt.setString(2, candidate);
                pstmt.setString(3, currentDate.toString());
                pstmt.setString(4, ipAddress.toString());
            
                // Execute the update
                int rowsInserted = pstmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("A new row has been inserted successfully.");
                } else {
                    System.out.println("Insert failed.");
                }
                
                pstmt.close();
                con.close();

                JOptionPane.showMessageDialog(this, "Your Vote is Registered Successfully.", "Vote Saved.", JOptionPane.INFORMATION_MESSAGE);
                resetFields();
            }
        } catch (SQLException e) {
            System.err.println("Error during SQL insert: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e);
        }
        
    }//GEN-LAST:event_submit_btnActionPerformed

    // public static void main(String args[]) {
    void display() {
        VotingPage vp = new VotingPage();
        vp.setVisible(true);
    }

    public static String getLastFourDigits(String number) {
        // Convert the number to a string
        // String numberString = Long.toString(number);

        // Check if the number has at least four digits
        // if (number.length() < 4) {
        //     return "Number has less than four digits.";
        // }

        // Get the last four digits
        return number.substring(number.length() - 4);
    }

    void resetFields() {
        voterId_pf.setText("");
        name_tf.setText("");
        name_tf.setBackground(new Color(242, 242, 242));
        aadhar_pf.setText("");

        aap_rdo.setEnabled(false);
        bjp_rdo.setEnabled(false);
        bsp_rdo.setEnabled(false);
        cpi_rdo.setEnabled(false);
        inc_rdo.setEnabled(false);
        submit_btn.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadhar_lbl;
    private javax.swing.JPasswordField aadhar_pf;
    private javax.swing.JLabel aapLogo_lbl;
    private javax.swing.JLabel aap_lbl;
    private javax.swing.JRadioButton aap_rdo;
    private javax.swing.JLabel bjpLogo_lbl;
    private javax.swing.JLabel bjp_lbl;
    private javax.swing.JRadioButton bjp_rdo;
    private javax.swing.JLabel bspLogo_lbl;
    private javax.swing.JLabel bsp_lbl;
    private javax.swing.JRadioButton bsp_rdo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cpiLogo_lbl;
    private javax.swing.JLabel cpi_lbl;
    private javax.swing.JRadioButton cpi_rdo;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel incLogo_lbl;
    private javax.swing.JLabel inc_lbl;
    private javax.swing.JRadioButton inc_rdo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTextField name_tf;
    private javax.swing.JLabel note_lbl;
    private javax.swing.JLabel nvsp_lbl;
    private javax.swing.JButton submit_btn;
    private javax.swing.JButton verify_btn1;
    private javax.swing.JButton verify_btn2;
    private javax.swing.JButton verify_btn3;
    private javax.swing.JLabel voteLogo_lbl;
    private javax.swing.JLabel vote_lbl;
    private javax.swing.JLabel voterId_lbl;
    private javax.swing.JPasswordField voterId_pf;
    // End of variables declaration//GEN-END:variables
}
