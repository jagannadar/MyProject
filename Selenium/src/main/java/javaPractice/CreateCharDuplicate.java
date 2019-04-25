package javaPractice;

public class CreateCharDuplicate {
	static String str= "";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sname = "Jagan";
		String s ;
		s = sname + sname ;
		
		System.out.println(s);
		char ch[] = sname.toCharArray();
		
		for(char c : ch)
		{
			if(c=='a')
			{
				str = str + (String.valueOf(c) + String.valueOf(c));
			}
			if(c=='n')
			{
				str = str + (String.valueOf(c) + String.valueOf(c));
			}
			else
			{
				str = str + String.valueOf(c);
			}
		}
			System.out.print(str);
		}
		
		
	}


