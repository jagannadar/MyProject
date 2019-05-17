package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfEmp {

	public static void main(String[] args) {

	
	
		List<String> Lname = new ArrayList<String>();
		Lname.add("Jagan");
		Lname.add("Ramar");	
		Lname.add("Jaggu");
		
		
		Object[] array =  Lname.toArray();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		Arrays.sort(array);
		
		System.out.println(array+".............");
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Original List before deleting 'a'    "+Lname);
		List<String> Lname1 = new ArrayList<String>();
		for(int i = 0 ; i < Lname.size() ; i++)
		{
			String s = Lname.get(i);
			String s1 = s.replace("a", "");
			Lname1.add(s1);		
		}	
		
		System.out.println("After removing all 'a' from the list " + Lname1);
		
		Collections.sort(Lname1);
		
		System.out.println("After Sorting the List               "+Lname1);
	}
} 


