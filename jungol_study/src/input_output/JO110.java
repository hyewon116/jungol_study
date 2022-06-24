package input_output;

import java.util.Scanner;
public class JO110 {
	public static void main(String[] args) {
		double yd = 91.44; 
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double a = sc.nextDouble();
		System.out.printf("%.1fyard = %.1fcm", a, a*yd);
	}
}
