package com.google.section01.polymorphism;


/*
*

 */
public class Application2 {
  public static void main(String[] args) {
    Animal[] animals = new Animal[4];
                      // Aniaml 참조 변수 4개
    animals[0] = new Animal();
    animals[1] = new Tigger(); // Animal 참조변수 = Tigger 인스턴스 (Tigger -> Animal 업캐스팅)
    animals[2] = new Goat(); // Goat -> Animal 업캐스팅
    animals[3] = new Rabbit(); // Rabbit -> Animal 업캐스팅

    for(Animal a : animals){
      a.eat();
      // 정적 바인딩 -> Animal.eat()와 바인딩
      // 동적 바인딩 -> a가 참조하는 실제 인스턴스의 eat() 와 바인딩
    }
  }
}
