package section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class back_fwd_refresh_options {
	public static void main(String[] args) throws Exception 
	{
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(option);
		
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
         driver.navigate().forward();
         Thread.sleep(3000);
         driver.navigate().refresh();
         driver.close();

	}

}
