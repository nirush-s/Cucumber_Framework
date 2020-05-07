package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestingSteps {
	static WebDriver driver;
	
	@Given("^: User is on HomePage$")
	public void user_is_on_Home_Page() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://learn.letskodeit.com/p/practice";
		driver.get(baseURL);
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
	}

	//@When("^: User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	@When("^: User enters userName and Password$")
	public void user_enters_Username_and_Password()  throws Throwable
	{
														//*[@id="navbar"]/div/div/div/ul/li[2]/a
	//	WebElement login = driver.findElement(By.xpath("//*[@id='navbar']/div/div/div/ul/li[2]/a"));
		WebElement login = driver.findElement(By.id("bmwradio"));
		login.click();
		
		WebElement id = driver.findElement(By.xpath("//*[@id='user_email']"));
		id.clear();
		id.sendKeys("a");
		
		WebElement password = driver.findElement(By.xpath("//*[@id='user_password']"));
		password.clear();
		password.sendKeys("b");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id='new_user']/div[3]/input"));
		loginButton.click();
		
	}


	@Then("^: He can visit the practice page$")
	public void he_can_visit_the_practice_page() {
		System.out.println("Finally at home page");
	}


}
