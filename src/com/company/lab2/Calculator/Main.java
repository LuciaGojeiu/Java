package com.company.lab2.Calculator;

public class Main {

    public static void main(String[] args) {
        printHello();
        byte a = printA();
        System.out.println("a=" + a);
        byte b = printB();
        System.out.println("b=" + b);
        float c = printC();
        System.out.println("c=" + c);
        byte d = printD();
        System.out.println("d=" + d);

        int sumPrint = sum(7, 8);
        System.out.println("Rezultatul adunarii este:" + sumPrint);
        int substractPrint = substract(1111, 10);
        System.out.println("Rezultatul scaderii este:" + substractPrint);
        int multiplyPrint = multiply(100, 200);
        System.out.println("Rezultatul inmultirii este:" + multiplyPrint);
        int divisionPrint = division(1000, 10);
        System.out.println("Rezultatul impartirii este:" + divisionPrint);

        printJavaModel();
        printJavaModelLN();

        float averageCalculator = nrAverage(3.5f,3,4.9f);
        System.out.println("Media Numerelor este:" + averageCalculator);

        printModel();

        int printModulo=modulo(5,2);
        System.out.println("Restul impartirii este:" + printModulo);

        float printTempCelsius=tempCelsius(70);
        System.out.println(printTempCelsius + " grade Celsius.");

        double printMeters=meters(77.5);
        System.out.println(printMeters + " metrii.");

        calculViteza(1500.00,1,25,27);
    }
    public static void printHello() {
        System.out.println("Hello\nLucia");
    }

    public static byte printA() {
        byte result = -5 + 8 * 6;
        return result;
    }

    public static byte printB() {
        byte result = (55 + 9) % 9;
        return result;
    }

    public static float printC() {
        float result = 20 + -3 * 5 / 8f;
        return result;
    }

    public static byte printD() {
        byte result = 5 + 15 / 3 * 2 - 8 % 3;
        return result;
    }


    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int substract(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static void printJavaModel() {
        System.out.println("   J    a    v     v   a");
        System.out.println("   J   a a    v   v   a a");
        System.out.println("J  J  aaaaa    v v   aaaaa");
        System.out.println(" JJ  a     a    v   a     a");
    }

    public static void printJavaModelLN() {
        System.out.println("\n   J    a    v     v   a\n   J   a a    v   v   a a\nJ  J  aaaaa    v v   aaaaa\n JJ  a     a    v   a     a");

    }
    public static float nrAverage(float x, float y, float z){
        float result =(x + y + z)/3;
        return result;
    }
    public static void printModel(){
        System.out.println(" +\"\"\"\"\"+\n[| o o |]\n |  ^  | \n | \'_\' |\n +-----+");

    }
    public static int modulo(int a, int b){
        int result=a%b;
        return result;
    }
    public static float tempCelsius(float tempF){
        float result=5f / 9* (tempF - 32);
        return result;
    }
    public static double meters(double inch){
        double result=inch*0.0254;
        return result;
    }
    public static void calculViteza(double m, double ore, double min, double s){
        double metriiSecunda=m/(ore*360+min*60+s);
        double kilometriiOra=(m/1000)/(ore+min/60+s/360);
        double mileOra=(m/1609)/(ore+min/60+s/360);
        System.out.println("Viteza in metrii pe secunda:" + metriiSecunda +" m/s;");
        System.out.println("Viteza in kilometrii pe ora:" + kilometriiOra +" km/ora;");
        System.out.println("Viteza in mile pe ora:" + mileOra +" mile/ora;");
        return;
    }

}


