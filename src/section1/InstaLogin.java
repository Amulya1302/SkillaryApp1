package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstaLogin {

	public static void main(String[] args) throws Exception 
	{
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(option);
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("__sree__1302");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("FakeOne16");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class=\"_acan _acap _acas _aj1-\"]")).click();
		

	}

}
