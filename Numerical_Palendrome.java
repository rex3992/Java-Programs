package Java_Prgms;

import java.util.Scanner;

public class Numerical_Palendrome {

	public static void main(String[] args) {
		// Get Input from use
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a number to find if it is Palendrome or Not: ");
		int userInput = sc.nextInt();
		System.out.println("User input is: "+userInput);
		
		
		sc.close();
		
		if(userInput<0) 
		{
			System.out.println("Negative Inputs are not applicable");
			System.exit(1);
		}
		else if(userInput>=0 && userInput<=9)
		{
			System.out.println(userInput+" is palendrome as it is single digit number");
			System.exit(1);	
		}
		else
		{
			int temp = userInput;
			int revInput = 0;
			while(temp>0)
			{
				int remainder = temp % 10;
				
				revInput = (revInput*10) + remainder;
				
				temp = temp/10;
			}
			if(userInput == revInput)
			{
				System.out.println(userInput+" is palendrome");
			}
			else
				System.out.println(userInput+" is not palendrome");
		}
	}

}
