/*package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps 
{
	WebDriver driver;
	
	@Given("user is on Login Page")
	public void user_is_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	}

	@When("user enters valid Username {string} and Password {string}")
	public void user_enters_valid_Username_and_Password(String uname, String pwd) {
	    
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@When("clicks on Login button")
	public void clicks_on_Login_button() {
	    driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

	@When("clicks remember me checkbox")
	public void clicks_remember_me_checkbox() {
	    System.out.println("click on remember me");
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws InterruptedException {
		Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	    driver.close();
	}

}
*/