package operator;

import java.util.Scanner;

public class JO524 {
	//2개의 정수를 입력 받아서 논리곱과 논리합의 결과를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		boolean c = (a != 0 && b != 0);
		boolean d = (a != 0 || b != 0);
		System.out.print(c + " " + d);
	}
}
