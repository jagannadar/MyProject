package javaPractice;

public class SwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Jagan";
		String s2 = "Ramar";
		
		
	//	String s3 ;
		
		s1 = s1 + s2;
	//	System.out.println(s1);
		
		s2 = s1.substring(0 , s1.length()-s2.length());
		System.out.println("second" +s2);
		
		s1 = s1.substring(s1.length()-s2.length(),s1.length());		
		System.out.println(s1);
			
		
				
		

	}

}
