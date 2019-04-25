package week3.day1;

public class CallMain extends Samsung implements RBI,CIBIL {

	int num;
	public void noOfTransaction()
	{
		System.out.println("5");
	}
	
	public void getdata(int n)
	{
		num = n;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		Mobile mmobile = new Mobile();
		
		//Calling main function through subclass object
		mmobile.feature();
		mmobile.speed();
		
		//calling Samsung function through samsung object
		Samsung objSamsung = new Samsung();
		objSamsung.version();
		
		
		Android aandroid = new Android();
		aandroid.version();
		aandroid.feature();
		
		AppleXR xr = new AppleXR();
		xr.version();
		xr.speed();
			
		
		CallMain mm = new CallMain();
		mm.getdata(8);
		mm.noOfTransaction();
		
		
		
		
	}

}
