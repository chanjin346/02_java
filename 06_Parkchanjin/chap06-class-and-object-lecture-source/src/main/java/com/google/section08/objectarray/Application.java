package com.google.section08.objectarray;

public class Application {
  public static void main(String[] args) {

    /* 객체 배열 선언 및 할당 */
    Car[] cars = new Car[5];
    // new Car[5] : heap 영역에 Car타입의 변수 5칸 만들기
    // == Car 참조형 변수 5개 묶음

    System.out.println(cars[0]); //null

    cars[0] = new Car("페라리", 300);
    cars[1] = new Car("람보르기니", 350);
    cars[2] = new Car("롤스로이스", 250);
    cars[3] = new Car("부가티베이론", 400);
    cars[4] = new Car("포터", 500);

    for(int i = 0; i < cars.length; i++){
      cars[i].driveMaxSpeed();
    }

    int[] arr = {1, 2, 3, 4, 5};

    Car[] cars2 = {
        new Car("테슬라 사이버트럭", 300),
        new Car("다마스", 140),
        cars[3]
    };

    /* 향상된 for 문 */
    for(Car car : cars2) {
      car.driveMaxSpeed();
    }
  }
}
