package com.google.section02.userexception;

import com.google.section02.userexception.exception.NegativeException;

import com.google.section02.userexception.exception.PriceNegativeException;
import com.google.section02.userexception.exception.MoenyNegativeException;
import com.google.section02.userexception.exception.NegativeException;
import com.google.section02.userexception.exception.PriceNegativeException;

public class Application2 {
  public static void main(String[] args) {
    ExceptionTest et = new ExceptionTest();


    try {
      et.checkEnoughMoeny(-2000, -10000); //PriceNegativeException
      et.checkEnoughMoeny(2000, -3000);    //MoneyNegativeException
      et.checkEnoughMoeny(30000, 5000);   //NegativeException
      et.checkEnoughMoeny(1000, 20000);
    } catch (PriceNegativeException e) {
      System.err.println(e.getMessage());
    } catch (MoenyNegativeException e) {
      System.err.println(e.getMessage());
    }
    /* PriceNegativeException과 MoneyNegativeException catch문보다 앞에 올 수 없다.
     *  왜냐하면, 앞에 오는 순간 뒤에 오는 2개의 예외는 앞의 Negative에서 처리할 수 있기 때문이다.
     * */ catch (NegativeException e) {
      /*
      - 부모 타입의 예외를 매개 변수로 설정하면
      모든 자식 예외를 잡아서 처리할 수 있다!!!!
      - 부모, 자식 예외 가리지 않고 처리 방법이 똑같다면
      부모 타입catch 하나만 작성하는 것이 코드 길이 감소에 도움됨
      */
      System.err.println(e.getMessage());
    }
  }
}
