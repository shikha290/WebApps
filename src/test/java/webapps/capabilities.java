package webapps;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.reactivex.rxjava3.functions.Action;

public class capabilities {
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
    DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,"D://eclipse_workspace//webapps//chromedriver.exe");
		dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c",false));
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	
	}
	
	@Test
	public void testcase() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@class='gLFyf']")).sendKeys("MoolyaEd");
		Actions act = new Actions (driver);
		act.sendKeys(Keys.ENTER).click().build().perform();
		JavascriptExecutor js1= ((JavascriptExecutor)driver);
		js1.executeScript("window.scroll(0,600)");
		Thread.sleep(3000);
		Actions act1 = new Actions (driver);
		WebElement ele1= driver.findElement(By.xpath("//div[contains(text(),'LinkedIn')]"));		
		ele1.click();
		Thread.sleep(3000);
		driver.getTitle();

	}
}
