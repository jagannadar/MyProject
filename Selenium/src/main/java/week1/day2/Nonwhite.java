package week1.day2;

public class Nonwhite {
	public static void main(String[] args) {
		String sname = "Jagan Ramar";
		String rreplace = sname.replace( " ", "");
		
		System.out.println("Without white space" +rreplace);
		
		int count = rreplace.length();
		System.out.println(count);
		
	}

}
