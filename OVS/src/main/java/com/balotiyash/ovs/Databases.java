package com.balotiyash.ovs;

import java.sql.*;

class SecurityDB {
    void createTable() {
    //    String query="CREATE TABLE mlogin(username varchar(10), password varchar(10) NOT NULL, security varchar(10) NOT NULL, primary key(username));"; // home login
        // String query = "CREATE TABLE voters (\r\n" +
        //        "    voter_id INT AUTO_INCREMENT PRIMARY KEY,\r\n" +
        //        "    fname VARCHAR(25) NOT NULL,\r\n" +
        //        "    lname VARCHAR(25) NOT NULL,\r\n" +
        //        "    dob DATE NOT NULL,\r\n" +
        //        "    gender VARCHAR(6) NOT NULL,\r\n" +
        //        "    state VARCHAR(25) NOT NULL,\r\n" +
        //        "    aadhar_no BIGINT(12) NOT NULL UNIQUE,\r\n" +
        //        "    mobile_no BIGINT(10) NOT NULL,\r\n" +
        //        "    email_id VARCHAR(50) NOT NULL\r\n" +
        //        ");"; //voters table
        String query = "CREATE TABLE votes (" +
                       "voter_id INT PRIMARY KEY, " +
                       "voted_party VARCHAR(25) NOT NULL, " +
                       "vote_timestamp VARCHAR(50) NOT NULL, " +
                       "voting_location VARCHAR(25) NOT NULL);";

        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root","root");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
        } catch (Exception e) {}
    }

    void insertRecord(String uname, String pass, String sec) {
        String query="INSERT INTO mlogin VALUES('" + uname + "', '" + pass + "', '" + sec + "');"; //home login
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root","root");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // void updateRecord(String uname, String pass, String sec) {
    //     String query="UPDATE mlogin SET password = '" + pass +"', security = '" + sec + "' WHERE username = " + uname + ";";
    //     try {
    //         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root","root");
    //         Statement st = con.createStatement();
    //         st.executeUpdate(query);
    //         st.close();
    //     } catch (Exception e) {}
    //     // System.out.println("Existing Record Updated Sucessfully having Roll Number: " + id + " with Name = '" + name + "'' & Subject = '" + sub + "'.");
    // }

    // void deleteRecord(int id) {
    //     String query="DELETE FROM Student WHERE RollNo = " + id + ";";
    //     try {
    //         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vesp", "root","root");
    //         Statement st = con.createStatement();
    //         st.executeUpdate(query);
    //         st.close();
    //     } catch (Exception e) {}
    //     // System.out.println("Existing Record Deleted Sucessfully with Roll Number: " + id + ".");
    // }

    void dropTable() {
        String query="DROP TABLE mlogin;"; //main login
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root","root");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
        } catch (Exception e) {}
    }
    void alterTable() {
        // String query="ALTER TABLE VOTERS AUTO_INCREMENT=100"; /// auto inc = 100
        String query="ALTER TABLE voters MODIFY COLUMN gender varchar(6);"; /// auto inc = 100
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ovs", "root","root");
            Statement st = con.createStatement();
            st.executeUpdate(query);
            st.close();
        } catch (Exception e) {}
    }

    // void display() {
    //     String query="SELECT * FROM Student;";
    //     try {
    //         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vesp", "root","root");
    //         Statement st = con.createStatement();
    //         ResultSet rs = st.executeQuery(query);

    //         System.out.println("------------Student TABLE CONTENT------------");
    //         while(rs.next()) {
    //             System.out.println("Roll Number: " + rs.getInt("RollNo"));
    //             System.out.println("Name:        " + rs.getString("Name"));
    //             System.out.println("Subject:     " + rs.getString("Subject"));
    //             System.out.println();
    //         }
    //     } catch (Exception e) {}
    // }
}

class Databases {
    public static void main(String[] args) {
        SecurityDB s = new SecurityDB();
//         s.createTable();
//        s.insertRecord("main", "main", "hod");
//        s.insertRecord("rain", "rain", "main");
//        s.dropTable();

       s.createTable();
        // s.alterTable();
    }
}