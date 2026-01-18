package core_Java_Logical_Programs;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {

		int fact = 1;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to find Factorial ");
		int num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= num; i++) {
			
			fact*=i;

		}
		
		System.out.println("Factorial of "+num);
		System.out.println(fact);
	}
}
