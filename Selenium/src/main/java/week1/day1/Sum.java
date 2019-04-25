package week1.day1;

import week1.day2.CalculateArea;

public class Sum {

	int sum =0;
	public void calSum()
	{
		for(int i=0;i<=10;i++)
		{
			sum = sum + i;
		
		}
		System.out.println(sum);
	}
	
	public int sum()
	{
		int a = 5;
		int b =19;
		int c = a * b;
		return c;
	}
	
	public static void main(String[] args) {
	//	CalculateArea.CalculateAreaw();
		
		Sum s = new Sum();
		s.calSum();
		int sum2 = s.sum();
		System.out.println(sum2);
	}

}
