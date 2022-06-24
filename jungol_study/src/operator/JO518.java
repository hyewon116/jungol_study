package operator;

import java.util.Scanner;
public class JO518 {
	//세 개의 정수를 입력 받아서 합계와 평균을 출력하시오. (단 평균은 소수 이하를 버리고 정수부분만 출력한다.)
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.printf("sum : %d\n", (a+b+c));
		System.out.printf("avg : %d", (a+b+c)/3);
	}
}
