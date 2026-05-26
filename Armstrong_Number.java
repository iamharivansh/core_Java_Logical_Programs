package core_Java_Logical_Programs;

public class Armstrong_Number {

	public static int isArmstrong(int num) {

		int n = Math.abs(num);
		int count = 0;

		while (n > 0) {
			int rem = num % 10;
			if (rem >= 0) {
				count++;

			}
		
			num /= 10;
		}
	
		return count;	

	}

	public static void main(String[] args) {
		
		System.out.println(isArmstrong(1236));

	}

}
