package week1.day2;

public class OddIndex {
	
	
	
	
	public static void main(String[] args) {
		CalculateArea.CalculateAreaw();
		
		String sname = "jaganramar";
		String odd="";
		char d;
	//	char ch[]= sname.toCharArray();
		
		
	//	char name1 = sname.toUpperCase().charAt(0);
	//	System.out.println(name1);
		
		for(int i=0;i<sname.length();i++)
		{
			if(i%2==0)
			{
				 d=sname.toUpperCase().charAt(i);
				odd = odd + d;
			}
			else
			{
					d=sname.charAt(i);
					odd= odd+d;
			}
		}
		System.out.println(odd);
		
	}

	
}
