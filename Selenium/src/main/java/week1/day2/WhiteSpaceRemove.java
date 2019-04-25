package week1.day2;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		int count=0;
		String company ="Cap Jag CapC C JC";
		int in = company.lastIndexOf("J",16);
		System.out.println(in);
		String com ="";
		String[] sp = company.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			com=com + sp[i];
		}
		System.out.println(com);
		
		char chr[] = company.toCharArray();
		String sum = "";
		for(int i =0; i < chr.length; i++)
		{
		if(chr[i]!=' ')
		{
			sum = sum + chr[i];
		}
		
		}
		System.out.println(sum);
		
		
	
		char ch [] = com.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[0]==ch[i])
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
