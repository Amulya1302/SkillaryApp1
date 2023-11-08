package section1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTitle
{
	public static void main(String[] args) 
	{
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwijyPfwor7_AhUUdn0KHbiXCm0YABAAGgJzZg&ohost=www.google.com&cid=CAASJeRo8Z96WiUkXj48SRuEqW6-hyBzjJhN0QbhXu5WeiLQijwE9Tg&sig=AOD64_0P4Bgvm30ALnYxsZ4iAzZ1Q6b1aw&q&adurl&ved=2ahUKEwjYlfHwor7_AhV9wjgGHaT7AQsQ0Qx6BAgIEAE");
		String Title= driver.getTitle();
		String scode= driver.getPageSource();
		String url=driver.getCurrentUrl();
		System.out.println(Title);
		System.out.println(scode);
		System.out.println(url);
		
	  
	}

}
