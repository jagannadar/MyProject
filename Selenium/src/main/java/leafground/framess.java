package leafground;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class framess {

	//public static ChromeDriver driver;
	

	/*public framess()
	{
		PageFactory.initElements(driver, this); 
	}
*/
	
//	@FindBy(how=How.XPATH , using="//iframe[@src='default.html']") WebElement iframepath;
	@Test
	public void frame()
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		WebElement iframepath = driver.findElementByXPath("//iframe[@src='default.html']");
		
		driver.switchTo().frame(iframepath);
		driver.findElementById("Click").click();
		driver.switchTo().defaultContent();
		
		WebElement frame1 = driver.findElementByXPath("//iframe[@src='page.html']");
		
		driver.switchTo().frame(frame1);	
		
		driver.switchTo().frame("frame2");
		driver.findElementById("Click1").click();
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		String text = driver.findElementById("content").getText();
		
		System.out.println(text);
		
		List<WebElement> tagNameList = driver.findElementsByTagName("iframe");
		System.out.println(tagNameList.size());
		
		
	}
	/*@FindBy(how=How.ID, using ="Click") WebElement clck;
	clck.click();*/
	
		/*public static void main(String[] args) {
			
			framess frm = new framess();
			frm.frame();
			
		}
*/
	}
