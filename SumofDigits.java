package week1.day2.classroom;

public class SumofDigits {

	public static void main(String[] args) 
	{
		
		int input=153;
		int sum=0; int n;
		
		while (input>0) {
			
			n = input%10;
			System.out.println(n);
			sum = sum+n;
			input = input/10;
			System.out.println(input);
			System.out.println("sum of digits:" +sum);
			
		}

	}

}
