package com.company.lab7.Calculator;

public class LogicalOp {
    public void getNumberFromArray(int[] myArrayA, int x) {
        try {
            System.out.println(myArrayA[x]);
        } catch (ArrayIndexOutOfBoundsException error) {
            System.err.println("Inside catch, number too large.");
        }
    }

    public void waitA(int x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public void waitB(int x){
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
