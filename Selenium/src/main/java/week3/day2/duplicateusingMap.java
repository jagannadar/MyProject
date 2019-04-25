package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class duplicateusingMap {

	public static void main(String[] args) {
		
		String s = "JaganRamarJags";
		
		char ch[] = s.toCharArray();	
		Map<Character , Integer> mname = new LinkedHashMap<Character , Integer>();
		
		for(char c: ch)
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
		
		System.out.println(mname.keySet());
		System.out.println(mname.values());
		
		Set<Character> sname = mname.keySet();
		for(char cc : sname)
		{
			
			if(mname.get(cc) > 1)
			{
				System.out.println("Duplicate Character  :" +cc);
			}
		}
		
		
		
	}

}
