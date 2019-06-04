package com.company.lab2.KeyboardData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduceti 2 numere intregi:");
        Scanner s = new Scanner(System.in);
        int write1 = s.nextInt();
        int write2 = s.nextInt();
        double media=(write1+write2)/2;
        System.out.println("Media numerelor " + write1 + " si " + write2 + " este: "+ media);

    }
}
