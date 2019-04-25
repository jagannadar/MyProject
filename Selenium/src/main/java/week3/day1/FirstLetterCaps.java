package week3.day1;

public class FirstLetterCaps {
	
	public static void main(String[] args) {
		String name = "welcome to java";
		String rep = null,rep1 = null,rep2 = null;
		String[] split = name.split(" ");
		
		for(int i =0 ; i < split.length ; i ++)
		{
			if(i==0)
			{
			 rep = split[i].replace('w', 'W');
			 
			
			}
			else if(i==1)
			{
				 rep1 = split[i].replace('t', 'T');
			
			}
			else
			{
				 rep2 = split[i].replace('j', 'J');
				
			}
		}
		System.out.println(rep +" "+ rep1 +" "+ rep2);
		
		
	}

}
