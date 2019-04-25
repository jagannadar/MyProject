package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {

		String name = "jaganramar";
		Map<Character , Integer> mname = new LinkedHashMap<Character , Integer>();

		char cname[] = name.toCharArray();

		for(char c : cname)
		{
			if(mname.containsKey(c))
			{
				mname.put(c, mname.get(c)+1);
			}
			else
			{
				mname.put(c, 1);
			}
		}

		System.out.println(mname);


		String Sname = "JagJgsJ";

		//	char ch = Sname.charAt(0);
		char ch1[] = Sname.toCharArray();
		
		for(int i =0 ; i < Sname.length() ; i ++)
		{
			
			int count=0;
			for(int j = i +1 ; j < Sname.length(); j++)
			{

				if(ch1[i]==ch1[j])
				{
					count++;
					System.out.println("The Repeated Char is " + ch1[i] + count);
					
				}

			}
		}

			
		char ch2[] = Sname.toCharArray();
		for(int i =0 ; i < Sname.length() ; i ++)
		{
			char c1 = Sname.charAt(i);
			
			for(int j = i+1; j < Sname.length() ; j ++)
			{
				char c2 = Sname.charAt(j);
				if(c1==c2)
				{
					int count = 0;
					count++;
					System.out.println(c1 + " " +count );
				}
			}
			
		}

	}

}
