package Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pages.BaseClass;


public class LoginPageAdvance extends BaseClass {
	WebDriver driver;
	@FindBy(xpath ="//*[@id='userid']")
	WebElement username;
	
	@FindBy(xpath ="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath ="//*[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath ="//*[@id='pin']")
	WebElement pintextfield;
	
	

	@FindBy(xpath ="//*[@type='button']")
	WebElement button;
	

	public LoginPageAdvance(WebDriver driver) throws IOException {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void enterCredentials() {
		
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));

	}

	public void clickOnLogin() {
		loginbutton.click();
	}

	public void enterPin() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		pintextfield.sendKeys(prop.getProperty("pin"));
		loginbutton.click();
	}

	public String getTitleOfPage() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		button.isDisplayed();
		
		String titleofpage = driver.getTitle();

		return titleofpage;

	}

}
