import java.io.*;
import java.sql.*;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @WebServlet("/ElectionResultServlet")
public class ResultPage extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Database connection parameters
        String jdbcUrl = "jdbc:mysql://localhost:3306/ovs";
        String dbUser = "root";
        String dbPassword = "root";

        // Initialize variables to store vote counts
        int aapCount = 0;
        int bjpCount = 0;
        int bspCount = 0;
        int cpiCount = 0;
        int incCount = 0;

        try {
            // Establish a database connection
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

            // SQL query to fetch vote counts for each party
            String sql = "SELECT voted_party, COUNT(*) AS count FROM votes GROUP BY voted_party";
            PreparedStatement statement = connection.prepareStatement(sql);

            // Execute the query
            ResultSet resultSet = statement.executeQuery();

            // Iterate through the results and store counts in variables
            while (resultSet.next()) {
                String party = resultSet.getString("voted_party");
                int count = resultSet.getInt("count");

                switch (party) {
                    case "AAP":
                        aapCount = count;
                        break;
                    case "BJP":
                        bjpCount = count;
                        break;
                    case "BSP":
                        bspCount = count;
                        break;
                    case "CPI":
                        cpiCount = count;
                        break;
                    case "INC":
                        incCount = count;
                        break;
                    // Handle other parties if needed
                }
            }

            // Close the database connection
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print or use the vote counts as needed
        // System.out.println("AAP Count: " + aapCount);
        // System.out.println("BJP Count: " + bjpCount);
        // System.out.println("BSP Count: " + bspCount);
        // System.out.println("CPI Count: " + cpiCount);
        // System.out.println("INC Count: " + incCount);
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head>");
        out.println("<title>Election Result</title>");
        out.println("<style>");
        out.println("th, td {");
        out.println("width: 500px;");
        out.println("height: 50px;");
        out.println("font-size: larger;");
        out.println("text-align: center;}");
        out.println("</style>");
        out.println("</head><body><center>");
        out.println("<h1>Result of Election</h1><br><br>");
        
        out.println("<table border=\"1\">");
        out.println("<tr><th>Candidate Name</th><th>Sign</th><th>Number of Votes</th></tr>");
        out.println("<tr><td>AAM AADMI PARTY</td><td>AAP</td><td>" + aapCount + "</td></tr>");
        out.println("<tr><td>BHARATIYA JANTA PARTY</td><td>BJP</td><td>" + bjpCount + "</td></tr>");
        out.println("<tr><td>BAHUJAN SAMAJ PARTY</td><td>BSP</td><td>" + bspCount + "</td></tr>");
        out.println("<tr><td>COMMUNIST PARTY OF INDIA</td><td>CPI</td><td>" + cpiCount + "</td></tr>");
        out.println("<tr><td>INDIAN NATIONAL CONGRESS</td><td>INC</td><td>" + incCount + "</td></tr>");
        out.println("</table>");



        // out.println("<p>AAM JANTA PARTY (AAP) has <b><big>" + aapCount + "</b></big> Vote(s).</p>");
        // out.println("<p>BHARATIYA JANTA PARTY (BJP) has <b><big>" + bjpCount + "</b></big> Vote(s).</p>");
        // out.println("<p>BAHUJAN SAMAJ PARTY (BSP) has <b><big>" + bspCount + "</b></big> Vote(s).</p>");
        // out.println("<p>COMMUNIST PARTY OF INDIA (CPI) has <b><big>" + cpiCount + "</b></big> Vote(s).</p>");
        // out.println("<p>INDIAN NATIONAL CONGRESS (INC) has <b><big>" + incCount + "</b></big> Vote(s).</p>");



        out.println("<br><br>");
        
        if (aapCount > bjpCount && aapCount > bspCount && aapCount > cpiCount && aapCount > incCount) {
            // System.out.println("AAP has the most votes with " + aapCount + " votes.");
            out.println("<marquee><h2>AAM AADMI PARTY (AAP) has WON this Election</h2></marquee>");
        } else if (bjpCount > aapCount && bjpCount > bspCount && bjpCount > cpiCount && bjpCount > incCount) {
            // System.out.println("BJP has the most votes with " + bjpCount + " votes.");
            out.println("<marquee><h2>BHARATIYA JANTA PARTY (BJP) has WON this Election</h2></marquee>");
        } else if (bspCount > aapCount && bspCount > bjpCount && bspCount > cpiCount && bspCount > incCount) {
            // System.out.println("BSP has the most votes with " + bspCount + " votes.");
            out.println("<marquee><h2>BAHUJAN SAMAJ PARTY (BSP) has WON this Election</h2></marquee>");
        } else if (cpiCount > aapCount && cpiCount > bjpCount && cpiCount > bspCount && cpiCount > incCount) {
            // System.out.println("CPI has the most votes with " + cpiCount + " votes.");
            out.println("<marquee><h2>COMMUNIST PARTY OF INDIA (CPI) has WON this Election</h2></marquee>");
        } else if (incCount > aapCount && incCount > bjpCount && incCount > bspCount && incCount > cpiCount) {
            // System.out.println("INC has the most votes with " + incCount + " votes.");
            out.println("<marquee><h2>INDIAN NATIONAL CONGRESS (INC) has WON this Election</h2></marquee>");
        } else {
            // System.out.println("There is a tie or no votes have been cast.");
            out.println("<marquee><h2>There is a tie or no votes have been cast.</h2></marquee>");
        }

        out.println("</center>");
        out.println("</body>");
        out.println("</html>");
    }
}