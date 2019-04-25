package week3.day1;

public class FirstLetterCaps2 {
	
	public static void main(String[] args) {
		String name = "welcome to java";
		
		char[] nam = name.toCharArray();
		
		nam[0] = Character.toUpperCase(nam[0]);
		
		for(int i =1; i < nam.length; i++)
		{
			if(nam[i]==' ')
			{
				nam[i+1] = Character.toUpperCase(nam[i+1]);
			}
			
		}
		System.out.println(nam);
		
		
		
		
	}

}
