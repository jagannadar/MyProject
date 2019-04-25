package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		String sname = "Goodday";
		String newchar = "";
		int i;
		char ch[] = sname.toCharArray();
		Set<Character> setname= new LinkedHashSet<Character>(); 
		for( i=0 ; i < sname.length() ; i++)
		{
			setname.add(ch[i]);
	
		}
	
		System.out.println(setname);
		List<Character> Lname = new ArrayList<Character>();
		Lname.addAll(setname);	
		
		for(int j =0 ; j < Lname.size(); j ++)
		{
		newchar = newchar + Lname.get(j);
		}
		
		System.out.println("After removing Duplicate Char --> " + newchar);
	}
}