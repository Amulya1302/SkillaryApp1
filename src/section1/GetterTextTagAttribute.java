package section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetterTextTagAttribute {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://snapdeal.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement serachTF=driver.findElement(By.className("searchTextSpan"));
		System.out.println(serachTF.getText());
		System.out.println(serachTF.getTagName());
		System.out.println(serachTF.getAttribute("class"));
		driver.quit();
		
		

	}

}
