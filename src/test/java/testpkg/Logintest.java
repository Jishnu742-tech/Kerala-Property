package testpkg;

import org.testng.Assert;

import org.testng.annotations.Test;

import basepkg.Baseclass;

public class Logintest extends Baseclass{
	@Test(priority=1)
	public void titleverificationmethod() {
		String actualtitle =loginobj.titilemethod();
		Assert.assertEquals(actualtitle, "Post your Property - Login | Keralaproperty");
		
	}
	@Test(priority=2)
	public void loginvalidationmethod() {
		loginobj.loginmethod("jishnumahesh4@gmail.com", "Jishnu@2003");
		
	}
	
//	@AfterClass
//	public void closingmethod() {
//		driver.quit();
//	}
	

}
