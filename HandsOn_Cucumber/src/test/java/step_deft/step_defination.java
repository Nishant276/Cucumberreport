package step_deft;

import java.util.concurrent.TimeUnit;

import cucumber.api.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefination.ChromeDriver;
import stepdefination.Common;
import stepdefination.PageObjects;
import stepdefination.WebDriver;
import stepdefination.WebDriverWait;

public class step_defination {
	
	
	pageobject p;
	@SuppressWarnings("depreciation")
	@Given("Navigate to Home")
	public void navigate_to_Home() 
	{
	System.setProperty("webdriver.chrome.driver","src/test/resources/features/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"details-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"proceed-link\"]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 p=new pageobject(driver);
		 common.LaunchBrowser();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		p.signin.click();
		p.username.sendKeys("Lalitha");
		p.password.sendKeys("Password123");
		p.Login.click();
		common.login();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully() {
		System.out.println("user logged in successfully");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@And("navigate to all category")
	public void navigate_to_all_category()
	{
		
	}
	@When("continue for checkout")
	public void continue_for_checkout() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("select bank and add credentials")
	public void change_the_shipping_address_to_a_address_as(String string) {
		p.checkbox.click();
		p.Proceedtopay.click();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(p.selectbank));
		p.selectbank.click();
		p.continu.click();
		
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	
	

	}

	


