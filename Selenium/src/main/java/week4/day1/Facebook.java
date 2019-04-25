package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		
		
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").clear();
		driver.findElementById("email").sendKeys("tj1g1n@gmail.com");
		driver.findElementById("pass").sendKeys("jagannadar");
		
		driver.findElementByXPath("//input[@value= 'Log In']").click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElementByXPath("//input[@name= 'q']").sendKeys("TestLeaf");
		
		driver.findElementByXPath("(//button[@value= '1'])[1]/i").click();
		Thread.sleep(10000);
		driver.findElementByXPath("(//div[text() ='Places'])[1]").click();
		
		String textt = driver.findElementByXPath("//a[contains(text(),'TestLeaf')]").getText();
		
		if(textt.equals("TestLeaf"))
		{
			System.out.println("Test Leaf is present");
		}
		else
		{
			System.out.println("Not Present");
		}
		
		String textLike = driver.findElementByXPath("//button[contains(text(), 'Like')]").getText();
		if(textLike.equals("Like"))
		
		{
			driver.findElementByXPath("//button[contains(text(), 'Like')]").click();
		}
		if(textLike.equals("Liked"))
		{
			System.out.println("Already Liked");
		}
		
		driver.findElementByXPath("//a[contains(text(),'TestLeaf')]").click();
		
		String titleTest = driver.getTitle();
		if(titleTest.equals("TestLeaf"))
		{
			System.out.println("Title is Displayed");
		}
		
		else
		{
			System.out.println("Title is wrongly Displayed");
		}
		
		
//		String textLikes = driver.findElementByXPath("//div[contains(text(), ' like this')]").getText();
		String textLikes = driver.findElementByXPath("(//div[@class= 'clearfix _ikh'])[1]/div/div").getText();
		//textLikes.s
//		CharSequence subSequence1 = textLikes.subSequence(0, 5);
//		System.out.println(subSequence1);
//		
		System.out.println(textLikes);
		
		String sub = textLikes.substring(0, 5);
		
		System.out.println(sub);
		
		
		
		
	}
}
