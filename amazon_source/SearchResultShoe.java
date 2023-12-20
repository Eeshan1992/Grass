package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultShoe  {
	ChromeDriver driver;
	  @FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]")
	  WebElement first_shoe;
	  
	  
	
	public void selectingshoe()
	{
		 first_shoe.click();
	}
	public SearchResultShoe(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
