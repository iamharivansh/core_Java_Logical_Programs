package core_Java_Logical_Programs;

import java.util.Scanner;

public class Swappigwith_ThirdVar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The First Nummber ");
		int num1 = sc.nextInt();
		

		System.out.println("Enter The Second Nummber ");
		int num2 = sc.nextInt();
		
		sc.close();

		System.out.println("Before Swapping \n");

		System.out.println("First Number " + num1);
		System.out.println("Second Number " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(" \nAfter Swapping \n");

		System.out.println("First Number " + num1);
		System.out.println("Second Number " + num2);
		

	}

}
