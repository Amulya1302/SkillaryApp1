package section1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFireFox 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\selenium\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.flipkart.com/");

	}

}
