package com.company.lab5.Calculator;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public double sum(double x, double y, double z){
        double result =x+y+z;
        return result;
    }

    public int substract(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }

    public float substract(int x, float y){
        float result=x-y;
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    public double multiply(double a, double b, double c){
        double result=a*b*c;
        return result;
    }

    public int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public float division(float firstNumber, int secondNumber){
        float result=firstNumber/secondNumber;
        return result;
    }

    public int modulo(int a, int b) {
        int result = a % b;
        return result;
    }

    public float modulo(float a, float b){
        float result=a%b;
        return result;
    }

}