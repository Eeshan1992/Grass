package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login  {
	ChromeDriver driver;	
  @FindBy(id="ap_email")
  WebElement username;
  
  @FindBy(id="continue")
  WebElement continue_button;
  
  @FindBy(id="ap_password")
  WebElement password;
  
  @FindBy(xpath="//input[@id='signInSubmit']")
  WebElement signinbutton;

public void un()
{
	username.sendKeys("eeshanacharya@gmail.com");
	continue_button.click();
}
public void pwd()
{
	password.sendKeys("alamchand");
	signinbutton.click();
}
public Login(ChromeDriver driver)
{
	PageFactory.initElements(driver, this);
}

}