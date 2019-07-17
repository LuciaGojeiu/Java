package com.company.lab7.Calculator;

public class Main {
    public static void main(String[] args) {
        Read read = new Read();
        System.out.println("You entered the number: " + read.getInt());
        System.out.println("You entered the number: " + read.getFloat());
        System.out.println("You entered the number: " + read.getDouble());
        System.out.println("You entered the number: " + read.getByte());
        System.out.println(read.intList());

        int[] myArray = read.intArray(5);
        System.out.println("The array is:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        LogicalOp op = new LogicalOp();
        int[] myArrayA = {78, 89, 5, 6, 7, 50, 100};
        op.getNumberFromArray(myArrayA, 10);

        op.waitS(5000);
    }
}
