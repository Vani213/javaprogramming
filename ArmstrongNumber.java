package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153 ;//cube of each digit
		int sum = 0; 
		int orgNumber = input; int rem;
		
		while (input > 0) 
		{
			rem = input % 10;
			System.out.println(rem);
			
			sum = sum + (rem*rem*rem);
			System.out.println(sum);
			
			input = input /10;
			System.out.println(input);
		}
		if (sum == orgNumber)
		{
			
			System.out.println("Given number is an Armstrong Number");
		}
			
			else
			
		{
				System.out.println("not an Armstrong number");
			}
			
		}
		}
		

	


