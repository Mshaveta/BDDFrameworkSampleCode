package StepDefintion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParameterisationStepDef {
	WebDriver driver;
	@Given("^Launch the application$")
	public void launch_app() {
		//System.out.println("launch_app");
		String url = System.getProperty("user.dir") + "\\src\\test\\java\\Drivers\\chromedriver_80.exe";
		System.setProperty("webdriver.chrome.driver", url);
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	 
	@When("enters the {string} username")
	public void enters_the_username(String username) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
	}

	@When("enters the {string} password")
	public void enters_the_password(String password) {
		driver.findElement(By.id("txtPassword")).sendKeys(password);
	     
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() {
		//System.out.println("click_on_Login_button");
		driver.findElement(By.id("btnLogin")).click();
		 
	}
	
}
