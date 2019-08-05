package Java_Prgms;

import java.util.Scanner;

public class Add_Numbers_From_String {

	public static void main(String[] args) {
		// Get input from User
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphanumeric String: ");
		String userInput = sc.nextLine();
		
		sc.close();
		
		boolean flagRegex = userInput.matches("[A-Za-z0-9]*");

		if(flagRegex == true)
		{
			int sum = 0;
			for(int i=0; i<userInput.length();i++)
			{
				char c = userInput.charAt(i);
				if(Character.isDigit(c))
					sum = sum+Character.getNumericValue(c);
			}
			System.out.println("Sum of Numbers in " + userInput + " = "+sum);
		}
		else
			System.out.println("Input is not Alphanumeric");
	}

}
