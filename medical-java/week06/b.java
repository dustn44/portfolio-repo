// 2025-04-08 문제 2번
// 길동, 희동, 기동의 점수를 입력 받아 가장 높은 점수를 획득한 학생의 이름을 출력하는 프로그램 구현(IF문 사용)
package week_6;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("길동이의 점수를 입력하세요");
		int gil = sc.nextInt();
		System.out.print("희동이의 점수를 입력하세요");
		int hi = sc.nextInt();
		System.out.print("기동이의 점수를 입력하세요");
		int ki = sc.nextInt();
    if (gil>hi&&gil>ki)
      System.out.print("가장 높은 점수를 획득한 학생은 길동이입니다.");
    else if (hi>gil&&hi>ki)
		  System.out.print("가장 높은 점수를 획득한 학생은 희동이입니다.");
		else
      System.out.print("가장 높은 점수를 획득한 학생은 기동이입니다.");
	}
}
