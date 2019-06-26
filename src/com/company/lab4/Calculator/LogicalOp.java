package com.company.lab4.Calculator;

public class LogicalOp {

    //For Loop

    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printToMinusHundred(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void print2Numbers(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void printB2Numbers(int x, int y) {
        if (x < y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }

    public void printEvenNumbers() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public void printOddNumbers() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);
        }
    }

    public int sumToHundred(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float averageToHundred(int number) {
        int sum = 0;
        int count = 0;
        float average = 0;
        for (int i = number; i <= 100; i++) {
            sum += i;
            count++;
            average = sum / count;
        }
        return average;
    }

    public void printStars() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //While Loop

    public void printToHundredWhile(int number) {
        int i = number;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    public void printToMinusHundredWhile(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    public void print2NumbersDoWhile(int x, int y) {
        int i = x;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= y);
    }

    public void printB2NumbersWhile(int x, int y) {
        if (x < y) {
            int i = x;
            while (i <= y) {
                System.out.println(i);
                i++;
            }
        } else {
            int i = y;
            while (i <= x) {
                System.out.println(i);
                i++;
            }
        }
    }

    public void printEvenNumersWhile() {
        int i = 2;
        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }
    }

    public void printOddNumbersDoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i += 2;
        }
        while (i <= 100);
    }

    public void printAddedNumbers() {
        int i = 111;
        int sum = 0;
        float count = 0;
        float average = 0;
        while (i <= 8899) {
            sum += i;
            count++;
            i++;
        }
        System.out.println("Suma numerelor din intervalul 111 si 8899 este : " + sum);
        average = sum / count;
        System.out.println("Media numerelor din intervalul 111 si 8899 este : " + average);
    }

    public float averageDiv7Numbers(int x, int y) {
        int sum = 0;
        float count = 0;
        float average = 0;
        if (x < y) {
            int i = x;
            while (i <= y) {
                if (i % 7 == 0) {
                    sum += i;
                    count++;
                }
                i++;
            }
            average = sum / count;
            return average;
        } else {
            int i = y;
            while (i <= x) {
                if (i % 7 == 0) {
                    sum += i;
                    count++;
                }
                i++;
            }
            average = sum / count;
            return average;
        }
    }

    public void printFibonacci() {
        int a = 0;
        System.out.println(a);
        int b = 1;
        System.out.println(b);
        int f;
        int count = 1;
        while (count <= 18) {
            f = a + b;
            a = b;
            b = f;
            System.out.println(f);
            count++;
        }
    }

    public void printCozaLozaWoza() {
        int i = 1;
            while (i <= 110) {
                if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                    System.out.print("CozaLozaWoza ");
                } else if (i % 5 == 0 && i % 7 == 0) {
                    System.out.print("WozaLoza ");
                } else if (i % 3 == 0 && i % 7 == 0) {
                    System.out.print("CozaWoza ");
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("CozaLoza ");
                } else if (i % 7 == 0) {
                    System.out.print("Woza ");
                } else if (i % 5 == 0) {
                    System.out.print("Loza ");
                } else if (i % 3 == 0) {
                    System.out.print("Coza ");
                } else {
                    System.out.print(i + " ");
                }
                if (i % 11 == 0) {
                    System.out.println( );
                    }
                i++;
            }
    }
}


