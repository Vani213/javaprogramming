
public class Calculator {
	
	public int add (int num1, int num2)
	{
		int sum = num1+num2;
		return sum;
	}
  
	public static void main(String[] args) {
		
	 Calculator calc= new Calculator();
		System.out.println(calc.add(10, 20));
		
		

	}

}
