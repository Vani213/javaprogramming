package week1.day2.classroom;

public class CharOccurance {

	public static void main(String[] args) {

		String str = "welcome to chennai";
		int count=0;
		char[] Ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(Ch[i]=='e')
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			System.out.println("The Char Occurence of e is " +count);
		}
	}

}
