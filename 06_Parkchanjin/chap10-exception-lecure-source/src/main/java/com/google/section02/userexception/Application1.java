package com.google.section02.userexception;

import com.google.section02.userexception.exception.MoenyNegativeException;
import com.google.section02.userexception.exception.NegativeException;
import com.google.section02.userexception.exception.PriceNegativeException;

public class Application1 {

  public static void main(String[] args) {

    ExceptionTest et = new ExceptionTest();

    try {
      //et.checkEnoughMoeny(-30000, -10000);
      et.checkEnoughMoeny(30000, -10000);
      //et.checkEnoughMoeny(30000, 5000);

    } catch (NegativeException e) {
      // 부모 타입의 예외를 매개 변수로 설정하면
      // 모든 자식 예외를 잡아서 처리할 수 있다!!!@
      // - 부모, 자식 예외 가리지 않고 처리 방법이 똑같다면
      //   부모 타입 catch 하나만 작성하는 것이 코드 길이 감소에 도움됨
      System.err.println(e.getMessage());
    }
//     catch (PriceNegativeException e){
//      // e.printStackTrace();
//      System.err.println(e.getMessage());
//
//    } catch (MoenyNegativeException e){
//      System.err.println(e.getMessage());
//
//    }
  }
}
