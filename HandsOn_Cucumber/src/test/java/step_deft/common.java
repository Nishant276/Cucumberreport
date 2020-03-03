package step_deft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stepdefination.Actions;
import stepdefination.PageObjects;


public class common {
	
	static WebDriver driver;
	static pageobject p;
	public static void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","src/test/resources/features/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		p=new pageobject(driver);
		
	}
	public static void login()
	{
		p.signin.click();
		p.username.sendKeys("Lalitha");
		p.password.sendKeys("Password123");
		p.Login.click();
		
	}
	public static void productselect()
	{
		Actions action=new Actions(driver);
		action.moveToElement(p.allcategories).click().build().perform();
		action.moveToElement(p.Electronics).click().build().perform();
		action.moveToElement(p.headphone).click().build().perform();
		p.addtocart.click();
		p.cart.click();
		p.checkout.click();
		p.Proceedtopay.click();
	}

}
