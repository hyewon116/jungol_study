package operator;

import java.util.Scanner;
public class JO115 {
	public static void main(String[] args) {
		//민수와 기영이의 키와 몸무게를 입력받아 민수가 키도 크고 몸무게도 크면 1 
		//그렇지 않으면 0을 출력하는 프로그램을 작성하시오.
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		boolean e = (a > c && b > d);
		System.out.println(e);
	}
}
