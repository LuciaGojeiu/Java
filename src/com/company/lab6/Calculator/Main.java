package com.company.lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LogicalOp op=new LogicalOp();
        System.out.println(op.getListHundred());

        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(22);
        list.add(12);
        list.add(10);
        op.displayList(list);
        op.displayListB(list);

        List<Double> myListD= new ArrayList<>();
        myListD.add(2.3);
        myListD.add(5.7);
        myListD.add(7.9);
        myListD.add(1.5);
        op.addToList(myListD,7.5);

        List<Integer> myListI=new ArrayList<>();
        myListI.add(10);
        myListI.add(12);
        myListI.add(14);
        myListI.add(16);
        myListI.add(18);
        myListI.add(20);
        op.printIntList(myListI,14);

        op.printBackwards(myListI);

        List<String> myStringList=new ArrayList<>();
        myStringList.add("ab");
        myStringList.add("cd");
        myStringList.add("de");
        myStringList.add("ef");
        System.out.println(op.doStringList(myStringList,2,"bc"));

        List<Integer> myIntList=new ArrayList<>();
        myIntList.add(10);
        myIntList.add(12);
        myIntList.add(15);
        myIntList.add(19);
        myIntList.add(24);
        System.out.println(op.doIntegerList(myIntList,9));

        op.printList(myIntList);

        List<Integer> myIntListB=new ArrayList<>();
        myIntListB.add(45);
        myIntListB.add(55);
        myIntListB.add(78);
        myIntListB.add(110);
        myIntListB.add(85);
        System.out.println("Cel mai mare numar din lista este "+ op.checkMaxList(myIntListB));


    }
}
