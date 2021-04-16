package week1.day2.classroom;


public class RemoveDuplicates {
	
		public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0; 
		String temp=null;
		String[] Ch=text.split(" ");
		
		for(int i=0;i<Ch.length-1;i++)
			{
					
			for(int j=i;j<Ch.length-1;j++)
			{
				if(Ch[i] .equals(Ch[j]))
				{
					temp=Ch[i];
					count=count+1;
				
		}
			}
			}			
				if(count>0)
				{
					System.out.println(text.replace(temp, ""));
				}
		}
			
		}
		

				
	