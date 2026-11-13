package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Homepage;
import pagepkg.Loginpage;

public class Baseclass {
	public static WebDriver driver;
	public  Loginpage loginobj;
	public Homepage homeobj;
	//public Homepage obj;
	@BeforeTest
	public void browsersetup() {
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void objectmethod() {
		loginobj=new Loginpage(driver);
		homeobj=new Homepage(driver);
		//obj=new Homepage(driver);
	}

}
