package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home  {
	ChromeDriver driver;
	  @FindBy(id="twotabsearchtextbox")
	  WebElement searchtextfield;
	  @FindBy(id="nav-search-submit-button")
	  WebElement searchbutton;
	  
	
	public void searching()
	{
		searchtextfield.sendKeys("shoe");
		searchbutton.click();
	}
	public Home(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
