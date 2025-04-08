// 2025-04-08 문제 1번
// 영어, 국어, 수학 점수를 입력 받아 총점과 평균을 출력하는 프로그램을 구현
package week_6;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("영어 점수를 입력하세요");
		int e = sc.nextInt();
		System.out.print("국어 점수를 입력하세요");
		int k = sc.nextInt();
		System.out.print("수학 점수를 입력하세요");
		int m = sc.nextInt();
		int sum = e+k+m;
		double avr = (e+k+m)/3;
		System.out.print("총점은"+sum+"평균은"+avr+"입니다.");
	}
}
