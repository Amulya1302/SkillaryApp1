package synchronize;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementToBeClickable {
   
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		ChromeOptions option =  new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}

}
