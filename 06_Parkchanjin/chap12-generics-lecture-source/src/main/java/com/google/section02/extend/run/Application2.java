package com.google.section02.extend.run;

import com.google.section02.extend.Bunny;
import com.google.section02.extend.MethodFarm;
import com.google.section02.extend.Rabbit;
import com.google.section02.extend.Snake;

public class Application2 {
  public static void main(String[] args) {

    /* <T> 메서드 호출 -> 별도 제약 없이 인자 전달 가능 */
    MethodFarm farm = new MethodFarm();
    farm.animalType(new String(), new Object());


    /* < T extends Mammal > 학인 */
    //farm.mammalType(new Snake());
    farm.mammalType(new Rabbit());

    /* < T extends Raptile > 학인 */
    farm.reptileType(new Snake());
    //farm.reptileType(new Rabbit());

  }
}
