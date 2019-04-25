package week1.day1;

public class Vehicle {
	String modelOfVehicle = "Honda";
	char firstChar = 'H';
	boolean ispun = true;
	
	public void applyBreak()
	{
		System.out.println("Break Applied");
	}

	public int getNoOfWheels()
	{
	//	System.out.println("No of wheels "+a);
		return 4;
	}
	
	public boolean isPunctured()
	{
		return ispun;
	}
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.applyBreak();
		int n =v.getNoOfWheels();
		System.out.println(n);
		boolean b =v.isPunctured();
		System.out.println(b);
	}
}
