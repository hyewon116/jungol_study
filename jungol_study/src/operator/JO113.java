package operator;

import java.util.Scanner;

public class JO113 {
	//직사각형의 가로와 세로의 길이를 정수형 값으로 입력받은 후 
	//가로의 길이는 5 증가시키고 세로의 길이는 2배하여 저장한 후 
	//가로의 길이 세로의 길이 넓이를 차례로 출력하는 프로그램을 작성하시오.
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		a += 5;
		b *= 2;
		c = a * b;
		System.out.printf("width = %d\nlength = %d\narea = %d", a, b, c);
	}
}
