package testpkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Hometest extends Baseclass{
	WebDriver driver;
	
	
	@Test(priority=1)
	public void actions() {
		homeobj.propertydetails();
	}
	

}
