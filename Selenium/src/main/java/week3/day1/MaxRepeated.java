package week3.day1;

public class MaxRepeated {

	public static void main(String[] args) {
		
		String name ="JaganRamar";
		int temp=0;
		int count=0;
		int now = 0;
		
		
		char[] cname1 = name.toCharArray();
		
		
		for(int i =0 ; i<name.length(); i++)
		{
			char ch = name.charAt(i);
			for(int j =i +1 ; j < name.length(); j++)
			{
				char ch1 = name.charAt(j);
				
				if(ch == ch1)
				{
					
					count=count +1;
				}
				
				if(count > temp)
				{
					temp =count;
					now = i;
				}
			
			}
			
		}
		System.out.println(cname1[now]);
		
	}
}
