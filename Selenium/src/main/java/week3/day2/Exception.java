package week3.day2;

public class Exception {

	public static void main(String[] args) {
		
		int i =10;
		try {
		if(i / 0 ==0)
		{
			System.out.println("Divisible");
		}
		else
		
		{
			System.out.println("Not Divisible");
		}
		}
		catch(java.lang.ArithmeticException  e)
		{
			System.out.println(e);
			
		}
		
		finally
		{
			System.out.println("Still Executing");
		}
	}

}
