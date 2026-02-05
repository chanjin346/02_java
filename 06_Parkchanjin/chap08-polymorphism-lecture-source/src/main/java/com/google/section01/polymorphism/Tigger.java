package com.google.section01.polymorphism;

public class Tigger extends Animal{

  @Override
  public void eat() {
    System.out.println("호랑이는 고기를 뜯어 먹습니다.");
  }

  @Override
  public void sleep() {
    System.out.println("호랑이 자용!!");
  }


  @Override
  public void move() {
    System.out.println("호랑이가 움직여용");
  }


  public void bite() {
    System.out.println("호랑이는 이빨로 물어뜯습니다. 앙!");
  }
}
