package com.balotiyash.ovs;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MainLogin extends javax.swing.JFrame {

    OVS ovs = new OVS();

    public MainLogin() {
        initComponents();
        // recieve(10000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        login_lbl = new javax.swing.JLabel();
        username_lbl = new javax.swing.JLabel();
        username_tf = new javax.swing.JTextField();
        password_lbl = new javax.swing.JLabel();
        password_pf = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JButton();
        forgot_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OVS - Online Voting System [Zonal Login]");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\LoginImage.jpg")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        login_lbl.setFont(new java.awt.Font("Dubai", 3, 48)); // NOI18N
        login_lbl.setText("LOGIN");

        username_lbl.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        username_lbl.setText("USERNAME");

        username_tf.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        password_lbl.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        password_lbl.setText("PASSWORD");

        password_pf.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        login_btn.setFont(new java.awt.Font("Dubai", 2, 18)); // NOI18N
        login_btn.setText("LOGIN");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        forgot_btn.setFont(new java.awt.Font("Dubai", 2, 18)); // NOI18N
        forgot_btn.setText("Forgot Password");
        forgot_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgot_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(login_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_lbl)
                    .addComponent(username_tf)
                    .addComponent(password_lbl)
                    .addComponent(password_pf)
                    .addComponent(login_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(forgot_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(login_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(login_btn)
                .addGap(18, 18, 18)
                .addComponent(forgot_btn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        if (ovs.str == "") {
            recieve(5000);
        } else if (ovs.str != "green" && ovs.str != "red" && ovs.str != "") {
            ovs.str = ovs.temp;
        }

        if (ovs.str.equals(ovs.key)) {

            String input1 = username_tf.getText();
            String input2 = new String(password_pf.getPassword());

            String query = "SELECT username, password FROM mlogin;";

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
                boolean found = false;

                while (rs.next()) {
                    String uname = rs.getString("username");
                    String pass = rs.getString("password");

                    if (input1.equals(uname) && input2.equals(pass)) {
                        HomePage hp = new HomePage();
                        this.dispose();
                        hp.display();  // Assuming display is a method in the HomePage class
                        found = true;
                        break;  // Exit the loop once a matching record is found
                    }
                }

                if (!found) {
                    JOptionPane.showMessageDialog(this, "Invalid Credential Entered!!", "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Close the ResultSet, Statement, and Connection
                rs.close();
                st.close();
                con.close();

            } catch (SQLException e) {
                e.printStackTrace(); // Print the exception for debugging purposes
            }
        } else if ("red".equals(ovs.str)) {
            JOptionPane.showMessageDialog(this, "Access Denied. Please contact your Admin.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Unknown Access Error.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_login_btnActionPerformed

    private void forgot_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgot_btnActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Enter Security Answer");
        String query = "SELECT * FROM mlogin;";
        Boolean found = false;
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String uname = rs.getString("username");
                String pass = rs.getString("password");
                String sec = rs.getString("security");

            //    if (input.equals(sec)) {
            //        JOptionPane.showMessageDialog(this, "Username: " + uname + "\nPassword: " + pass, "Info", JOptionPane.INFORMATION_MESSAGE);
            //    } else {
            //        JOptionPane.showMessageDialog(this, "Wrong Security Answer Entered!!", "Error", JOptionPane.ERROR_MESSAGE);
            //    }
                if (input.equals(sec)) {
                    JOptionPane.showMessageDialog(this, "Username: " + uname + "\nPassword: " + pass, "Info", JOptionPane.INFORMATION_MESSAGE);
                    found = true;
                    break;  // Exit the loop once a matching record is found
                }
            }
            
            if (!found) {
                JOptionPane.showMessageDialog(this, "Wrong Security Answer Entered!!", "Error", JOptionPane.ERROR_MESSAGE);
            }

            // Close the ResultSet, Statement, and Connection
            rs.close();
            st.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace(); // Print the exception for debugging purposes 
        }
    }//GEN-LAST:event_forgot_btnActionPerformed

    void display() {
        MainLogin ml = new MainLogin();
        ml.setVisible(true);
    }

    public static void compileJavaFile(String sourceFileName) {
        try {
            List<String> command = new ArrayList<>();
            command.add("javac");
            command.add(sourceFileName);

            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // Wait for the compilation process to complete
            int exitCode = process.waitFor();

            if (exitCode == 0) {
                System.out.println("Compilation successful.");
            } else {
                System.out.println("Compilation failed.");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void runCompiledJavaFile(String sourceFileName) {
        try {
            // Extract the class name (remove the .java extension)
            String className = sourceFileName.replace(".java", "");

            List<String> command = new ArrayList<>();
            command.add("java");
            command.add(className);

            ProcessBuilder processBuilder = new ProcessBuilder(command);
            Process process = processBuilder.start();

            // Capture and display the output of the Java program
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Wait for the program to complete
            int exitCode = process.waitFor();
            System.out.println("Program exited with code " + exitCode);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    void recieve(int time) {
        try {
            ServerSocket ss = new ServerSocket(6666);

            // Set a timeout in milliseconds (e.g., 5000 milliseconds or 5 seconds)
            int timeout = time;
            ss.setSoTimeout(timeout);

            System.out.println("Server waiting for connection...");

            Socket s = new Socket(); // establishes connection
            try {
                s = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream());
                ovs.str = (String) dis.readUTF();
                // ovs.temp = ovs.str;
                s.close();
            } catch (SocketTimeoutException e) {
                //                System.out.println("Timeout: No connection established within " + timeout + " milliseconds.");
                s.close();
            }
                
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton forgot_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login_btn;
    private javax.swing.JLabel login_lbl;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JPasswordField password_pf;
    private javax.swing.JLabel username_lbl;
    private javax.swing.JTextField username_tf;
    // End of variables declaration//GEN-END:variables
}
