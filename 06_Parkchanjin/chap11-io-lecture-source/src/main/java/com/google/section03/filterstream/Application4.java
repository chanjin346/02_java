package com.google.section03.filterstream;

import java.io.*;

public class Application4 {
  public static void main(String[] args) {
    /* ObjectInputStream / OutputStream
    *  - 객체 단위 입출력 보조 스트림
    * */

    Member[] members = {
        new Member("user01", "pass01", 28,'남'),
        new Member("user02", "pass02", 29,'여'),
        new Member("user03", "pass03", 30,'여'),
        new Member("user04", "pass04", 23,'여'),
        new Member("user05", "pass05", 33,'여')
    };

    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("members.dat"))) {
       // 모든 객체의 모든 클래스는 object의 자손이여서 업캐스팅함
      oos.writeObject(members); // 매개변수에 업캐스팅 적용 (자료형 구분없이 다 받겠다 라는 뜻)

    } catch (IOException e){
      System.out.println(e.getMessage());
    }

    try(ObjectInputStream ois =
        new ObjectInputStream(new FileInputStream("members.dat"))) {

      // 읽어온 Object -> Member[] 다운캐스팅
      // + 직렬화된 데이터를 원래 객체 상태로 바꿈(역직렬화)
      Member[] inputMembers = (Member[]) ois.readObject();

      for(Member mem : inputMembers){
        System.out.println(mem.toString());
      }



    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
