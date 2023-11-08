package section1;
import org.openqa.selenium.chrome.ChromeDriver;
/*STEP6 : IMPORT CHROME Drive*/
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchChromeBrowser
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		/* step2 Create object ChromeDriver;*/
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		/*step4: provide the key and value */
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		/*step5 create an object for ChromeDriver*/
		ChromeDriver driver=new ChromeDriver(option);
		/*step7: use get method to access web app */
		driver.get("https://www.flipkart.com/");
		

	}

}
