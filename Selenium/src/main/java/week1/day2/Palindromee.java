package week1.day2;

public class Palindromee {

	public static void main(String[] args) {
		String name = "madam";
		String name1 = "";
	
		char[] ch = name.toCharArray();
		for(int i =ch.length-1;i>=0;i--)
		{
			name1=name1+ch[i];
		}
	
		System.out.println(name1);
	
	if(name.equals(name1))
	{
		System.out.println("It is Palindrome");
	}
	else
	{
		System.out.println("It is not ");
	}

}
}
