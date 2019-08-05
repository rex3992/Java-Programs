package Java_Prgms;

import java.util.Scanner;

public class Floyds_Triangle_User_Defined_Rows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Rows for Floyd's Triangle: ");
		int NumberOfRows = sc.nextInt();
		sc.close();
		System.out.println("Floyd's Triangle of "+NumberOfRows+" rows:");
		int k=1;
		for(int i =1;i<=NumberOfRows;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(k++ + " ");
			System.out.println();
		}
	}

}
