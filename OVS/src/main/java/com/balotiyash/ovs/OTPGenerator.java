package com.balotiyash.ovs;

import java.net.*;
import java.util.Base64;
import java.util.Random;

import javax.swing.JOptionPane;

import java.io.*;

public class OTPGenerator {

//   static public void main(String[] args) throws Exception {
    public int generateOTP(String mobileNo) throws Exception {

    // This URL is used for sending messages
    String myURI = "https://api.bulksms.com/v1/messages";

    // change these values to match your own account
    String myUsername = "balotiyash";
    String myPassword = "3x130KVA";

    // RegistrationPage rp = new RegistrationPage();
    Random random = new Random();
    int min = 100000;
    int max = 999999;
    int otp = 0;
    
    do {
        otp = random.nextInt((max - min) + min);
    } while (otp < min);

    // the details of the message we want to send
    String myData = "{to: \"+91" + mobileNo + "\", body: \"Your OTP for New Voters Registration (NVSP) is " + otp + "\"}";

    // if your message does not contain unicode, the "encoding" is not required:
    // String myData = "{to: \"1111111\", body: \"Hello Mr. Smith!\"}";

    // build the request based on the supplied settings
    URL url = new URL(myURI);
    HttpURLConnection request = (HttpURLConnection) url.openConnection();
    request.setDoOutput(true);

    // supply the credentials
    String authStr = myUsername + ":" + myPassword;
    String authEncoded = Base64.getEncoder().encodeToString(authStr.getBytes());
    request.setRequestProperty("Authorization", "Basic " + authEncoded);

    // we want to use HTTP POST
    request.setRequestMethod("POST");
    request.setRequestProperty( "Content-Type", "application/json");

    // write the data to the request
    OutputStreamWriter out = new OutputStreamWriter(request.getOutputStream());
    out.write(myData);
    out.close();

    // try ... catch to handle errors nicely
    try {
      // make the call to the API
      InputStream response = request.getInputStream();
      BufferedReader in = new BufferedReader(new InputStreamReader(response));
      String replyText;
      while ((replyText = in.readLine()) != null) {
        System.out.println(replyText);
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("An error occurred:" + ex.getMessage());
      BufferedReader in = new BufferedReader(new InputStreamReader(request.getErrorStream()));
      // print the detail that comes with the error
      String replyText;
      while ((replyText = in.readLine()) != null) {
        System.out.println(replyText);
      }
      in.close();
    }
    request.disconnect();
    return otp;
  }
}
