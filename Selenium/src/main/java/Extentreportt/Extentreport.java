package Extentreportt;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {
	
	ExtentReports ext;
	String testcasename , testcasedes;
	String author, category;
	
	
	
	
	public void startreport()
	{
		ExtentHtmlReporter html = new ExtentHtmlReporter("./reporter/result.html");	
		ext= new ExtentReports();
		ext.attachReporter(html);
	}
	
	public void report()
	{
		ExtentTest createTest = ext.createTest(testcasename , testcasedes);
		
		createTest.assignAuthor(author);
		
		createTest.assignCategory(category);
	}
	
	public void endreport()
	{
		ext.flush();
	}
	
	
	public static void main(String[] args) {
		
		
	}

}
