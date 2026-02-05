package com.google.extend.section02.protect;

import com.google.extend.section02.finalkeyword.SuperClass;

public class Child2 {

  public void method() {
    SuperClass s = new SuperClass();

    // child2 클래스는 SuperClass 를 상속 받지 않아
    // protected 에 접근 불가

    s.test4(); // public
  }
}
