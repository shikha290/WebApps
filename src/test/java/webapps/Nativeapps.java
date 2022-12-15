package webapps;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.TapOptions.tapOptions;
public class Nativeapps {
	
AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void BT() throws MalformedURLException
	{
		DesiredCapabilities dc =  new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"io.appium.android.apis");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "io.appium.android.apis.ApiDemos");
		//dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
		driver =  new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test(enabled=false)
	public void testcase1() throws InterruptedException
	{
		 System.out.println("We're started with native apps");
		//driver.findElement(MobileBy.AccessibilityId("Accessibility")).click();		
		 driver.findElement(MobileBy.AccessibilityId("Animation")).click();
		 Thread.sleep(3000);
		 driver.findElements(MobileBy.className("android.widget.TextView")).get(5).click();
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.AccessibilityId("Play")).click();
		 driver.findElement(MobileBy.AndroidUIAutomator("new Uiselector().text(\"Reversing\")")).click();
		
	}
	@Test(enabled=false)
	public void testcase2() throws InterruptedException
	{
		
		
		driver.findElement(MobileBy.AccessibilityId("Preference")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.className("android.widget.TextView")).get(3).click();
        Thread.sleep(3000);
		driver.findElement(MobileBy.className("android.widget.RelativeLayout")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/checkbox")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/checkbox")).click();
		Thread.sleep(4000);
		driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
		Thread.sleep(3000);
		driver.findElement(MobileBy.id("android:id/edit")).sendKeys("vijay");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
	 }
	@Test(enabled=true)
	public void testcase3() throws InterruptedException
	{
	
	
	 	driver.openNotifications();
	 	Thread.sleep(3000);
	 	driver.findElement(MobileBy.AccessibilityId("Open quick settings.")).click();
	 	Thread.sleep(3000);
    // click auto rotate
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Auto-rotate\")")).click();
	 	Thread.sleep(3000);
   //open settings
	 	driver.findElement(MobileBy.AccessibilityId("Open settings.")).click();
	 	Thread.sleep(3000);
   //click on display
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Display\")")).click();
	 	Thread.sleep(3000);
   //click on sleep
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sleep\")")).click();
   //click on 2minutes
	 	driver.findElements(MobileBy.className("android.widget.CheckedTextView")).get(3).click();
	 	Thread.sleep(3000);
   //click on device rotate
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Device rotation\")")).click();
	 	Thread.sleep(2000);
   //click on checkbox
	 	driver.findElements(MobileBy.className("android.widget.CheckedTextView")).get(1).click();
   //click on advanced
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Advanced\")")).click();
	 	Thread.sleep(2000);
   //click on font size
	 	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Font size\")")).click();
	 	Thread.sleep(3000);
   //click font size
	 	driver.findElement(MobileBy.AccessibilityId("Make larger")).click();
	 	Thread.sleep(2000);
	 	driver.navigate().back();
	 	driver.navigate().back();
	 	driver.navigate().back();
	}
}	 	

//	@Test
//	public void testcase4() throws InterruptedException
//	{
//      driver.findElement(MobileBy.AccessibilityId("Views")).click();
//      AndroidElement size = driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)");
//      System.out.println(size.getSize());
//      driver.findElement(MobileBy.AccessibilityId("Expandable Lists")).click();
//      //tapping    
//      AndroidElement tp =    driver.findElement(MobileBy.AccessibilityId("1. Custom Adapter"));
//      TouchAction ta = new TouchAction(driver);
//      ta.tap(tapOptions().withElement(element(tp))).perform();
//      //longpress
//      AndroidElement lp=    driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"People Names\")"));
//      ta.longPress(longPressOptions().withElement(element(lp)).withDuration(ofSeconds(3))).release().perform();
//      driver.findElementByAndroidUIAutomator("text(\"Sample action\")").click();
//      
////      for pressing home , back button automatically 
//    //key press
//      driver.pressKey(new KeyEvent(AndroidKey.BACK));
//      driver.pressKey(new KeyEvent(AndroidKey.HOME));
//       }
//	}
