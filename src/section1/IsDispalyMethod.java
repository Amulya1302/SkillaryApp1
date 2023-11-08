package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsDispalyMethod {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement phoneImage= driver.findElement(By.xpath("//div[@class='xamitd3 xm2v1qs x322q5f xx54hvc x1vk3w4 xuyhj88 xod5an3 x1gja9t xcd7kps xkxfa8k']"));
		if(phoneImage.isDisplayed())
			System.out.println("home is displayed");
		else
			System.out.println("home page not found");
		
		driver.quit();
	         


	}

}
