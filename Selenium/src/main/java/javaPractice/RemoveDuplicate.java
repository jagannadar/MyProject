package javaPractice;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s = "JaganRamar";
		char ss ;
		char ss1;
		char ch[] = s.toCharArray();
		
		String s1="";
		
			
		/*for(int i=0;i<s.length();i++)
		{
			boolean found= false;
			for(int j=0;j<s1.length();j++)
			{
			
			
				if(s.charAt(i)==s1.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(found==false)
			{
				s1=s1+s.charAt(i);
			}
		}
		
		System.out.println(s1);*/
		String ch1="";
		
		
		for(int i =0 ; i < s.length() ; i ++) 
		{
			boolean found = false;
			for(int j = 0 ; j < ch1.length() ; j++)
			{
				ss = s.charAt(i);
				ss1 = ch1.charAt(j);
				
				if(ss==ss1)
				{
					found = true ;
					break;
				}
			}
			if(found==false)
			{
				ch1 = ch1 + s.charAt(i);
			}
			
		}
		System.out.println(ch1);
		

	}

}
