package loop;

import java.util.Scanner;

public class JO538 {
	//한 개의 정수를 입력받아 양수(positive integer)인지 음수(negative number)인지 
	//출력하는 작업을 반복하다가 0이 입력되면 종료하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("number? ");
			int a = sc.nextInt();
			if (a > 0) {
				System.out.println("positive integer");
			} else if (a < 0) {
				System.out.println("negative number");
			} else if (a == 0) {
				break; 
			}
		}
	}
}
