package com.company.lab3.Calculator;

public class Main {

    public static void main(String[] args) {
        //Calculator
        /*Calculator calc=new Calculator();
        calc.printHello();
        calc.printA();
        System.out.println("a=" + calc.printA());
        calc.printB();
        System.out.println("b=" + calc.printB());
        calc.printC();
        System.out.println("c=" + calc.printC());
        calc.printD();
        System.out.println("d=" + calc.printD());

        calc.sum(7, 8);
        System.out.println("Rezultatul adunarii este:" + calc.sum(7,8));
        calc.substract(1111, 10);
        System.out.println("Rezultatul scaderii este:" + calc.substract(1111, 10));
        calc.multiply(100, 200);
        System.out.println("Rezultatul inmultirii este:" + calc.multiply(100, 200));
        calc.division(1000, 10);
        System.out.println("Rezultatul impartirii este:" + calc.division(1000, 10));

        calc.printJavaModel();
        calc.printJavaModelLN();

        calc.nrAverage(3.5f,3,4.9f);
        System.out.println("Media numerelor este:" + calc.nrAverage(3.5f,3,4.9f));

        calc.printModel();

        calc.modulo(5,3);
        System.out.println("Restul impartirii este:" + calc.modulo(5,3));

        calc.tempCelsius(70);
        System.out.println(calc.tempCelsius(70) + " grade Celsius.");

        calc.meters(77.5);
        System.out.println(calc.meters(77.5) + " metrii.");

        calc.calculViteza(1500.00,1,25,27);*/

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


