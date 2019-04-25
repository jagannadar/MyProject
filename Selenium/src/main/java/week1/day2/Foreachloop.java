package week1.day2;

public class Foreachloop {
	
	public static void main(String[] args) {
		
	
	int str[]= {2,3,6,3,5,12,24,66};
	int f = 1;
	for(int i : str)
	{
		if(i%2!=0)
		
			 f = f * i;
		
	}
	System.out.println(f);
	}
}


