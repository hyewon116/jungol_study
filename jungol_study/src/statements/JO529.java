package statements;

import java.util.Scanner;
public class JO529 {
	public static void main(String[] args) {
		// “몸무게+100-키”를 비만수치 공식이라고 하자.
		//키와 몸무게를 자연수로 입력받아 첫 번째 줄에 비만수치를 출력하고, 
		//비만수치가 0보다 크면 다음줄에 비만("Obesity")이라는 메시지를 출력하는 프로그램을 작성하시오. 
		//예) 5		Obesity
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = b + 100 - a;
		System.out.println(c);
		if(c > 0) {
			System.out.println("Obesity");
		}
	}
}
