package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import Util.BasePageObject;

public class HomePage extends BasePageObject{
	
	BasePageObject basepageObject=new BasePageObject();
	public HomePage() { 
	    PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	//static WebDriver driver;
	public void  launchURL() {
		basepageObject.getDriver().get("https://www.facebook.com/");
		
	}

}
