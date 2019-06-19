package com.company.lab3.Calculator;
import java.util.Scanner;

public class LogicalOp {
    public int checkBiggerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    String text = "FastTrackIT";

    public String compareTexts(String text1) {
        if (text1.equals(text)) {
            String result = "Learning text comparison.";
            return result;
        } else {
            String result = "Got to try some more.";
            return result;
        }
    }

    public String checkStringNumber(String text1, int number) {
        if (text1.equals(text) && number <= 3) {
            String result = "FastTrackIT\n" + number;
            return result;
        } else if (!text1.equals(text) && number >= 4) {
            String result = number + "\nFastTrackIT";
            return result;
        } else {
            String result = "Got to try more.";
            return result;
        }
    }

    public String checkSnow(int number) {
        if (number > 8 || number == 6) {
            String result = "The amount of snow this winter was(cm):" + number;
            return result;
        } else {
            String result = "The forecast snow is(cm):" + number;
            return result;
        }
    }

    public String checkNumber(int number) {
        if (number > 3 && number != 4) {
            String result = "The number is greater than 3 and not equal to 4";
            return result;
        } else if (number == 4) {
            String result = "The number is equal to 4";
            return result;
        } else if (number < 3) {
            String result = "The number is lower than 3";
            return result;
        } else {
            String result = "The number is equal to 3";
            return result;
        }
    }
    public void switchPrint(int number){
        switch(number){
             case 0:
                System.out.println("The number is: 0!");
                break;
             case 1:
                System.out.println("The number is: 1!");
                break;
             case 2:
                System.out.println("The number is: 2!");
                break;
             case 3:
                System.out.println("The number is: 3!");
                break;
             case 4:
                System.out.println("The number is: 4!");
                break;
             case 5:
                System.out.println("The number is: 5!");
                break;
             case 6:
                System.out.println("The number is: 6!");
                break;
             case 7:
                System.out.println("The number is: 7!");
                break;
             case 8:
                System.out.println("The number is: 8!");
                break;
             case 9:
                System.out.println("The number is: 9!");
                break;
             default:
                System.out.println("Not allowed.");

        }
    }

    public boolean isNumberEven(int numberE) {
        if (numberE % 2 == 0) {
            boolean result=true;
            return result;
        } else {
            boolean result=false;
            return result;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            boolean result=true;
            return result;
        } else {
            boolean result=false;
            return result;
        }
    }

    public int biggestNumber(int nr1, int nr2, int nr3){
        if (nr1>=nr2&&nr1>=nr3){
            int result=nr1;
            return result;
        }else if (nr2>=nr1&&nr2>=nr3){
            int result=nr2;
            return result;
        }else{
            int result=nr3;
            return result;
        }
    }
    Scanner scan=new Scanner(System.in);

    public void intNumber(){
        System.out.println("Introduceti va rog un numar intreg: ");
        int number= scan.nextInt();
        System.out.println("Numarul introdus este:" + number);
        int squareNumber=number*number;
        System.out.println("Patratul numarului introdus este: " + squareNumber);
    }
    public void division(){
        System.out.println("Introduceti va rog 2 numere: ");
        double first=scan.nextDouble();
        double second=scan.nextDouble();
        double div=first/second;
        System.out.println("Rezultatul impartirii " + first +" la " + second + " este: " + div);
    }

    public void max(){
        System.out.println("Introduceti va rog 4 numere intregi: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        if(a>=b&&a>=c&&a>=d){
            System.out.println("Cel mai mare numar este: " + a);
        } else if(b>=a&&b>=c&&b>=d){
            System.out.println("Cel mai mare numar este: " + b);
        } else if(c>=a&&c>=b&&c>=d){
            System.out.println("Cel mai mare numar este: " + c);
        } else{
            System.out.println("Cel mai mare numar este: " + d);
        }
    }
    public void minMax(){
        System.out.println("Introduceti va rog 3 numere intregi: ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        if(a>=b&&a>=c){
            System.out.println("Cel mai mare numar este: " + a);
        } else if(b>=a&&b>=c){
            System.out.println("Cel mai mare numar este: " + b);
        } else{
            System.out.println("Cel mai mare numar este: " + c);
        }
        if(a<=b&&a<=c){
            System.out.println("Cel mai mic numar este: " + a);
        } else if(b<=a&&b<=c){
            System.out.println("Cel mai mic numar este: " + b);
        } else{
            System.out.println("Cel mai mic numar este: " + c);
        }
    }
    public void orderedNumbers(){
        System.out.println("Introduceti va rog 2 numere intregi: ");
        int first=scan.nextInt();
        int second=scan.nextInt();
        if(first<second){
            System.out.println("Numerele ordonate crescator: " + first + " , " + second);
        }else if (second<first){
            System.out.println("Numerele ordonate crescator: " + second + " , " + first);
        }else{
            System.out.println("Numerele sunt egale.");
        }
    }

}
