package basic;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;








@CucumberOptions(features="D:\\LW 4.0 Selenium Automation\\Cucumber Project\\Cucumber\\src\\Feature\\loginTest.feature",
					
					glue = {"stepdefinition"}
					)

@Test
public class FirstCucumberClass extends AbstractTestNGCucumberTests
{


	public static void testRun()
	{
		
/*		String url = "https://learn.letskodeit.com/p/practice";
		
			
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//*[@id='navbar']/div/div/div/ul/li[2]/a"));
		login.click();
		
		WebElement id = driver.findElement(By.xpath("//*[@id='user_email']"));
		id.clear();
		id.sendKeys("nirushsrk@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='user_password']"));
		password.clear();
		password.sendKeys("nirushsrk");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
		loginButton.click();*/
		
		
	}
	
	
}
