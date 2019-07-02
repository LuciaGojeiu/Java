package com.company.lab5.Calculator;

import java.util.Arrays;

public class LogicalOp {
    public int[] getArrayToHundred() {
        int[] myArray = new int[100];
        for (int i = 1; i <= myArray.length; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }


    public int[] getEvenToHundred() {
        int[] myEvenArray = new int[50];
        for (int i = 1; i <= 50; i++) {
            myEvenArray[i - 1] = i * 2;
        }
        return myEvenArray;
    }

    public int[] getEvenToHundredB() {
        int[] myEvenArrayB = new int[50];
        int j = 0;
        for (int i = 2; i <= 100; i += 2) {
            myEvenArrayB[j] = i;
            j++;
        }
        return myEvenArrayB;
    }

    public float getAverageArray(int[] myAvArray) {
        float sum = 0;
        for (int i = 0; i < myAvArray.length; i++) {
            sum += myAvArray[i];
        }
        float average = sum / myAvArray.length;
        return average;
    }

    public boolean compareStrings(String[] myStrings, String myString) {
        for (int i = 0; i < myStrings.length; i++) {
            if (myString.equals(myStrings[i])) {
                return true;
            }
        }
        return false;
    }

    public String verifyNumbers(int[] myIntArray, int myInt) {
        for (int i = 0; i < myIntArray.length; i++) {
            if (myInt == myIntArray[i]) {
                String result = "Numarul se regaseste in lista la indexul: " + i;
                return result;
            }
        }
        String result = "Numarul nu se regaseste in lista.";
        return result;
    }


    public void printGrille() {
        String[] myString = new String[10];
        for (int j = 0; j < myString.length; j++) {
            for (int i = 0; i < myString.length; i++) {
                System.out.print("- ");
            }
            System.out.println();
        }
    }

    public int[] returnArray(int[] myFirstArray, int x) {
        int[] mySecondArray = new int[myFirstArray.length - 1];
        for (int i = 0; i < myFirstArray.length; i++) {
            if (x == myFirstArray[i]) {
                System.arraycopy(myFirstArray, 0, mySecondArray, 0, i);
                System.arraycopy(myFirstArray, i + 1, mySecondArray, i, myFirstArray.length - i - 1);
            }
        }
        return mySecondArray;
    }

    public int secondSmallestNumber(int[] numArray){
        Arrays.sort(numArray);
        return numArray[1];
    }

    public int [] copyArray(int[]firstArray, int[]secondArray){
        for(int i=0; i<firstArray.length; i++){
            System.arraycopy(firstArray,0,secondArray,0,firstArray.length);
        }
        return secondArray;
    }


}


