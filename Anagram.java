package week1.day2.classroom;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String Text1="karthi";
		String Text2="vani";
		char[] ch1=Text1.toCharArray();
		char[] ch2=Text2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(ch1.length==ch2.length)
		{
			if(Arrays.equals(ch1, ch2))
					{
				System.out.println("The given value are anagram");
				
					}
			else
				
			System.out.println("the value is not Anagram");
		}
		else
		
		System.out.println("It is not a valid string");
		
	
	}

}
