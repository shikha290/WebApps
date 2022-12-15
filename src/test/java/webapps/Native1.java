package webapps;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
public class Native1 {
	
	@BeforeTest
	public void KillAllProcesses() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(8000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"//emulator.bat");
		Thread.sleep(10000);
		
	}
	@Test(enabled=true)
	public void tc1() throws IOException, InterruptedException {
		service = startServer();
		AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
		Thread.sleep(3000);

		 driver.findElement(MobileBy.id("android:id/text1")).click();
	   	 Thread.sleep(3000);
	  //scroll
	   	 driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Canada\"))").click();
	   	 Thread.sleep(2000);
	 	 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("eren");
	   	Thread.sleep(2000);
	   	
	   	driver.findElement(MobileBy.className("android.widget.RadioButton")).click();	
	   	driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		driver.findElements(MobileBy.xpath("//*[@text='ADD TO CART']")).get(0).click();
		Thread.sleep(3000);
		 Thread.sleep(3000);
		 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 Thread.sleep(3000);
		//1st product price
		 String price1 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(0).getText();
		 price1 = price1.substring(1);
		
		 Double product1 = Double.parseDouble(price1);
		 System.out.println("product1 price = " + product1);
		//2nd product price
		 String price2 = driver.findElements(MobileBy.id("com.androidsample.generalstore:id/productPrice")).get(1).getText();
		 price2 = price2.substring(1);
		
		 Double product2 = Double.parseDouble(price2);
		 System.out.println("product2 price = " + product2);
		
		 Double Totalprice = product1 + product2;
		 System.out.println("total price = " + Totalprice);
		 Thread.sleep(2000);
		 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Send me e-mails on discounts related to selected products in future\")")).click();
		
		 driver.findElement(MobileBy.id("com.androidsample.generalstore:id/btnProceed")).click();
		 service.stop();
	}
		 @Test(enabled=false)
			public void tc2() throws InterruptedException, IOException
			{
			 service = startServer();
				AndroidDriver<AndroidElement> driver= hybrid_capabilities(appactivity, apppackage, deviceName, chromeexcutable);
				Thread.sleep(6000);
				//sign in
				driver.findElements(MobileBy.className("android.widget.Button")).get(1).click();
				Thread.sleep(3000);
				driver.findElements(MobileBy.className("android.widget.Button")).get(1).click();
				Thread.sleep(7000);
				//google
				driver.findElement(MobileBy.className("android.widget.LinearLayout")).click();
				Thread.sleep(10000);
				//dismiss
				driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc='Dismiss']")).click();
				Thread.sleep(7000);
				//arithmetic
				driver.findElement(MobileBy.xpath("//android.widget.Button[@content-desc='Arithmetic']/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
				Thread.sleep(5000);
				//intro into mul
				driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
				Thread.sleep(7000);
				//mul to rep addition
				driver.findElements(MobileBy.className("android.widget.ImageView")).get(1).click();
				Thread.sleep(5000);
				//save
				driver.findElements(MobileBy.className("android.widget.ImageView")).get(0).click();
				Thread.sleep(3000);
				//Bookmark
				driver.findElements(MobileBy.className("android.widget.TextView")).get(0).click();
				Thread.sleep(3000);	
				//got it
				driver.findElement(MobileBy.id("android:id/button2")).click();
				driver.navigate().back();
				//search
				driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
				Thread.sleep(7000);	
				//Life skills
				driver.findElements(MobileBy.className("android.widget.TextView")).get(9).click();
				Thread.sleep(7000);
				//internet safety
				driver.findElements(MobileBy.className("android.widget.ImageView")).get(7).click();
				Thread.sleep(7000);	
			    driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				driver.pressKey(new KeyEvent(AndroidKey.BACK));
				//settings
				driver.findElements(MobileBy.className("android.widget.Button")).get(0).click();
				Thread.sleep(5000);	
				// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sign out\"))").click();
				//swiping using actions
				TouchAction tee=new TouchAction(driver);
				Thread.sleep(5000);
				tee.longPress(PointOption.point(966,1975)).moveTo(PointOption.point(946, 150)).release().perform();
				Thread.sleep(5000);
				driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign out\")")).click();
				driver.findElement(MobileBy.id("android:id/button1")).click();
				service.stop();
				
			}


	}
