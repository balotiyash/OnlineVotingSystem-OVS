package com.balotiyash.ovs;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class RegistrationPage extends javax.swing.JFrame {

    int otp, voter_id;
    boolean flag = false;
    public RegistrationPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        voteLogo_lbl = new javax.swing.JLabel();
        nvsp_lbl = new javax.swing.JLabel();
        registration_lbl = new javax.swing.JLabel();
        fname_lbl = new javax.swing.JLabel();
        lname_lbl = new javax.swing.JLabel();
        mobile_lbl = new javax.swing.JLabel();
        otp_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        aadhar_lbl = new javax.swing.JLabel();
        dob_lbl = new javax.swing.JLabel();
        gender_lbl = new javax.swing.JLabel();
        state_lbl = new javax.swing.JLabel();
        fname_tf = new javax.swing.JTextField();
        lname_tf = new javax.swing.JTextField();
        dob_dc = new com.toedter.calendar.JDateChooser();
        male_rbtn = new javax.swing.JRadioButton();
        female_rbtn = new javax.swing.JRadioButton();
        others_rbtn = new javax.swing.JRadioButton();
        state_cmb = new javax.swing.JComboBox<>();
        aadhar_tf = new javax.swing.JTextField();
        mobile_tf = new javax.swing.JTextField();
        otp_tf = new javax.swing.JTextField();
        email_tf = new javax.swing.JTextField();
        verify_btn = new javax.swing.JButton();
        otp_btn = new javax.swing.JButton();
        note_lbl = new javax.swing.JLabel();
        reset_btn = new javax.swing.JButton();
        cancel_btn = new javax.swing.JButton();
        save_btn = new javax.swing.JButton();
        otpMain_tf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Voter Registration Form");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        voteLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\VotingImg2 - 200.jpg")); // NOI18N

        nvsp_lbl.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        nvsp_lbl.setText("NATIONAL VOTERS' SERVICE PORTAL");

        registration_lbl.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        registration_lbl.setForeground(new java.awt.Color(0, 0, 153));
        registration_lbl.setText("New Voter Registration");

        fname_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        fname_lbl.setText("First Name");

        lname_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        lname_lbl.setText("Last Name");

        mobile_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        mobile_lbl.setText("Mobile Number");

        otp_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        otp_lbl.setText("OTP");

        email_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        email_lbl.setText("Email ID");

        aadhar_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        aadhar_lbl.setText("Aadhar Number");

        dob_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        dob_lbl.setText("Date of Birth");

        gender_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        gender_lbl.setText("Gender");

        state_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        state_lbl.setText("State");

        fname_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        lname_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        dob_dc.setBackground(new java.awt.Color(255, 255, 255));
        dob_dc.setDateFormatString("yyyy-MM-dd");
        dob_dc.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        male_rbtn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(male_rbtn);
        male_rbtn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        male_rbtn.setText("MALE");
        male_rbtn.setPreferredSize(new java.awt.Dimension(110, 47));

        female_rbtn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(female_rbtn);
        female_rbtn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        female_rbtn.setText("FEMALE");
        female_rbtn.setPreferredSize(new java.awt.Dimension(110, 47));

        others_rbtn.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(others_rbtn);
        others_rbtn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        others_rbtn.setText("OTHERS");
        others_rbtn.setPreferredSize(new java.awt.Dimension(110, 47));

        state_cmb.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        state_cmb.setMaximumRowCount(5);
        state_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-+-+-Select State-+-+-", "ANDHRA PRADESH", "ARUNACHAL PRADESH", "ASSAM", "BIHAR", "CHHATTISGARH", "GOA", "GUJARAT", "HARYANA", "HIMACHAL PRADESH", "JHARKHAND", "KARNATAKA", "KERALA", "MADHYA PRADESH", "MAHARASHTRA", "MANIPUR", "MEGHALAYA", "MIZORAM", "NAGALAND", "ODISHA", "PUNJAB", "RAJASTHAN", "SIKKIM", "TAMIL NADU", "TELANGANA", "TRIPURA", "UTTAR PRADESH", "UTTARAKHAND", "WEST BENGAL", "CHANDIGARH", "DELHI", "LAKSHADWEEP", "PUDUCHERRY" }));

        aadhar_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        mobile_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        otp_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        otp_tf.setEnabled(false);

        email_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N

        verify_btn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        verify_btn.setText("Verify");
        verify_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verify_btnActionPerformed(evt);
            }
        });

        otp_btn.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        otp_btn.setText("Send OTP");
        otp_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otp_btnActionPerformed(evt);
            }
        });

        note_lbl.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        note_lbl.setForeground(new java.awt.Color(255, 0, 0));
        note_lbl.setText("**Note: Please fill the form carefully. All the fields are Mandatory to fill. Incomplete form will not be registered & Application will be cancelled.**");

        reset_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Refresh155.jpg")); // NOI18N
        reset_btn.setContentAreaFilled(false);
        reset_btn.setPreferredSize(new java.awt.Dimension(155, 155));
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        cancel_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Cancel155.jpg")); // NOI18N
        cancel_btn.setContentAreaFilled(false);
        cancel_btn.setPreferredSize(new java.awt.Dimension(155, 155));
        cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btnActionPerformed(evt);
            }
        });

        save_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Correct155.jpg")); // NOI18N
        save_btn.setPreferredSize(new java.awt.Dimension(155, 155));
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        otpMain_tf.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        otpMain_tf.setEnabled(false);

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
                        .addComponent(registration_lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nvsp_lbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(note_lbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aadhar_lbl)
                    .addComponent(fname_lbl)
                    .addComponent(lname_lbl)
                    .addComponent(dob_lbl)
                    .addComponent(gender_lbl)
                    .addComponent(state_lbl)
                    .addComponent(otp_lbl)
                    .addComponent(mobile_lbl)
                    .addComponent(email_lbl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(male_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(female_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(others_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lname_tf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname_tf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dob_dc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(state_cmb, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aadhar_tf, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mobile_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(otpMain_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(otp_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(otp_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(verify_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(email_tf))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voteLogo_lbl)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname_lbl)
                            .addComponent(fname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lname_lbl)
                            .addComponent(lname_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dob_dc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dob_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender_lbl)
                            .addComponent(male_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(others_rbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(state_lbl)
                            .addComponent(state_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aadhar_lbl)
                            .addComponent(aadhar_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(nvsp_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(registration_lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(note_lbl)
                        .addGap(29, 29, 29)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 157, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobile_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otpMain_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otp_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobile_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(verify_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(otp_tf, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(otp_lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_lbl))
                        .addGap(3, 3, 3))
                    .addComponent(cancel_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 742, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void otp_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otp_btnActionPerformed
        // TODO add your handling code here:
        // Validation for mobileNo (10 digits only)
        OTPGenerator otpg = new OTPGenerator();
        String mobileNo = mobile_tf.getText().trim();

        if (!Pattern.matches("^[789]\\d{9}", mobileNo)) {
            JOptionPane.showMessageDialog(this, "Mobile No. should be Valid.", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;  // Stop processing further
        }
        try {
            otp = otpg.generateOTP(mobileNo);
            
            otpMain_tf.setText(Integer.toString(otp));
            JOptionPane.showMessageDialog(null, "An OTP is been sent to " + mobileNo + ". Please verify it before submitting the application.", "OTP Sent Successfully.", JOptionPane.INFORMATION_MESSAGE);
            otp_tf.setEnabled(true);

        } catch (Exception ex) {
            Logger.getLogger(RegistrationPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_otp_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_reset_btnActionPerformed

    private void cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_btnActionPerformed
        // TODO add your handling code here:

        int n = JOptionPane.showConfirmDialog(  
            null,
            "Are you sure? You want to cancel this Activity?\nNote: You will be navigated to Home Page & your Application will not be submitted." ,
            "Confirm Exit",
            JOptionPane.YES_NO_OPTION
        );

        if(n == JOptionPane.YES_OPTION) {
            HomePage hp = new HomePage();
            dispose();
            hp.display();
        }
        
    }//GEN-LAST:event_cancel_btnActionPerformed

    private void verify_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verify_btnActionPerformed
        // TODO add your handling code here:
        String input = otp_tf.getText().trim();
        if (otp == Integer.parseInt(input)) {
            JOptionPane.showMessageDialog(null, "OTP verified successfully, can proceed futher.", "OTP Verification Successfully.", JOptionPane.INFORMATION_MESSAGE);
            flag = true;
            otp_tf.setEnabled(false);
            otp_btn.setEnabled(false);
            verify_btn.setEnabled(false);
            mobile_tf.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "OTP verification failed!!", "OTP Verification Successfully.", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_verify_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String fname = fname_tf.getText().trim().toUpperCase();
        String lname = lname_tf.getText().trim().toUpperCase();

        Date dob = dob_dc.getDate();
        String formattedDob = null;
        int age;

        String gender = null;
        if (male_rbtn.isSelected()) {
            gender = "MALE";
        } else if (female_rbtn.isSelected()) {
            gender = "FEMALE";
        } else if (others_rbtn.isSelected()) {
            gender = "OTHER";
        }
    
        String state = (String) state_cmb.getSelectedItem();
        String aadharNo = aadhar_tf.getText().trim();
        String mobileNo = mobile_tf.getText().trim();
        String otp = otp_tf.getText().trim();
        String email = email_tf.getText().trim();
    
        // Check if any of the fields are empty
        // if (fname.isEmpty() || lname.isEmpty() || gender == null || state.equals("-+-+-Select State-+-+-") || aadharNo.isEmpty() || mobileNo.isEmpty() || otp.isEmpty() || email.isEmpty()) {
        if (fname.isEmpty() || lname.isEmpty() || gender == null || state.equals("-+-+-Select State-+-+-") || aadharNo.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the details.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            // Validation for fname and lname (only letters)
            if (!Pattern.matches("[a-zA-Z]+", fname) || !Pattern.matches("[a-zA-Z]+", lname)) {
                JOptionPane.showMessageDialog(this, "First Name and Last Name should contain only letters.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;  // Stop processing further
            }

            if (dob == null) {
                JOptionPane.showMessageDialog(this, "Please choose a valid date (yyyy-MM-dd format).", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;  // Stop processing further
            } else {
                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                formattedDob = dcn.format(dob);
            }

            age = calculateAge(dob);
            if (age < 18) {
                JOptionPane.showMessageDialog(this, "Age must be 18 or above.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;  // Stop processing further
            }

            // Validation for aadharNo (12 digits only)
            if (!Pattern.matches("\\d{12}", aadharNo)) {
                JOptionPane.showMessageDialog(this, "Aadhar No should be 12 digits.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;  // Stop processing further
            }

            // Validation for mobileNo (10 digits only)
            if (!Pattern.matches("^[789]\\d{9}", mobileNo)) {
                JOptionPane.showMessageDialog(this, "Mobile No should be 10 digits.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;  // Stop processing further
            }

            // Validation for otp (6 digits only)
            if (!Pattern.matches("\\d{6}", otp)) {
                JOptionPane.showMessageDialog(this, "OTP should be 6 digits.", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;  // Stop processing further
            }

            // Validation for email
            if (!isValidEmail(email)) {
                JOptionPane.showMessageDialog(this, "Invalid email address.", "Error", JOptionPane.ERROR_MESSAGE);
                return;  // Stop processing further
            }

            try {
                // Check if the Aadhar number already exists
                String query = "SELECT aadhar_no FROM voters WHERE aadhar_no = ?";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
                PreparedStatement st = con.prepareStatement(query);
                st.setString(1, aadharNo);
                ResultSet rs = st.executeQuery();
            
                // If the Aadhar number already exists, show an error message
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Registration failed. A user with this Aadhar number already exists.", "Registration Failed.", JOptionPane.INFORMATION_MESSAGE);
                    // flag = false;
                    return;
                }

                con.close();
                st.close();
                rs.close();
            } catch (SQLException e) {
                System.err.println("Error during SQL select: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("ERROR: " + e);
            }
            
            if (flag) {
                try {
                    // Establish the database connection
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
                    
                    // Create a prepared statement with the insert query
                    String query = "INSERT INTO VOTERS (fname, lname, dob, gender, state, aadhar_no, mobile_no, email_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

                    PreparedStatement pstmt = con.prepareStatement(query);
                
                    // Set the parameter values
                    pstmt.setString(1, fname);
                    pstmt.setString(2, lname);
                    pstmt.setString(3, formattedDob);
                    pstmt.setString(4, gender);
                    pstmt.setString(5, state);
                    pstmt.setString(6, aadharNo);
                    pstmt.setString(7, mobileNo);
                    pstmt.setString(8, email);
                
                    // Execute the update
                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("A new row has been inserted successfully.");
                    } else {
                        System.out.println("Insert failed.");
                    }
                    
                    pstmt.close();

                    String query2 = "SELECT voter_id FROM voters WHERE aadhar_no = '" + aadharNo + "';";

                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query2);
                    while (rs.next()) {
                        voter_id = rs.getInt("voter_id");
                    }

                    // Close the statement and connection
                    rs.close();
                    st.close();
                    con.close();
                } catch (SQLException e) {
                    System.err.println("Error during SQL insert: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("An error occurred: " + e);
                }
                JOptionPane.showMessageDialog(this, "Application Submitted Successfully.", "Registration Completed.", JOptionPane.INFORMATION_MESSAGE);
                
                JOptionPane.showMessageDialog(this, "Your Voter ID is '" + voter_id + "'.\nUse this Voter ID for future activities.", "Voter ID.", JOptionPane.INFORMATION_MESSAGE);
                resetFields();
            } else if (!flag) {
                JOptionPane.showMessageDialog(this, "Please verify mobile number with OTP before submitting the application.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private int calculateAge(Date dob) {
        Calendar today = Calendar.getInstance();
        Calendar dobCalendar = Calendar.getInstance();
        dobCalendar.setTime(dob);

        int age = today.get(Calendar.YEAR) - dobCalendar.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dobCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
    
    private boolean isValidEmail(String email) {
        // Regular expression for a basic email validation
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

//    public static void main(String args[]) {
    void display() {
        RegistrationPage rp = new RegistrationPage();
        rp.setVisible(true);
    }

    private void resetFields() {
        fname_tf.setText("");
        lname_tf.setText("");
        dob_dc.setCalendar(null);
        buttonGroup1.clearSelection();
        state_cmb.setSelectedIndex(0);
        aadhar_tf.setText("");
        mobile_tf.setText("");
        otpMain_tf.setText("");
        otp_tf.setText("");
        email_tf.setText("");
        otp = 0;
        flag = false;
        otp_tf.setEnabled(false);
        voter_id = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadhar_lbl;
    private javax.swing.JTextField aadhar_tf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cancel_btn;
    private com.toedter.calendar.JDateChooser dob_dc;
    private javax.swing.JLabel dob_lbl;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JTextField email_tf;
    private javax.swing.JRadioButton female_rbtn;
    private javax.swing.JLabel fname_lbl;
    private javax.swing.JTextField fname_tf;
    private javax.swing.JLabel gender_lbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lname_lbl;
    private javax.swing.JTextField lname_tf;
    private javax.swing.JRadioButton male_rbtn;
    private javax.swing.JLabel mobile_lbl;
    public javax.swing.JTextField mobile_tf;
    private javax.swing.JLabel note_lbl;
    private javax.swing.JLabel nvsp_lbl;
    private javax.swing.JRadioButton others_rbtn;
    public javax.swing.JTextField otpMain_tf;
    private javax.swing.JButton otp_btn;
    private javax.swing.JLabel otp_lbl;
    public javax.swing.JTextField otp_tf;
    private javax.swing.JLabel registration_lbl;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton save_btn;
    private javax.swing.JComboBox<String> state_cmb;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JButton verify_btn;
    private javax.swing.JLabel voteLogo_lbl;
    // End of variables declaration//GEN-END:variables
}


// try {
//     Date dob = dob_dc.getDate();
//     SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
//     String $dob = dcn.format(dob);

//     // System.out.println("First Name: " + fname);
//     // System.out.println("Last Name: " + lname);
//     // System.out.println("Date of Birth: " + $dob);
//     // System.out.println("Gender: " + gender);
//     // System.out.println("State: " + state);
//     // System.out.println("Aadhar No: " + aadharNo);
//     // System.out.println("Mobile No: " + mobileNo);
//     // System.out.println("OTP: " + otp);
//     // System.out.println("Email: " + email);
// } catch (NullPointerException npe) {
//     JOptionPane.showMessageDialog(this, "Please choose a valid date (yyyy-MM-dd format).", "Error", JOptionPane.ERROR_MESSAGE);
// }