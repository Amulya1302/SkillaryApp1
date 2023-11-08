package synchronize;
/*
 * scenario
 * open the chrome browser
 * enter the demo.actitime.com
 * login to application
 * verify home page(enter time track) is displayed or not
 * close the chrome browser*/

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class VerifyActitimeLogin
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("[id='username']")).sendKeys("admin");
		driver.findElement(By.className("[class='textField pwdfield']")).sendKeys("manager");
		

		
		

	}

}
