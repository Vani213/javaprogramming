package week1.day1.classroom;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8, firstNum = 0, secNum = 1, sum ;
		
		System.out.println(firstNum);
		for (firstNum = 0; firstNum <= range; firstNum++) 
		{
			sum=firstNum + secNum;
			firstNum=secNum;
			sum=firstNum;
			System.out.println(sum);
		} 
			
			

	}

}
