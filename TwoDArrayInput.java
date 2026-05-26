package core_Java_Logical_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row size of array");
		int rsize = sc.nextInt();

		System.out.println("Enter the column size");
		int csize = sc.nextInt();

		int[][] arr = new int[rsize][csize];

		for (int r = 0; r < rsize; r++) {

			for (int c = 0; c < csize; c++) {

				System.out.println("Enter the (" + r + "," + c + ") elements");
				arr[r][c] = sc.nextInt();
			}
		}

		System.out.println(Arrays.deepToString(arr));

		sc.close();

	}
}
