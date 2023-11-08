package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginActitimeCssSelector 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub

		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[id='loginButton']")).click();
		
	}

}
