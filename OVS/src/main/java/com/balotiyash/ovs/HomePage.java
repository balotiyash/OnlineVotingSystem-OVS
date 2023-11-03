package com.balotiyash.ovs;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.Desktop;

import javax.swing.JOptionPane;
public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        mainLogo_lbl = new javax.swing.JLabel();
        register_btn = new javax.swing.JButton();
        vote_btn = new javax.swing.JButton();
        result_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        search_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OVS - Online Voting System [Dashboard]");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));

        mainLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\VotingImg500.png")); // NOI18N
        mainLogo_lbl.setPreferredSize(new java.awt.Dimension(500, 450));

        register_btn.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        register_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Register200.jpg")); // NOI18N
        register_btn.setPreferredSize(new java.awt.Dimension(200, 200));
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });

        vote_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Vote200.jpg")); // NOI18N
        vote_btn.setPreferredSize(new java.awt.Dimension(200, 200));
        vote_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vote_btnActionPerformed(evt);
            }
        });

        result_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Result200.jpg")); // NOI18N
        result_btn.setPreferredSize(new java.awt.Dimension(200, 200));
        result_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result_btnActionPerformed(evt);
            }
        });

        logout_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Exit200.jpg")); // NOI18N
        logout_btn.setPreferredSize(new java.awt.Dimension(200, 200));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });

        search_btn.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\Search200.jpg")); // NOI18N
        search_btn.setPreferredSize(new java.awt.Dimension(200, 200));
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(vote_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(result_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(mainLogo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(mainLogo_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vote_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(register_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(result_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(  
            null,
            "Are you sure? You want to LOGOUT?" ,
            "Confirm Exit",
            JOptionPane.YES_NO_OPTION
        );

        if(n == JOptionPane.YES_OPTION) {
        // JOptionPane.showMessageDialog(null, "Opening...");
            MainLogin ml = new MainLogin();
            dispose();
            ml.display();
        }
    }//GEN-LAST:event_logout_btnActionPerformed

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        // TODO add your handling code here:
        RegistrationPage rp = new RegistrationPage();
        dispose();
        rp.display();
    }//GEN-LAST:event_register_btnActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        SearchPage sp = new SearchPage();
        dispose();
        sp.display();
    }//GEN-LAST:event_search_btnActionPerformed

    private void vote_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vote_btnActionPerformed
        // TODO add your handling code here:
        VotingPage vp = new VotingPage();
        vp.display();
        dispose();
    }//GEN-LAST:event_vote_btnActionPerformed

    private void result_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_result_btnActionPerformed
        // TODO add your handling code here:
        compileServlet();

        changeXML();

        openURL("http://localhost:8086/examples/servlets/servlet/ResultPage");
    }//GEN-LAST:event_result_btnActionPerformed

    private void compileServlet() {
        // Set the source file path and classpath
        String sourceFile = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\examples\\WEB-INF\\classes\\ResultPage.java";
        String classpath = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\lib\\servlet-api.jar";

        // Create the javac command
        List<String> command = new ArrayList<>();
        command.add("javac");
        command.add("-source");
        command.add("1.8");
        command.add("-target");
        command.add("1.8");
        command.add("-classpath");
        command.add(classpath);
        command.add(sourceFile);

        // Set the working directory to the source folder
        String workingDirectory = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\examples\\WEB-INF\\classes";

        try {
            // Create the process builder
            ProcessBuilder processBuilder = new ProcessBuilder(command);
            processBuilder.directory(new File(workingDirectory));

            // Start the compilation process
            Process process = processBuilder.start();

            // Wait for the compilation to complete
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

    void changeXML() {
        // Scanner scanner = new Scanner(System.in);

        // Get the XML file location from the user
        // System.out.print("Enter the path to the XML file: ");
        String filePath = "C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\examples\\WEB-INF\\web.xml";

        // Read the XML file
        String xmlContent = readXMLFile(filePath);

        // Search and replace "ResultPage" with an empty string
        xmlContent = xmlContent.replaceAll("ResultPage", "ResultPag");

        // Write the modified content back to the XML file
        writeXMLFile(filePath, xmlContent);

        // Get the string to search for and its replacement from the user
        // System.out.print("Enter the string to search for: ");
        String searchString = "ResultPag";

        // System.out.print("Enter the replacement string: ");
        String replacementString = "ResultPage";

        // Search and replace the user input string in the XML content
        xmlContent = xmlContent.replaceAll(searchString, replacementString);

        // Write the final modified content back to the XML file
        writeXMLFile(filePath, xmlContent);

        System.out.println("XML file has been edited and saved.");
    }

    private static String readXMLFile(String filePath) {
        try {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            System.err.println("Error reading the XML file: " + e.getMessage());
            System.exit(1);
        }
        return null;
    }

    private static void writeXMLFile(String filePath, String content) {
        try {
            Files.write(Paths.get(filePath), content.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error writing to the XML file: " + e.getMessage());
            System.exit(1);
        }
    }

    public static void openURL(String url) {
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            try {
                URI uri = new URI(url);
                Desktop.getDesktop().browse(uri);
            } catch (IOException | URISyntaxException e) {
                System.err.println("Error opening URL: " + e.getMessage());
            }
        } else {
            System.err.println("Desktop browsing is not supported.");
        }
    }

    void display() {
        HomePage hp = new HomePage();
        hp.setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JLabel mainLogo_lbl;
    private javax.swing.JButton register_btn;
    private javax.swing.JButton result_btn;
    private javax.swing.JButton search_btn;
    private javax.swing.JButton vote_btn;
    // End of variables declaration//GEN-END:variables
}