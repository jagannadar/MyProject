package week2.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		WebElement usid = driver.findElementById("userRegistrationForm:userName");
		usid.sendKeys("jaganramar");
		
		driver.findElementByName("userRegistrationForm:password").sendKeys("Jag@127878");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Jag@127878");
		
		WebElement drop = driver.findElementById("userRegistrationForm:securityQ");
		Select sdrop = new Select(drop);
		sdrop.selectByValue("2");
		
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Bolt");
		
		WebElement drop1 = driver.findElementById("userRegistrationForm:prelan");
		Select sdrop1 = new Select(drop1);
		sdrop1.selectByValue("en");
		
		driver.findElementByName("userRegistrationForm:firstName").sendKeys("Jagan");
		driver.findElementByName("userRegistrationForm:middleName").sendKeys("Ramar");
		driver.findElementByName("userRegistrationForm:lastName").sendKeys("Nadar");
		
		//driver.findElementByXPath("(//input[@value ='M'])[1]").click();
		driver.findElementById("userRegistrationForm:gender:0").click();
		driver.findElementByXPath("//input[@value ='U']").click();
		
		WebElement drop2 = driver.findElementById("userRegistrationForm:dobDay");
		Select sdrop2 = new Select(drop2);
		sdrop2.selectByIndex(9);
		
		WebElement drop3 = driver.findElementById("userRegistrationForm:dobMonth");
		Select sdrop3 = new Select(drop3);
		sdrop3.selectByValue("09");
		
		WebElement drop4 = driver.findElementById("userRegistrationForm:dateOfBirth");
		Select sdrop4 = new Select(drop4);
		sdrop4.selectByValue("1994");	
		
		WebElement drop5 = driver.findElementById("userRegistrationForm:occupation");
		Select sdrop5 = new Select(drop5);
		sdrop5.selectByVisibleText("Professional");	
		
		driver.findElementById("userRegistrationForm:uidno").sendKeys("232344556873");
		
		driver.findElementById("userRegistrationForm:idno");
		
		WebElement drop6 = driver.findElementById("userRegistrationForm:countries");
		Select sdrop6 = new Select(drop6);
		sdrop6.selectByVisibleText("India");
		
		driver.findElementById("userRegistrationForm:email").sendKeys("jagannadar44@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("8655601993");
		
		
		WebElement drop7 = driver.findElementById("userRegistrationForm:nationalityId");
		Select sdrop7 = new Select(drop7);
		sdrop7.selectByVisibleText("India");	
		
		driver.findElementById("userRegistrationForm:address").sendKeys("L405");
		driver.findElementById("userRegistrationForm:street").sendKeys("Lancore");
		driver.findElementById("userRegistrationForm:area").sendKeys("Shols");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600119",Keys.TAB);
		Thread.sleep(3000);
		//driver.findElementById("userRegistrationForm:statesName").sendKeys("TN");
		
		WebElement drop8 = driver.findElementById("userRegistrationForm:cityName");
		Select sdrop8 = new Select(drop8);
		sdrop8.selectByIndex(1);
		Thread.sleep(3000);
		
		WebElement drop9 = driver.findElementById("userRegistrationForm:postofficeName");
		Select sdrop9 = new Select(drop9);
		//sdrop9.selectByValue("Sholinganallur S.O");
		sdrop9.selectByIndex(2);
		
		driver.findElementById("userRegistrationForm:landline").sendKeys("8655601993");
		
		driver.findElementByXPath("(//input[@id='userRegistrationForm:resAndOff:0'])[0]").click();
		
	}

}
