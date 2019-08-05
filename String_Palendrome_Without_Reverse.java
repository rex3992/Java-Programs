package Java_Prgms;

import java.util.Scanner;

public class String_Palendrome_Without_Reverse {

	public static void main(String[] args) {
		// Get input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String userInput = sc.nextLine();
		sc.close();
		
		char[] chr = userInput.toCharArray();
		
		String revInput="";
		
		//Reverse the input String
		for(int counter=chr.length-1;counter>=0;counter--)
		{
			revInput = revInput+chr[counter];
		}
		
		System.out.println("User input is "+userInput);
		System.out.println("Reverse of User input is "+revInput);
	//Check if String is palendrome or not	
	if(userInput.equals(revInput))
		System.out.println(userInput + " is Palendrome");
	else
		System.out.println(userInput + " is not Palendrome");
	}

}
