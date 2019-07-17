package com.company.lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class LogicalOp {
     public List<Integer> getListHundred(){
         List<Integer> myList=new ArrayList<>();
         for(int i=1;i<=100;i++){
             myList.add(i);
         }
         return myList;
     }

     public void displayList(List<Integer> list) {
         for (int i = 0; i < list.size(); i++) {
             System.out.println(list.get(i));
         }
     }
     public void displayListB( List<Integer> list){
         for(int i:list){
             System.out.println(i);
         }
     }

     public void addToList(List<Double> myListD, double a){
         myListD.add(a);
         for(double i: myListD){
             System.out.println(i);
         }
     }

     public void printIntList(List<Integer> myListI, int x) {
         for (int i=0; i<myListI.size();i++) {
             if (myListI.get(i)==x){
                for(int j=i; j<myListI.size();j++){
                    System.out.println(myListI.get(j));
                 }
             }
         }
     }

     public void printBackwards(List<Integer> myListI){
         for (int i=myListI.size()-1; i>=0; i--){
             System.out.println(myListI.get(i));
         }
     }

     public List<String> doStringList(List<String> myStringList, int x, String myString){
         for (int i=0; i<myStringList.size();i++){
             if(i==x){
                 myStringList.add(i,myString);
             }
         }
         return myStringList;
     }

     public List<Integer> doIntegerList(List<Integer> myIntList, int y){
         myIntList.add(0,y);
         return myIntList;
     }

    public List<Integer> doIntegerListB(List<Integer> myIntList, int y){
        myIntList.add(1,y);
        return myIntList;
    }

     public void printList(List<Integer>myIntList){
         for (int i=0;i<myIntList.size();i++){
             System.out.println("Pe pozitia "+ i + " valoarea este " + myIntList.get(i));
         }
     }

     public int checkMaxList (List<Integer>myIntListB) {
         int max = 0;
         for (int i = 0; i < myIntListB.size(); i++) {
             if (max < myIntListB.get(i)) {
                 max = myIntListB.get(i);
             }
         }
         return max;
     }

     //tema optionala
     public List<Integer> switchValues (List<Integer>myIntListB, int x, int y){
                 int i=myIntListB.indexOf(x);
                 int j=myIntListB.indexOf(y);
                 myIntListB.set(i,y);
                 myIntListB.set(j,x);
         return myIntListB;
     }

     public List<Integer> evenList(List<Integer> myIntListB){
         List<Integer>myIntListEven=new ArrayList<>();
         for (int i=0;i<myIntListB.size(); i++){
             if(myIntListB.get(i)%2==0){
                 myIntListEven.add(myIntListB.get(i));
             }
         }
         return myIntListEven;
     }

     public List<Integer> sortList(List<Integer> myListC){
         for(int i=0;i<myListC.size();i++) {
             for (int j = i+1; j < myListC.size(); j++) {
                 if (myListC.get(i) > myListC.get(j)) {
                     int x = myListC.get(i);
                     int y = myListC.get(j);
                     myListC.set(i,y);
                     myListC.set(j,x);
                 }
             }
         }
      return myListC;
     }
}




