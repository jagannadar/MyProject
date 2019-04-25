package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.google.common.collect.Multiset.Entry;

public class HassSet {

	public static void main(String[] args) {
		 String name ="JaganRamar";
		 char ch[] = name.toCharArray();
		 
		 Map<Character , Integer > mapname = new LinkedHashMap<Character , Integer >();
		 
		 
		 for(char c : ch)
		 {
			 
		 if(mapname.containsKey(c))
		 {		
			 mapname.put(c, mapname.get(c)+1);
		 }
		 else
		 {
			 mapname.put(c, 1);
		 }
		 
		

	}
		 System.out.println(mapname);
}
}
