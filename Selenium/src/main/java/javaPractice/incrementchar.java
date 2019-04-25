package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class incrementchar {

	public static void main(String[] args) {

		String s = "JaganRamar";
		
		String ss ="";

		/*List<Character> lname = new ArrayList<Character>();
		char ch[] = s.toCharArray();
		for(int i = 0 ; i < s.length() ; i ++)
		{
			if(ch[i]=='a')
			{
				ss = ss + String.valueOf(ch[i]) + String.valueOf(ch[i]);
			}
			else
			{
				ss = ss + s.charAt(i);
			}
		}
		System.out.println(ss);*/
		int space=4;
		for(int i=1;i<=5-1;i++)
		{
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		 space=1;
		
		 for(int i=1;i<=5;i++)
			{
				for(int j=1;j<space;j++)
				{
					System.out.print(" ");
				}
				space++;
				for(int k=0;k<2*(5-i)-1;k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			



	}

}
