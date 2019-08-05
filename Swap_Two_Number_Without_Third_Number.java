package Java_Prgms;

import java.util.Scanner;

public class Swap_Two_Number_Without_Third_Number {

	public static void main(String[] args) {
		// Get in put from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int Number1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int Number2 = sc.nextInt();
		sc.close();
		
		System.out.println("User Input of two number is Number1 = "+Number1+" and Number2 ="+Number2);
		
		//Swap
		Number1= Number1+Number2;
		Number2=Number1-Number2;
		Number1=Number1-Number2;
		
		System.out.println("After Swapping Number1 = "+Number1 +" and Number2 = "+Number2);
	}

}
