package StepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import pageObject.HomePage;

public class HomeStepDefinition {
	
	
	private HomePage homepage=new HomePage();
	
	@Given("^User has launched URL$")
	public void launchURL() {
		homepage.launchURL();
	}
}
