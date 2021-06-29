package pages;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class Download {

	AndroidDriver driver;
	
	By downloaded = By.xpath("//android.widget.TextView[@text='DOWNLOADED']");
	By message = By.xpath("//android.widget.TextView[@index='0']");
	By close = By.id("uk.co.condenast.wired:id/slideshow_close");
	
	
    public Download(AndroidDriver driver)
    {
    	this.driver=driver;
    }
    
    public void ClickOnClose()
    {
    	driver.findElement(close).click();
    }
    
    
    public void ClickOnDownloaded()
    {
    	driver.findElement(downloaded).click();
    }
    
    
    public void VerifyMessage()
    {
    	driver.findElement(message).getText();
    }
	
	
}
