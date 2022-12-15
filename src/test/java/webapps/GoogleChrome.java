package webapps;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

	public class GoogleChrome {	

		AndroidDriver<AndroidElement> Driver;
		
		@BeforeTest
		public void befortest() throws MalformedURLException
		{

			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.google.android.deskclock");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.deskclock.ringtone.RingtonePickerActivity");
				
			
			Driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			Driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
			}
		@Test
		public void test1()
		{
			
			System.out.println("Welcome to Google-Chrome");
			
		}
		

	}

