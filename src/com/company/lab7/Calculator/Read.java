package com.company.lab7.Calculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    public int getInt() {
        boolean repeat = false;
        int x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter an integer type number: ");
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not an integer type number, try again!");
            }
        } while (repeat);
        return x;
    }

    public float getFloat() {
        boolean repeat = false;
        float y = 0.0f;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a float type number: ");
                y = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not a float type number, try again!");
            }
        } while (repeat);
        return y;
    }

    public double getDouble() {
        boolean repeat = false;
        double z = 0.0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a double type number: ");
                z = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not a double type number, try again!");
            }
        } while (repeat);
        return z;
    }

    public byte getByte() {
        boolean repeat = false;
        byte b = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                System.out.print("Please enter a byte type number: ");
                b = scan.nextByte();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.err.println("Not a byte type number, try again!");
            }
        } while (repeat);
        return b;
    }

    public List<Integer> intList() {
        List<Integer> myIntList = new ArrayList<>();
        System.out.println("Please enter integer numbers to make a list:");
        boolean repeat = true;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                myIntList.add(x);
                repeat = true;
            } catch (InputMismatchException error) {
                repeat = false;
                System.err.println("Not a number, the list is finished!");
            }
        }
        while (repeat);
        return myIntList;
    }

    public int[] intArray(int x) {
        System.out.println("Please enter numbers to make an array of " + x + " positions:");
        int[] myIntArray = new int[x];
        boolean repeat = false;
        do {
            try {
                for (int i = 0; i < x; i++) {
                    Scanner scan = new Scanner(System.in);
                    myIntArray[i] = scan.nextInt();
                    repeat = false;
                }
            } catch (InputMismatchException error) {
                System.err.println("Please enter " + x + " numbers!");
                repeat = true;
            }
        } while (repeat);
        return myIntArray;
    }
}

