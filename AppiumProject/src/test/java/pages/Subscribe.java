package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

public class Subscribe {
	
	AndroidDriver driver;
	
	By subscribe = By.xpath("//android.widget.Button[@text='SUBSCRIBE']");
	By close = By.id("uk.co.condenast.wired:id/slideshow_close");
	//By popup = By.xpath("//div[@id='errorPopup']");
	//driver.switchTo().activeElement();
	
    public Subscribe(AndroidDriver driver)
    {
    	this.driver=driver;
    }

    public void ClickOnClose()
    {
    	driver.findElement(close).click();
    }
    public void ClickOnSubscribe()
    {
    	driver.findElement(subscribe).click();
    }
}
