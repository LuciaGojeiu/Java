package com.company;

public class Main {

    public static void main(String[] args) {
    //Printare "Hello" in consola, iar pe rand nou numele:
      System.out.println("Hello");
      System.out.println("Lucia");

      //Printare rezultatul sumei a doua numere:
      short x=1234;
      float y=3.1415f;
      System.out.println(x+y);

      //Printare rezultatul impartirii a doua numere:
      byte m=34;
      float n=4f;
      System.out.println(m/n);

      //Printare rezultat operatiuni:
      byte a=-5 + 8 * 6;
      System.out.println(a);
      byte b=(55+9) % 9;
      System.out.println(b);
      float c=20 + -3*5 / 8f;
      System.out.println(c);
      byte d=5 + 15 / 3 * 2 - 8 % 3;
      System.out.println(d);

    }
}
