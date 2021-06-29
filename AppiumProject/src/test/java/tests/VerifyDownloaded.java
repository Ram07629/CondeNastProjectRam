package tests;

import org.testng.annotations.Test;

public class VerifyDownloaded extends BaseClass {
 
	 @Test(groups= {"sanity"})
	  public void verifydownloads() throws InterruptedException {
	  System.out.println("Downloaded");  
	  pages.Download downloads = new pages.Download(driver);
	  downloads.ClickOnClose();
	  downloads.ClickOnDownloaded();;
	  Thread.sleep(2000);
	  downloads.VerifyMessage();
	
}
}
