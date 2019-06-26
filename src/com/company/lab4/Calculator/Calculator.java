package com.company.lab4.Calculator;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int substract(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public void printJavaModel() {
        System.out.println("   J    a    v     v   a");
        System.out.println("   J   a a    v   v   a a");
        System.out.println("J  J  aaaaa    v v   aaaaa");
        System.out.println(" JJ  a     a    v   a     a");
    }

    public void printJavaModelLN() {
        System.out.println("\n   J    a    v     v   a\n   J   a a    v   v   a a\nJ  J  aaaaa    v v   aaaaa\n JJ  a     a    v   a     a");

    }
    public float nrAverage(float x, float y, float z){
        float result =(x + y + z)/3;
        return result;
    }
    public void printModel(){
        System.out.println(" +\"\"\"\"\"+\n[| o o |]\n |  ^  | \n | \'_\' |\n +-----+");

    }
    public int modulo(int a, int b){
        int result=a%b;
        return result;
    }
    public float tempCelsius(float tempF){
        float result=5f / 9* (tempF - 32);
        return result;
    }
    public double meters(double inch){
        double result=inch*0.0254;
        return result;
    }
    public void calculViteza(double m, double ore, double min, double s){
        double metriiSecunda=m/(ore*3600+min*60+s);
        double kilometriiOra=(m/1000)/(ore+min/60+s/3600);
        double mileOra=(m/1609)/(ore+min/60+s/3600);
        System.out.println("Viteza in metrii pe secunda:" + metriiSecunda +" m/s;");
        System.out.println("Viteza in kilometrii pe ora:" + kilometriiOra +" km/ora;");
        System.out.println("Viteza in mile pe ora:" + mileOra +" mile/ora;");
    }

}


