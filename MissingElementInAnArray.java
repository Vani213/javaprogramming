package week1.day2.classroom;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		System.out.print("Elements in ascending order");
		for (int i = 0; i < arr.length; i++) 
		{
			int j=i+1;
			
		if(j!=arr[i])
		{
			System.out.println(j);
			break;
		}
			
		}
	}

}
