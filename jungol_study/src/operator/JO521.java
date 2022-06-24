package operator;

import java.util.Scanner;

public class JO521 {
	//두 개의 정수를 입력받아서 첫 번째 수는 후치 증가 연산자를 사용하고 
	//두 번째 수는 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 각각의 값을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = a++ * --b;
		System.out.printf("%d %d %d", a, b, c);
	}
}
