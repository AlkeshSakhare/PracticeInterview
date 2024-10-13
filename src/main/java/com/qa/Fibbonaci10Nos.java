package com.qa;

public class Fibbonaci10Nos {
    public static void main(String[] args) {
        int firstNo = 1, secondNo = 2;
        int sum;
        System.out.print(firstNo + "\t" + secondNo);
        for (int i = 0; i < 8; i++) {
            sum = firstNo + secondNo;
            System.out.print("\t" + sum);
            int temp = secondNo;
            secondNo = sum;
            firstNo = temp;
        }
    }
}
