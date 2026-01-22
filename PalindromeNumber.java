package core_Java_Logical_Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome NUmber");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		sc.close();

		while (num > 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num /= 10;
		}
		System.out.println("Reverse of Number is ");

		System.out.println((temp == rev) ? "Numer is Palindrome" : "Number is not Palindrome");

	}

}
