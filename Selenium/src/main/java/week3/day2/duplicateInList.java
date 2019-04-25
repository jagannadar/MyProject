package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class duplicateInList {
	public static void main(String[] args) {
		List<String> lname = new ArrayList<String>();
		lname.add("jagan");
		lname.add("ramar");
		lname.add("vijay");
		lname.add("vijay");
		lname.add("ramar");
		System.out.println("List Before deleting duplicates   " +lname);
		
		String s[] = new String[lname.size()];
		s = lname.toArray(s);
		
		for(int i =1 ; i< lname.size() ; i++)
		{
			for(int j =1 ; j <lname.size() ; j++)
			{
			if(s[i] == s[j])
			{
				lname.remove(j);
			}
			}
		}
		
		
		System.out.println("List After deleting the duplicate " +lname);
		
		Collections.sort(lname);
		
		System.out.println("List after sorting                " +lname);
	}

}
