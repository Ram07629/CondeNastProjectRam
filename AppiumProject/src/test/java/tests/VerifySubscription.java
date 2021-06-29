package tests;

import org.testng.annotations.Test;


public class VerifySubscription extends BaseClass{
  
  @Test(groups= {"sanity"})
  public void verifysubscription() throws InterruptedException {
  System.out.println("Subscribed");  
  pages.Subscribe subscribe = new pages.Subscribe(driver);
  subscribe.ClickOnClose();
  Thread.sleep(2000);
  subscribe.ClickOnSubscribe();
  
}
}