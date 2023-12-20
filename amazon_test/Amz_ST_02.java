package amazon_test;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import amazon_source.Home;
import amazon_source.Login;
import amazon_source.Product;
import amazon_source.SearchResultShoe;
//login->search->wishlist->cart->Make Payment->Debit Card->Logout
public class Amz_ST_02 extends LaunchQuit {
     @Test
     
    	 public void logintobookingcc() {
    	 Login l1= new Login(driver);
 		l1.un();
 		l1.pwd();
 		Home h1 =new Home(driver);
 		h1.searching();
 		SearchResultShoe s1 = new SearchResultShoe(driver);
 	    s1.selectingshoe();
 	    Set<String> parentandchild= driver.getWindowHandles();
 	    Iterator<String> pc= parentandchild.iterator();
 	    String Parent=   pc.next();
 	    String child=     pc.next();
 		driver.switchTo().window(child);
 	    Product p1 = new Product(driver);
 	    p1.wishlist();
 	    p1.buy();
     
     }
}
