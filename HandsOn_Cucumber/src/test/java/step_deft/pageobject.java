package step_deft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobject {
		WebDriver driver;
		
		public pageobject(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
		}
		@FindBy(linkText="SignIn")
		public static WebElement signin;
		
		@FindBy(name="userName")
		public static WebElement username;
		
		@FindBy(name="password")
		public static WebElement password;
		
		@FindBy(name="Login")
		public static WebElement Login;
		
		@FindBy(xpath="//span[contains(text(),'All')]")
		public static WebElement allcategories;
		
		@FindBy(xpath="//span[contains(text(),'Electronics')]")
		public static WebElement Electronics;
		
		@FindBy(xpath="//span[contains(text(),'Head Phone')]")
		public static WebElement headphone;
		
		@FindBy(xpath="//a[@class='btn btn-success btn-product']")
		public static WebElement addtocart;
		
		@FindBy(xpath="//a[contains(text(),'Cart')]")
		public static WebElement cart;
		
		@FindBy(xpath="//input[@id='quantity_1']")
		public static WebElement quantity;
		
		@FindBy(xpath="//a[@class='btn btn-success btn-block']")
		public static WebElement checkout;
		
		@FindBy(xpath="//input[@id='choice-dollar']")
		public static WebElement checkbox;
		
		@FindBy(xpath="//textarea[@id='add2']")
		public static WebElement testbox;
		
		@FindBy(xpath="//form[2]//input[1]")
		public static WebElement Proceedtopay;
		
		@FindBy(xpath="//label[contains(text(),'Andhra Bank')]//i")
		public static WebElement selectbank;
		
		@FindBy(xpath="//a[@id='btn']")
		public static WebElement continu;
		
		@FindBy(xpath="//input[@name='username']")
		public static WebElement usernam;
		
		@FindBy(xpath="//input[@name='password']")
		public static WebElement pass;
		@FindBy(xpath=" //div[3]//input[1]")
		public static WebElement logn;





}
