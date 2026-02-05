package com.google.section03.interfaceimplements;

public class Application2 {
  public static void main(String[] args) {

    Caculator caculator = new PCJCalculator();

    System.out.println("plus : " + caculator.plus(100,70));
    System.out.println("minus : " + caculator.minus(20,200));
    System.out.println("multiple : " + caculator.multiple(23,70));
    System.out.println("divide : " + caculator.divide(5,2));
    System.out.println("mod : " + caculator.mod(10,3));
  }
}
