package core_Java_Logical_Programs;

import java.util.Scanner;

public class Reverse_ofNUmber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to reverse the number");
		int num = sc.nextInt();
		sc.close();
		int rev = 0;
		while (num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		System.out.println("Reverse of the given number " + rev);

	}

}
