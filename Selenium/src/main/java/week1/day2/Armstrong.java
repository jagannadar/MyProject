package week1.day2;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		int cub = 0;
		int sum =0;
		int result = n;
		
//		while(n!=0)
//		{
//		int r = n % 10;
//		cub = r * r * r;
//		 sum = sum + cub;
//		n = n /10;
//		}
		String s = Integer.toString(n);
		for(int i =0 ; i < s.length();i++)
		{
			
				
				int r = n % 10;
				cub = r * r * r;
				 sum = sum + cub;
				n = n /10;
				
		}
			
		
		if (sum == result)
		
			System.out.println("Armstrong");
		
		else
		
			System.out.println("Not Armstrong");
		
			

	}

}
