package week3.day2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListOfEmpcontainingJ {

	public static void main(String[] args) {
		
		Map<String , Integer> name = new LinkedHashMap<String , Integer>();
		name.put("Jagan", 101);
		name.put("Ramar", 102);
		name.put("Jaggs", 103);
		name.put("Jaggu", 104);
		System.out.println(name);
		List<String> Lname = new ArrayList<String>();
		for(Entry<String , Integer> eachemp : name.entrySet())
		{
			String s= eachemp.getKey();
		//	Integer value = eachemp.getValue();
			if(!s.contains("J"))
			{
				Lname.add(s);
				
			}
					
		}
		System.out.println(Lname);

	}
}


