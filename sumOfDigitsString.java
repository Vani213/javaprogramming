package week1.day2.classroom;

public class sumOfDigitsString {

	public static void main(String[] args) {
		
		String text = "Tes12Le79af65";
		int n=0;
		int sum = 0;
		
		text=text.replaceAll("\\D+"," ");//to remove Non-Digits
		System.out.println(text);
		char[] ch=text.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(text.charAt(i)))
				{
				n=Character.getNumericValue(ch[i]);
				System.out.println(n);
				sum=sum+n;
				}
			
		}
	
	if(sum>1)
		
		System.out.println("sum of digit" +sum);
}
}
