package oop;

import java.security.MessageDigest;

public class Quiz {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }

        int[] arr = new int[0];

        System.out.println();
        System.out.println("A"+('\t'+'\u0003')+"   "+('A'+'1'+"2")+"  "+("A"+12)+"  "+('A'+"12"));
    }
}