package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetLocationMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement fitnessImage= driver.findElement(By.xpath("//img[@alt='Google']"));
		Point location= fitnessImage.getLocation();
		System.out.println("x coordinate: " +location.getX());
		System.out.println("x coordinate: " +location.getY());
		driver.quit();
		
		
		

	}

}
