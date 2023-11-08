package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeySendKey {

	public static void main(String[] args)  
	{
		
		// TODO Auto-generated method stub
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try
        {
        	wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
        	System.out.println("test passed");
        }
        catch(Exception e)
        {
        	System.out.println("test failed");
        }
        driver.quit();

	}

}
