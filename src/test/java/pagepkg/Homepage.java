package pagepkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	WebDriver driver;
	Select obj;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a")WebElement addproperty;
	@FindBy(xpath="//*[@id=\"proptype\"]")WebElement propertyfor;
	@FindBy(xpath="//*[@id=\"listtype\"]")WebElement Listingplan;
	@FindBy(xpath="//*[@id=\"proplabel\"]")WebElement propertylabel;
	@FindBy(xpath="//*[@id=\"propcategory\"]")WebElement category;
	@FindBy(xpath="//*[@id=\"propcost\"]")WebElement expectedprice;
	@FindBy(xpath="//*[@id=\"propbeds\"]")WebElement noofbeds;
	@FindBy(xpath="//*[@id=\"propbaths\"]")WebElement noofbath;
	@FindBy(xpath="//*[@id=\"district\"]")WebElement district;
	@FindBy(xpath="//*[@id=\"proplocation\"]")WebElement location;
	@FindBy(xpath="//*[@id=\"propaddress\"]")WebElement address;
	@FindBy(xpath="//*[@id=\"introlabel\"]")WebElement titleofaddress;
	@FindBy(xpath="//*[@id=\"frm_property\"]/div[9]/div/div/iframe")WebElement frametag;
	@FindBy(xpath="/html/body")WebElement summary;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[10]/div/div/input[2]")WebElement photo;
	@FindBy(xpath="//*[@id=\"sub_frmproperty\"]")WebElement submit;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void propertydetails() {
		addproperty.click();
		obj=new Select(propertyfor);
		obj.selectByValue("sale");
		
		
		obj=new Select(Listingplan);
		obj.selectByValue("regular");
		
		propertylabel.sendKeys("property");
		
		obj=new Select(category);
		obj.selectByVisibleText("House");
		
		expectedprice.sendKeys("5000000");
		
		noofbeds.sendKeys("3");
		noofbath.sendKeys("78");
		
		obj=new Select(district);
		obj.selectByContainsVisibleText("Kannur");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(location));
		
		obj=new Select(location);
		obj.selectByIndex(4);
		
		address.sendKeys("Vyshnavam Arayambeth Chirakkal Kannur");
		
		titleofaddress.sendKeys("12345");
		
		driver.switchTo().frame(frametag);
		summary.click();
		summary.sendKeys("abcdffhjhjhjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj   fgjyhhhhhhhhhhhhhhhhhhhhh  jjjhhhhhhhhhhhh");
		
		driver.switchTo().defaultContent(); 
		
		//photo.sendKeys("\"C:\\Users\\ASUS\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-11-04 111457.png\"");
		submit.click();
	}
	
}
