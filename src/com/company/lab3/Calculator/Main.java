package com.company.lab3.Calculator;

public class Main {

    public static void main(String[] args) {

        // Logical Operations
        LogicalOp op = new LogicalOp();
        int biggest = op.checkBiggerNumber(3, 4);
        System.out.println("The bigger number is:" + biggest);


        System.out.println(op.compareTexts("Fast "));

        System.out.println(op.checkStringNumber("FastTrack",5));

        System.out.println(op.checkSnow(6));

        System.out.println(op.checkNumber(10));

        op.switchPrint(7);

        System.out.println(op.isNumberEven(19));

        System.out.println(op.isEligibleToVote(19));

        System.out.println("The biggest number is:" + op.biggestNumber(7,7,3));

        op.intNumber();
        op.division();
        op.max();
        op.minMax();
        op.orderedNumbers();

    }

}


