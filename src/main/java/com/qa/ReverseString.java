package com.qa;

public class ReverseString {
    public static void main(String[] args) {
        String ip = "Reverse Me";
        String op = "";
        for (int i = ip.length() - 1; i >= 0; i--) {
            op = op + ip.charAt(i);
        }
        System.out.println("Input String: " + ip);
        System.out.println("Output String: " + op);
    }
}
