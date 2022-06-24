package operator;

import java.util.Scanner;

public class JO525 {
	//3개의 정수를 입력 받아 첫 번째 수가 가장 크면 1 아니면 0을 출력하고 
	//세 개의 수가 모두 같으면 1 아니면 0을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println((a>b && a>c)+" "+((a==b)&&(a==c)));
	}
}
