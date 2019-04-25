package week1.day1;

public class PrimeNo {

	public static void main(String[] args) {
		
		int temp=0;	
		int num =11;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp >0)
		
		{
			System.out.println("not a prime"+num);
		}
		else
		{	
			System.out.println("Prime"+num);
		}
		}
}
		
		
	


