package core_Java_Logical_Programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to check Palindrome");
		String str = sc.nextLine();
		sc.close();
		String temp = str;
		String rev = "";

		for (int i = 0; i < str.length(); i++) {

			rev = str.charAt(i) + rev;

		}
		System.out.println("Reverse String is " + rev);

		if (temp.equalsIgnoreCase(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}

	}

}
