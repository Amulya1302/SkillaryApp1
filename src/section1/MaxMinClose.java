package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaxMinClose
{
	public static void main(String[] args) throws Exception
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(option);
		
		//driver.get("https://www.actitime.com/");
		driver.get("https://www.actitime.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().minimize();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		/*approach 1 Setting the size of the web page with dimension width and height we can go through 2 ways
		 * 
		driver.manage().window().setSize(new Dimension(800,400 ));
		Thread.sleep(4000);
		*/
		/* approach 2*/
		
		Dimension d= new Dimension(800, 650);
		driver.manage().window().setSize(d);
		Thread.sleep(4000);
		
		/* approach 2 setting the postion of the page
		 
		driver.manage().window().setPosition(new Point(400,200));
		Thread.sleep(4000);
		*/
		
		/* approach2*/
		
		Point p=new Point(600, 600);
		driver.manage().window().setPosition(p);
		Thread.sleep(4000);
		driver.close();
				
		
	
		
	}
	

}
