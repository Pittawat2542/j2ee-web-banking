package banking.utils;

import java.security.MessageDigest;

public class PasswordEncryption {

    public static void main(String[] args) 
        throws Exception {
        byte[] rawData = "myPassword".getBytes("UTF-8");
        System.out.println("myPassword".getBytes("UTF-8"));
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] digested = md.digest(rawData);
        
        for (int i = 0; i < digested.length; i++) {
            System.out.print( digested[i] + " ");
        }
    }
}
