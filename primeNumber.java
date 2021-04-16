package week1.day2.classroom;

public class primeNumber {

	public static void main(String[] args) {

		int Input=17;
		boolean flag=false;
		
		for (int i = 2; i <= Input/2; ++i) {
			if(Input%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println(Input+ "is a Prime number");
					
		}else
		{
			System.out.println(Input+ "Is not a prime number");
		}
	}

}
