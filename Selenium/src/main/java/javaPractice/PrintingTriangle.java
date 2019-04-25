package javaPractice;

import org.testng.annotations.Test;

public class PrintingTriangle {
	@Test(priority=1)
	public  void printingStar() {
		int i, j;
		int n = 4;
		
		for(i=0; i<n; i++){
			
			for(j=0; j<=i; j++){
				
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	@Test
	public void printTriangle()
	{
		int n =5;
		for(int i =0 ; i < n ; i ++)
		{
			for(int j =0 ; j <= i ; j ++)
			{
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	@Test(priority=2)
	public  void printNumber() {
		int num;
		int n=5;
		for (int i = 0; i < n; i++) {
			num =1;
			for (int j = 0; j <=i; j++) {
				System.out.print(num+ " ");
				num++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
	}
}

