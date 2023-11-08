package section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OrangeHRMlogin 
{

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(option);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin123");
        Thread.sleep(3000);
        
        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();

        
       
	}

}
