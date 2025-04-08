// 2025-04-08 2번 문제 변형 
// 길동, 희동, 기동의 점수를 입력 받아 가장 높은 점수를 획득한 학생의 점수를 출력하는 프로그램을 구현
package week_6;

import java.util.Scanner;

public class b2 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("길동이의 점수를 입력하세요");
      int gil = sc.nextInt();
      System.out.print("희동이의 점수를 입력하세요");
      int hi = sc.nextInt();
       System.out.print("기동이의 점수를 입력하세요");
       int ki = sc.nextInt();
      System.out.print(Math.max(ki,Math.max(gil, hi)));
   }
}
