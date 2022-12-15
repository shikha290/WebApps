package webapps;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

	public class calc {
		

		AndroidDriver<AndroidElement> Driver;
		
		@BeforeTest
		public void befortest() throws MalformedURLException
		{

		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");
				
			
			
		Driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
		Driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
		}
		@Test
		public void testcase1() throws InterruptedException
		{
			System.out.println("Hi Welcome to Calculator");
			Driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
			Driver.findElement(MobileBy.id("com.android.calculator2:id/op_add")).click();
			Driver.findElement(MobileBy.id("com.android.calculator2:id/digit_3")).click();		
			Driver.findElement(MobileBy.id("com.android.calculator2:id/eq")).click();
	}
}
