package com.google.section03.interfaceimplements;

public interface Caculator {

  double PI = 3.14; // public static final 생략 상태
  int MAX_NUM = 100;
  int MIN_NUM = -100;

  int plus (int num1, int num2);
  int minus (int num1, int num2);
  int multiple (int num1, int num2);
  double divide (int num1, int num2);
  int mod (int num1, int num2);


}
