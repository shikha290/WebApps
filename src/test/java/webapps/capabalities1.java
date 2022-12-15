package webapps;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class capabalities1 {
		
		public static AndroidDriver<AndroidElement>driver;
		
		public static AndroidDriver<AndroidElement>webapp() throws MalformedURLException
		{
			
			
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "madhavi");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Andriod");
			dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
			dc.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C://2#MadhaviLatha//Chromedriver//chromedriver_win32");
			
			driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			
			return driver;
			
		}
}
