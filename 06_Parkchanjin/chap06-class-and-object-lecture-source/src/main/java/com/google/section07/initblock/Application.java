package com.google.section07.initblock;

import org.w3c.dom.ls.LSOutput;

public class Application {
  public static void main(String[] args) {

    Product p1 = new Product();

    System.out.println(p1.getInformation());


    Product p2 = new Product(60000);
    System.out.println(p2.getInformation());

  }
}
