package statements;

import java.util.Scanner;

public class JO535 {
	//4.5 이하의 평점을 입력받아 그 값에 따라 다음과 같이 출력하는 프로그램을 작성하시오. 
	//4.0 이상 : "scholarship"
	//3.0 이상 : "next semester"
	//2.0 이상 : "seasonal semester"
	//2.0 미만 : "retake"​
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double score = sc.nextDouble();
		
		switch ((int)score) {
		case 4 : System.out.println("scholarship"); break;
		case 3 : System.out.println("next semester"); break;
		case 2 : System.out.println("seasonal semester"); break;
		case 1 : System.out.println("retake"); break;
		}
	}
}
