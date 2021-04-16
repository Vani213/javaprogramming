package week1.day2.classroom;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String input = "changeme";
		String str = " ";
		char[] Ch = input.toCharArray();
		System.out.println(Ch);

		for (int i = 0; i < Ch.length; i++) {
			if (i % 2 != 0) 
			{
				Ch[i] = Character.toUpperCase(Ch[i]);
				System.out.println(Ch[i]);
			}
		}
	}
}