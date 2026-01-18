package core_Java_Logical_Programs;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to find Fibonacci Series");
		int num=sc.nextInt();
		sc.close();

		int num1 = 0, num2 = 1;
		System.out.println(num+ " numbers Fibonacci Seried");
		System.out.print(num1+ " " +num2 +" ");

		for (int i = 3; i <= num; i++) {
			
			int num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			System.out.print(num3+" ");

		}

	}

}
