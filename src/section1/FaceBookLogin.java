package section1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBookLogin
{
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("9505330168");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("vlkp9999");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[id='loginbutton']")).click();
		
		

}
}
