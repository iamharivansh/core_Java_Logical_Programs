package core_Java_Logical_Programs;

import java.util.Scanner;

public class SumofN_Number {

	public static void main(String[] args) {

		System.out.println("Enter the Number to find sum");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;

		sc.close();

		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("Sum  of " + n + "number is " + sum);

	}

}
