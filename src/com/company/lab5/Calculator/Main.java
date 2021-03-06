package com.company.lab5.Calculator;

import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Calculator calculator=new Calculator();
        System.out.println(calculator.sum(5,10));
        System.out.println(calculator.sum(5.7,2.3, 7.1));
        System.out.println(calculator.substract(50,10));
        System.out.println(calculator.substract(70, 25.7f));
        System.out.println(calculator.multiply(10,3));
        System.out.println(calculator.multiply(2.2, 5.7, 3.9));
        System.out.println(calculator.division(500,10));
        System.out.println(calculator.division(25.7f,2));
        System.out.println(calculator.modulo(77,9));
        System.out.println(calculator.modulo(23.5f,53.2f));


        LogicalOp op = new LogicalOp();
        int[] myArray = op.getArrayToHundred();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        int[] myEvenArray=op.getEvenToHundred();
        for(int i=0;i<myEvenArray.length; i++){
            System.out.println(myEvenArray[i]);
        }

        int[] myEvenArrayB=op.getEvenToHundredB();
        for(int i=0;i<myEvenArrayB.length; i++){
            System.out.println(myEvenArrayB[i]);
        }

        int[] myAvArray={1,5,9,3,5,7};
        float media =op.getAverageArray(myAvArray) ;
        System.out.println("Media numerelor din myAvArray este;" + media);

        String [] myStrings={"abc","acb"};
        boolean verify=op.compareStrings(myStrings,"acb");
        System.out.println(verify);

        int[] myIntArray={1,2,3,9,8,7};
        System.out.println(op.verifyNumbers(myIntArray, 9));

        op.printGrille();

        int[] myFirstArray={1,2,3,56,72,25,45,78};
        System.out.println(Arrays.toString(op.returnArray(myFirstArray, 56)));

        int[] numArray={1,5,9,4,7};
        System.out.println(op.secondSmallestNumber(numArray));

        int[] firstArray={1,5,7,9,4};
        int[] secondArray= new int[firstArray.length];
        System.out.println(Arrays.toString(op.copyArray(firstArray,secondArray)));
    }

}
