package MutualMobile;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.net.URL;


import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {
 	  
	  static WebDriver driver;
	  @BeforeTest
	  public void Amazontesting() throws InterruptedException, MalformedURLException
		{
			//File app= new File("/Users/thirumalesh/Downloads/Amazon_shopping.apk");
			DesiredCapabilities capabilities= new DesiredCapabilities();
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("platformVersion", "9.0");
			capabilities.setCapability("deviceName", "Nokia 5");
			capabilities.setCapability("appPackage", "com.amazon.mShop.android.shopping");
			capabilities.setCapability("appActivity", "com.amazon.mShop.sso.SigninPromptActivity");
			capabilities.setCapability("appWaitActivity", "com.amazon.mShop.sso.SigninPromptActivity");
			capabilities.setCapability("appWaitPackage", "com.amazon.mShop.sso.SigninPromptActivity");
			capabilities.setCapability("autoGrantPermissions","true");
			capabilities.setCapability("appWaitDuration", "20000");
			capabilities.setCapability("app", "/Users/thirumalesh/Desktop/Amazon_shopping.apk");
			driver = new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			
	
	  
  }
	    @Test
	  public String f() {
	    	 driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
		  	  driver.findElement(By.id("ap_email")).sendKeys("name");
		  	  driver.findElement(By.id("continue")).click();
		  	  driver.findElement(By.id("ap_password")).sendKeys("pwd");
		  	  driver.findElement(By.id("signInSubmit")).click();
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("65 inches tv");
		  driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollBy(0,250)");
	  driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=1']//img[@class='s-image']")).click();
		  return "After checkout";
		  
//		  List<WebElement> list = driver.findElements(By.xpath("//*[@id='search']/div/div[2]/div/span[3]/div/div/div/div/div/div/div/div[2]/div[2]/div/div/div/div/div/h5/a"));
//		  System.out.println(list.size());
//		  int get_random_number;
//		  Random rand = new Random();
//		  get_random_number = rand.nextInt(list.size());
//		  System.out.println("Random number is : "+get_random_number);
//		  String product_name = list.get(get_random_number).getText();
//		  list.get(get_random_number).click();
//		  
//		  System.out.println("selected product is : "+product_name);
//		  wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-wishlist-button-submit")));
//		  driver.findElement(By.id("add-to-wishlist-button-submit")).click();
//		  wait.until(ExpectedConditions.elementToBeClickable(By.id("WLHUC_viewlist")));
//		  driver.findElement(By.id("WLHUC_viewlist")).click();
//		  String xpath = "//*[@id='g-items']/li/span/div/div/div/div[2]/div[3]/div/div/div/div/div/h3/a";
//		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
//		  String wish_list_product_name = driver.findElement(By.xpath(xpath)).getText();
//		  System.out.println("Wish list product name is : "+wish_list_product_name);
//		  
//		  Assert.assertEquals(product_name, wish_list_product_name);
//		  
//		  Actions action = new Actions(driver);
//		  
//		  WebElement toElement = driver.findElement(By.xpath("//*[@id='nav-tools']/a"));
//		  action.moveToElement(toElement).build().perform();
	  }
	    @AfterTest
	    public String test() {
	  	  driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
	  	  driver.findElement(By.id("ap_email")).sendKeys("name");
	  	  driver.findElement(By.id("continue")).click();
	  	  driver.findElement(By.id("ap_password")).sendKeys("pwd");
	  	  driver.findElement(By.id("signInSubmit")).click();
	  	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("65 inches tv");
	  	  driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
	  	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  	  jse.executeScript("window.scrollBy(0,250)");
	    driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=1']//img[@class='s-image']")).click();
	  	  return "Before Checkout";
	  		
	    }
	    
	    public static void main(String[] args) {
	    AppiumTest  task = new AppiumTest ();
	  	  String firstFunResult = task.f();
	  	  String secondFunResult = task.test();
	  	  
	  	  if (firstFunResult.equalsIgnoreCase(secondFunResult)) {
	  		  System.out.println("Test case Passed");
	  	  }
	  	  else {
	  	   System.out.println("Test Case Failed");
	  	  
	    }
	    
	  
	    }  
}
