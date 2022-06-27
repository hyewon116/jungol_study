package loop;

import java.util.Scanner;

public class JO540 {
	//정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 
	//3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
	//-1이 입력되면 종료하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int i = sc.nextInt();
			
			if(i % 3 == 0) {
				 System.out.println( i / 3 );
			} else if ( i == -1 ) {
				break;
			}
		}
		sc.close();
	}
}
