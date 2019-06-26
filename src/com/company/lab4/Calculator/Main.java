package com.company.lab4.Calculator;

public class Main {

    public static void main(String[] args) {
        LogicalOp op = new LogicalOp();
        op.printToHundred(95);
        op.printToMinusHundred(-95);
        op.print2Numbers(2,10);
        op.printB2Numbers(10,2);
        op.printEvenNumbers();
        op.printOddNumbers();
        int suma=op.sumToHundred(98);
        System.out.println("Suma pana la 100 este: " + suma);
        float media=op.averageToHundred(98);
        System.out.println("Media numerelor este: " + media);
        op.printStars();
        op.printToHundredWhile(98);
        op.printToMinusHundredWhile(-98);
        op.print2NumbersDoWhile(2,7);
        op.printB2NumbersWhile(7,2);
        op.printEvenNumersWhile();
        op.printOddNumbersDoWhile();
        op.printAddedNumbers();
        float mediaDivNumbers=op.averageDiv7Numbers(22,5);
        System.out.println("Media numerelor divizibile cu 7 in intervalul ales este: " + mediaDivNumbers);
        op.printFibonacci();
        op.printCozaLozaWoza();


    }

}


