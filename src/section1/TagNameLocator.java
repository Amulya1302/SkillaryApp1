package section1;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TagNameLocator {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> links= driver.findElements(By.tagName("a"));
		for(WebElement e : links)
		{
			System.out.println(e.getText());
			
		}
		driver.quit();
		

	}

}
