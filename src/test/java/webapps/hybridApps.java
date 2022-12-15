package webapps;
	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.appium.java_client.MobileBy;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;
	import io.appium.java_client.remote.AndroidMobileCapabilityType;
	import io.appium.java_client.remote.AutomationName;
	import io.appium.java_client.remote.MobileCapabilityType;
	public class hybridApps {
		AndroidDriver<AndroidElement> Driver;
		
		@BeforeTest
		public void befortest() throws MalformedURLException
		{

			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
			dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
			dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.androidsample.generalstore.SplashActivity");
				
			
			
			Driver=new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
			Driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
		}
		
		
		@Test(enabled=false)
		public void positive() throws InterruptedException
		{
		
			
			Driver.findElement(MobileBy.id("android:id/text1")).click();
			Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shikha");
			
			Driver.hideKeyboard();
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
			
			Thread.sleep(5000);
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
					
			
			Thread.sleep(5000);
			Driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
			Driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(5000);
			String price1=Driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
			
			price1=price1.substring(1);
			
			Double cost1=Double.parseDouble(price1);
			System.out.println(cost1);
			
			String price2=Driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
			price2=price2.substring(1);
			Double cost2=Double.parseDouble(price2);
			System.out.println(price2);
			Double Totalprice=cost1+cost2;
			System.out.println(Totalprice);
			
			
			
			String total=Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
			
			total=total.substring(1);
			
			double total1=Double.parseDouble(total);
			
			System.out.println(total1);
			
			if(Totalprice.equals(total1))
			{
				
				System.out.println("Price Matched");
			}
			else
			{
				
				System.out.print("Price not Matching");
			}
			
			
			Thread.sleep(5000);
			Driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
			Driver.findElement(MobileBy.className("android.widget.Button")).click();
			
			Thread.sleep(8000);
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/webView"));
			Thread.sleep(5000);
			System.out.println(Driver.getTitle());
			
			
		}
			
			
		@Test(enabled=false)
		public void negative() throws InterruptedException
		{
		
			
			Driver.findElement(MobileBy.id("android:id/text1")).click();
			Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();
			//driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shikha");
			
			//driver.hideKeyboard();
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
			
			Thread.sleep(5000);
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
			
		String M=	Driver.findElement(MobileBy.xpath("//android.widget.Toast[1]")).getText();
			
		System.out.println(M);
			
			
			
		}
		@Test(enabled=true)
		public void scroll() throws InterruptedException
		{
			

			Driver.findElement(MobileBy.id("android:id/text1")).click();
			Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Antarctica\"))").click();
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Shikha");
			
			Driver.hideKeyboard();
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/radioFemale")).click();
			
			Thread.sleep(5000);
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
					
			
			Thread.sleep(5000);
			
			String productname=Driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"))").getText();
			
			System.out.println(productname);
			
			Driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(1).click();
			
			Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(5000);
			
			
			String price1=Driver.findElement(MobileBy.id("com.androidsample.generalstore:id/productPrice")).getText();
			
			price1=price1.substring(1);
			
			Double cost1=Double.parseDouble(price1);
			System.out.println(cost1);
			
			Thread.sleep(5000);
			Driver.findElement(MobileBy.className("android.widget.CheckBox")).click();
			
			Driver.findElement(MobileBy.className("android.widget.Button")).click();
		}

	}

