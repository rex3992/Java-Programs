package Java_Prgms;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Count_Of_Each_Character_In_String {

	static void characterCount(String Str) {
		TreeMap<Character,Integer> charCountMap= new TreeMap<Character,Integer>();
		
		char[] chrArray = Str.toCharArray();
		
		for(char c : chrArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
				charCountMap.put(c, 1);
		}
		
		for(Map.Entry entry : charCountMap.entrySet())
		{
			if(entry.getKey().equals(' '))
			{
				System.out.println("White Spaces is " + entry.getValue()+" times in "+Str);
			}
			else
				System.out.println(entry.getKey() + " is " + entry.getValue()+" times in "+Str);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String userString = sc.nextLine();
		characterCount(userString);
	}

}
