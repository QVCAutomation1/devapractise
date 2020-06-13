package fabulous;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void verifythelogginbutton() {
	  
	  
	 //.setProperty("webdriver.chrome.driver", arg1);
	//  Webdriver driver= new chromedriver();
	//.get("qvc.com");
	  
	  
  }
  @Test
  public void anotherpageopen() {
	  System.out.println("clariied  web page");
  }
  @BeforeMethod
 
  public void beforeMethod() {
	  System.out.println(" print method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after the  before test annotations");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("it is the beforeclass methods");
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
