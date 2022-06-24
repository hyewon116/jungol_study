package statements;

import java.util.Scanner;
public class JO120 {
	//두 개의 정수를 입력받아 큰 수에서 작은 수를 뺀 차를 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = (a < b) ? (b - a) : (a - b);
		System.out.println(c);
	}
}
