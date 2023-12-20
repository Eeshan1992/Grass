package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product  {
	ChromeDriver driver;
	  @FindBy(id="add-to-wishlist-button-submit")
	  WebElement addtowishlist;
	  @FindBy(id="buy-now-button")
	  WebElement buynow;
	  @FindBy(id="add-to-cart-button")
	  WebElement addtocart;
	  @FindBy(xpath="(//span[.='Continue shopping'])[1]")
	  WebElement continueshopping;
	
	public void wishlist()
	{
		addtowishlist.click();
		continueshopping.click();
	}
	public void cart()
	{
		addtocart.click();
	}
	public void buy()
	{
		buynow.click();
	}
	
	
	public Product(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		

}