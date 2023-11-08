package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FilpCartLoginFull 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(option);
		
		//driver.get("https://www.actitime.com/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("iphone 11");
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("button[class=\"L0Z3Pu\"]")).click();

        

	}

}
