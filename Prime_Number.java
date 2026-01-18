package core_Java_Logical_Programs;

import java.util.Scanner;

public class Prime_Number {

	public boolean isPrime(int n) {

		if (n <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println("Enter the number to find Prime Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		Prime_Number p = new Prime_Number();

		if (p.isPrime(num)) {
			System.out.println(num + " is a Prime Number ");
		} else {
			System.out.println(num + " is not a Prime Number");
		}

	}

}
