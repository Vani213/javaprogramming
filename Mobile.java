package week1.day1;

public class Mobile {
	

		String mobileModel= "Samsung";
		int mobileWeight=14;
		boolean isFullCharge=true;
		double mobileCost = 2000.45;

	
	
	public static void main(String[] args) {
		
		Mobile LDT = new Mobile();
			
		
		System.out.println(LDT.mobileWeight);
		System.out.println(LDT.mobileCost);
		System.out.println(LDT.mobileModel);
		System.out.println(LDT.isFullCharge);
	}
}
