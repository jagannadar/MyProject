package week1.day2;
 class Area{
	static CalculateArea cs = new CalculateArea();
}

public class CalculateArea {
		int a, b;
		
	/*	public int area(int a, int b)
		{
		return a*b;
		}
		
		public int area(int a)
		{
			return a*a;
		}
		public static void main(String[] args) {
			CalculateArea a = new CalculateArea();
			int a1=a.area(3,4);
			System.out.println(a1);
			System.out.println(a.area(2));
		} */
//	 public static void CalculateAreaw()
//	 {
//		 System.out.println("Default");
//	 }
	 public CalculateArea()
	 {
		 //this(1,2,3);
		 System.out.println("my Static");
	 }
	 public CalculateArea(int a,int b , int c)
	 {
		 
		 System.out.println(a*b*c);
	 }
	 
	 public CalculateArea(int a, int b)
	 {
		this.a = a;
		this.b = b;
	 }
	 
	 public void display()
	 {
		 static CalculateArea cs = new CalculateArea();
		 System.out.println(a+b);
	 }

	 
	 public static void main(String[] args) {
		 CalculateArea c = new CalculateArea();
//		 c.display();
//		 CalculateArea c2 = new CalculateArea(2);
//		 
		 Area a = new Area();
		 CalculateAreaw();
	
	}
}	

