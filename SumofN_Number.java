package core_Java_Logical_Programs;

import java.util.Scanner;

public class SumofN_Number {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find sum of Natural Numbers");
		int num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= num; i++) {

			sum += i;

		}
		
		System.out.println("Sum of " +num+ " Natural Numbers "+sum);

	}

}
