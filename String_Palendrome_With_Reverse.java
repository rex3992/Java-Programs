package Java_Prgms;

import java.util.Scanner;

public class String_Palendrome_With_Reverse {

	public static void main(String[] args) {
		// Get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String userInput = sc.nextLine();
		sc.close();
		
		//Reverse string using String Builder
		StringBuilder strOrg = new StringBuilder(userInput);
		StringBuilder strRev = new StringBuilder(strOrg).reverse();
		
		//Check if String is Palendrome
		if(String.valueOf(strOrg).equals(String.valueOf(strRev)))
			System.out.println(userInput +" is Palendrome");
		else
			System.out.println(userInput+" is not Palendrome");
		
		//Different way to check
		if(strOrg.toString().equals(strRev.toString()))
			System.out.println(userInput +" is Palendrome");
		else
			System.out.println(userInput+" is not Palendrome");
	}

}
