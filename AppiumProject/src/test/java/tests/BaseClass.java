package tests;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	
	protected static AndroidDriver driver;
	private static BaseClass baseclass;
	protected static VerifySubscription subscription;
	
	
	
 
	
	
	private void setAndroidDriver(AndroidDriver driver2) {
		// TODO Auto-generated method stub
		
	}

	private void setWebDriver(AndroidDriver driver2) {
		// TODO Auto-generated method stub
		
	}

	private void setAndroidDriverProperty() {
		// TODO Auto-generated method stub
		
	}

	@BeforeClass
	public void setup() {
		
		try {
		DesiredCapabilities caps =new DesiredCapabilities();
		//caps.setCapability("platformName","ANDROID");
		caps.setCapability(CapabilityType.PLATFORM_NAME,"ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "OnePlus 8T");
		caps.setCapability(MobileCapabilityType.UDID, "2d706124");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		//caps.setCapability(MobileCapabilityType.APP, "");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "CHROME");
		//caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability("appPackage", "uk.co.condenast.wired");
		caps.setCapability("appActivity", "com.kaldorgroup.pugpig.products.StartViewController");
		
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		 
		 
		
		
		//URL url = new URL("http://127.0.0.1:4723/wd/hub");
		//driver = new AppiumDriver<MobileElement>(url,caps);
		
		}catch(Exception exp) {
			System.out.println("Cause is :"+exp.getCause());
			System.out.println("Message is :"+exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	/*@Test(groups= {"sanity"})
	public void launch() {
		System.out.println("Launched");
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);*/
		
	
	
	
	@AfterClass
    public void teardown() throws InterruptedException {
		
		Thread.sleep(10000);
		 //driver.quit();
	 
 }
}
