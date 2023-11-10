package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//New Changes
public class ActiTimeLogin
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement element =driver.findElement(By.id("username"));
		element.sendKeys("admin");
		//driver.findElement(By.id("")).sendKeys("");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		WebElement element1 =driver.findElement(By.className("initial"));
		element1.sendKeys("initial");
		Thread.sleep(3000);
		element1.click();
		

	}

}
