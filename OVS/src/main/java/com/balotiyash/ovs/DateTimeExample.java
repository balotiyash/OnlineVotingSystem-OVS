// package main.java.com.balotiyash.ovs;

// import java.net.InetAddress;
// import java.time.LocalDate;
// import java.time.LocalTime;
// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class DateTimeExample {
//     public static void main(String[] args) throws Exception {
//         // Current date
//         LocalDate currentDate = LocalDate.now();
//         System.out.println("Current Date: " + currentDate);

//         // Current time
//         LocalTime currentTime = LocalTime.now();
//         System.out.println("Current Time: " + currentTime);

//         // Current date and time
//         LocalDateTime currentDateTime = LocalDateTime.now();
//         System.out.println("Current Date and Time: " + currentDateTime);

//         // Formatting date and time
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//         String formattedDateTime = currentDateTime.format(formatter);
//         System.out.println("Formatted Date and Time: " + formattedDateTime);

//         // Parsing date and time from a string
//         String dateTimeString = "2023-10-18 15:30:00";
//         LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
//         System.out.println("Parsed Date and Time: " + parsedDateTime);

//         //InetAddress
//         try {
//             // Get the local host InetAddress
//             InetAddress localHost = InetAddress.getLocalHost();
//             System.out.println("Local Host: " + localHost);

//             // Get the IP address and host name of the local host
//             System.out.println("Host Name: " + localHost.getHostName());
//             System.out.println("IP Address: " + localHost.getHostAddress());

//             // Get InetAddress by specifying a host name or IP address
//             InetAddress address = InetAddress.getByName("www.google.com");
//             System.out.println("Google IP Address: " + address.getHostAddress());

//             // Resolve and print all IP addresses associated with a host name
//             InetAddress[] addresses = InetAddress.getAllByName("www.google.com");
//             for (InetAddress addr : addresses) {
//                 System.out.println("Google IP Address: " + addr.getHostAddress());
//             }
//         } catch (UnknownHostException e) {
//             e.printStackTrace();
//         }
//     }
// }
