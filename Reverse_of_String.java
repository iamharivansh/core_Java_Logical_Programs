package core_Java_Logical_Programs;

import java.util.Scanner;

public class Reverse_of_String {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		String str = sc.nextLine();
		sc.close();

		String rev = " ";
		for (int i = 0; i < str.length(); i++) {

			rev = str.charAt(i) + rev;

		}

		System.out.println("String after Reverse : " +rev);

	}

}
