package operator;

import java.util.Scanner;

public class JO522 {
	//두 개의 정수를 입력받아서, 
	//첫 번째 줄에는 두 정수의 값이 같으면 1 아니면 0을 출력하고, 
	//두 번째 줄에는 같지 않으면 1 같으면 0을 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println((a==b) ? 1 : 0);
		System.out.println((a!=b) ? 1 : 0);
	}
}
