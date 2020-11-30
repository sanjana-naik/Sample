package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.BrowserFactory;
import Generic.FileManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Login_Page;

public class Steps1 
{
	WebDriver driver;
	FileManager fm=new FileManager();
	Login_Page lp;
	
	@Before(order = 0)
	public void setUp()
	{
		driver=new BrowserFactory().getBrowser("chrome");
		driver.get(fm.getApplicationUrl());
		driver.manage().timeouts().implicitlyWait(fm.getImplicityWait(), TimeUnit.SECONDS);
		lp=new Login_Page(driver);
	}
	
	@After(order = 0)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "Image/png", scenario.getName());
		}
		driver.quit();;
	}
	
	/*@Before("@smoke")
	public void mobileSetUp()
	{
		System.out.println("execute in mobile environment");
	}
	
	@After("@smoke")
	public void mobileTearDown()
	{
		System.out.println("close the mobile environment");
	}*/
	
	@Given("user is on Login Page")
	public void user_is_on_Login_Page() {
		System.out.println("login page");
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String uname, String pwd) {
		lp.setUsername(uname);
		lp.setPassword(pwd);
	}

	@When("clicks on Login button")
	public void clicks_on_Login_button() {
		lp.clickLogin();
	}

	@Then("Message displayed Login Successfully {string}")
	public void message_displayed_Login_Successfully(String expected_result) throws InterruptedException {
	    String atitle=driver.getTitle();
	    Thread.sleep(2000);
	    Assert.assertEquals(expected_result, atitle);
	}
	
	@When("user enters valid Username {string} and Password {string}")
	public void user_enters_valid_Username_and_Password(String string, String string2) {
		lp.setUsername(string);
		lp.setPassword(string2);
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() throws InterruptedException {
		lp.verifyTitle(10, "Enter");
		String atitle=driver.getTitle();
	    Assert.assertEquals("actiTIME -  Enter Time-Track", atitle);
	}
	
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    System.out.println("user is on home page");
	}

	@When("user searches for the product")
	public void user_searches_for_the_product(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	    String val = data.get(0).get("product");
	    String val1 = data.get(0).get("quantity");
	    System.out.println(val+" - "+val1);
	}

	@Then("shoes page should be displayed")
	public void shoes_page_should_be_displayed() {
	    System.out.println("shoes page is displayed");
	}
}
