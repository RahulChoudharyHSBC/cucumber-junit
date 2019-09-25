package Util;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.utils.FileUtil;

public class BasePageObject /*extends pageObject*/{
	public WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rahul\\eclipse-workspace\\RahulAutomationProjects\\src\\com\\tester\\rahul\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		
		
	}
	
	
	

	

}
