package com.google.section03.branching;

public class B_continue {

  /*
  *   continue (다음 반복으로 넘어가기)
  * */
  public void testSimpleContinueStatement() {

    for (int i = 0; i < 10; i++) {
      // i가 짝수 일 경우에 다음 반복으로 넘어가기 (for 문은 증감식으로 넘어감)
      if(i % 2 == 0) continue;
        System.out.println("i = " + i);
    }
  }


  /**
   * 1~100 까지 출력
   * 단, 4의 배수 또는 5의 배수는 제외
   */
  public void testSimpleContinueStatement2() {
    for (int i = 1; i < 100; i++) {
      if(i % 4 == 0 || i % 5 ==0) continue;

      System.out.println("i = " + i);
    }
  }
}
