package synchronize;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TitleContains {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://orangehrm.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		try
		{
			wait.until(ExpectedConditions.titleContains("OrangeHRM"));
			System.out.println("Test passed");
		}
		catch(Exception e)
		{
			System.out.println("Test failed");
		}
		driver.close();
		
		

	}

}
