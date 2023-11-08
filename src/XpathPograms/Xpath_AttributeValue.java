package XpathPograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath_AttributeValue
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(4000);
		
	}

}
