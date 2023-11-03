package com.balotiyash.ovs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SearchPage extends javax.swing.JFrame {

    public SearchPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPanel = new javax.swing.JPanel();
        note_lbl = new javax.swing.JLabel();
        voteLogo_lbl = new javax.swing.JLabel();
        nvsp_lbl = new javax.swing.JLabel();
        registration_lbl = new javax.swing.JLabel();
        state_lbl = new javax.swing.JLabel();
        state_cmb = new javax.swing.JComboBox<>();
        search_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        voter_tbl = new javax.swing.JTable();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search Existing Voter");
        setResizable(false);

        logoPanel.setBackground(new java.awt.Color(255, 255, 255));
        logoPanel.setPreferredSize(new java.awt.Dimension(1200, 700));

        note_lbl.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        note_lbl.setForeground(new java.awt.Color(255, 0, 0));
        note_lbl.setText("**Note: Please fill the form carefully. All the fields are Mandatory to fill. **");

        voteLogo_lbl.setIcon(new javax.swing.ImageIcon("C:\\_Yash\\VSC\\Advance Java\\Images\\VotingImg2 - 200.jpg")); // NOI18N

        nvsp_lbl.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        nvsp_lbl.setText("NATIONAL VOTERS' SERVICE PORTAL");

        registration_lbl.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        registration_lbl.setForeground(new java.awt.Color(0, 0, 153));
        registration_lbl.setText("Search Existing Voter");

        state_lbl.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        state_lbl.setText("Select Your State");

        state_cmb.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        state_cmb.setMaximumRowCount(5);
        state_cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-+-+-Select State-+-+-", "ANDHRA PRADESH", "ARUNACHAL PRADESH", "ASSAM", "BIHAR", "CHHATTISGARH", "GOA", "GUJARAT", "HARYANA", "HIMACHAL PRADESH", "JHARKHAND", "KARNATAKA", "KERALA", "MADHYA PRADESH", "MAHARASHTRA", "MANIPUR", "MEGHALAYA", "MIZORAM", "NAGALAND", "ODISHA", "PUNJAB", "RAJASTHAN", "SIKKIM", "TAMIL NADU", "TELANGANA", "TRIPURA", "UTTAR PRADESH", "UTTARAKHAND", "WEST BENGAL", "CHANDIGARH", "DELHI", "LAKSHADWEEP", "PUDUCHERRY" }));

        search_btn.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        search_btn.setText("Search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        voter_tbl.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        voter_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VOTER ID", "FIRST NAME", "LAST NAME", "DATE OF BIRTH", "GENDER", "STATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        voter_tbl.setRowHeight(50);
        voter_tbl.setRowSelectionAllowed(false);
        jScrollPane1.setViewportView(voter_tbl);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        exit_btn.setFont(new java.awt.Font("Dubai", 2, 24)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(voteLogo_lbl)
                        .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(logoPanelLayout.createSequentialGroup()
                                .addGap(313, 313, 313)
                                .addComponent(registration_lbl))
                            .addGroup(logoPanelLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(note_lbl))
                            .addGroup(logoPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(nvsp_lbl))))
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(state_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(state_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(search_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voteLogo_lbl)
                    .addGroup(logoPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(nvsp_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(registration_lbl)
                        .addGap(18, 18, 18)
                        .addComponent(note_lbl)))
                .addGap(18, 18, 18)
                .addGroup(logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state_lbl)
                    .addComponent(state_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search_btn)
                    .addComponent(exit_btn))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        // TODO add your handling code here:
        // try {
        //     String query = "SELECT voter_id, fname, lname, dob, gender, state FROM voters where state = '?';";
        //     String stateName = (String) state_cmb.getSelectedItem();
        //     Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root","root");
        //     PreparedStatement st = con.prepareStatement(query);
        //     st.setString(1, stateName);
        //     // Statement st = con.createStatement();
        //     ResultSet rs = st.executeQuery();
        //     // ResultSetMetaData rsmd = rs.getMetaData();

        //     DefaultTableModel model = (DefaultTableModel) voter_tbl.getModel();
        //     // int cnt = rsmd.getColumnCount();
        //     // String colsName[] = new String[cnt];

        //     // for (int i = 0; i < cnt; i++) {
        //     //     colsName[i] = rsmd.getColumnName(i + 1);
        //     // }

        //     // model.setColumnIdentifiers(colsName);

        //     while (rs.next()) {
        //         String voter_id = rs.getString(1);
        //         String fname = rs.getString(2);
        //         String lname = rs.getString(3);
        //         String dob = rs.getString(4);
        //         String gender = rs.getString(5);
        //         String state = rs.getString(6);

        //         String[] newRow = {voter_id, fname, lname, dob, gender, state};
        //         model.addRow(newRow);
        //     }

        //     st.close();
        //     rs.close();
        //     con.close();
        // } catch (SQLException e) {
        //     System.err.println("Error in fetching data: " + e.getMessage());
        // } catch (Exception e) {
        //     System.err.println("ERROR: " + e);
        // }

        try {
            String query = "SELECT voter_id, fname, lname, dob, gender, state FROM voters where state = ?";
            String stateName = (String) state_cmb.getSelectedItem();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root", "root");
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, stateName);
        
            ResultSet rs = st.executeQuery();  // Corrected to use executeQuery()
        
            DefaultTableModel model = (DefaultTableModel) voter_tbl.getModel();
            model.setRowCount(0);

            boolean entryExists = false;
            voter_tbl.getColumnModel().getColumn(0).setPreferredWidth(0);
            voter_tbl.getColumnModel().getColumn(1).setPreferredWidth(1);
            voter_tbl.getColumnModel().getColumn(2).setPreferredWidth(1);
            voter_tbl.getColumnModel().getColumn(3).setPreferredWidth(1);
            voter_tbl.getColumnModel().getColumn(4).setPreferredWidth(1);
            voter_tbl.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
            while (rs.next()) {
                entryExists = true;
                String voter_id = rs.getString(1);
                String fname = rs.getString(2);
                String lname = rs.getString(3);
                String dob = rs.getString(4);
                String gender = rs.getString(5);
                String state = rs.getString(6);
        
                String[] newRow = {voter_id, fname, lname, dob, gender, state};
                model.addRow(newRow);
            }
        
            if (!entryExists) {
                JOptionPane.showMessageDialog(null, "No entries found for the selected state.", "No Data Found!!", JOptionPane.INFORMATION_MESSAGE);
            }
            
            st.close();
            rs.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Error in fetching data: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("ERROR: " + e);
        }
        
    }//GEN-LAST:event_search_btnActionPerformed

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

    void display() {
        SearchPage sp = new SearchPage();
        sp.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit_btn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JLabel note_lbl;
    private javax.swing.JLabel nvsp_lbl;
    private javax.swing.JLabel registration_lbl;
    private javax.swing.JButton search_btn;
    private javax.swing.JComboBox<String> state_cmb;
    private javax.swing.JLabel state_lbl;
    private javax.swing.JLabel voteLogo_lbl;
    private javax.swing.JTable voter_tbl;
    // End of variables declaration//GEN-END:variables
}
