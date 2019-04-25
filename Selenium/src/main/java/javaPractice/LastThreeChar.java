package javaPractice;

public class LastThreeChar {
	
	static int n = 5;
	static char name;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sname = "Jagan";
		char[] ch = new char[3];
		
		StringBuilder sb = new StringBuilder(sname);
		StringBuilder reverse = sb.reverse();
		
		for(int i =0 ; i < 3 ; i++)
		{
			ch[i]= reverse.charAt(i);
			//System.out.print(ch[i]);
		}
		System.out.println(ch);
		/*String s = new String(ch);
		System.out.println(s);
		
		StringBuilder sbb = new StringBuilder(s);
		StringBuilder reversee = sbb.reverse();
		System.out.print(reversee);*/
		
		StringBuilder nn = new StringBuilder();
		for (char c : ch)
		{
			nn.append(c);
		}
		nn.reverse();
		System.out.println(nn);
		
		
		
		
	}

}
