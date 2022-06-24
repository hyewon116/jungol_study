package operator;

import java.util.Scanner;

public class JO112 {
	//두 정수를 입력받아서 나눈 몫과 나머지를 다음과 같은 형식으로 출력하는 프로그램을 작성하시오.
	//예 ) 35 / 10 = 3...5
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a/b;
		d = a%b;
		System.out.printf("%d / %d = %d...%d", a, b, c, d);
	}
}
