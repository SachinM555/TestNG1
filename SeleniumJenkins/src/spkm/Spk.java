package spkm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Spk {
	@Test
	public void publicvoidtestgooglrsearch(){
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.co.in");
		//String Expectedtitle = "Google";
		String Actualtitle = driver.getTitle();
		System.out.println(Actualtitle);
		//System.out.println("Before Assetion: " + Expectedtitle + Actualtitle);
/*		Assert.assertEquals(Actualtitle, Expectedtitle);
		System.out.println("After Assertion: " + Expectedtitle + Actualtitle + " Title matched ");*/
		driver.close();
	}
}
