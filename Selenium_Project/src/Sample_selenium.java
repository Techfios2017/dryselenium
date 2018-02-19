import java.util.ArrayList;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Sample_selenium {

@Test
public void first_test()
{
	//Configuration process:- browser settings
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	//Test steps
	driver.get("https://www.qtptutorial.net/automation-practice/"); // goes to the URL
	driver.findElement(By.id("idExample")).click(); // clicks the button
    driver.findElement(By.className("main_title")).isDisplayed();// validates if this element is present or not. If the element is not present it means page did not load
  
    // Tear down process:- closes the browser and ends the test case
    driver.close();
    driver.quit();

}

@Test
public void Second_test()
{
	//Configuration process:- browser settings
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.qtptutorial.net/automation-practice/"); // goes to the URL
	driver.findElement(By.className("buttonClassExample")).click();
	driver.findElement(By.className("main_title")).isDisplayed();
  
    // Tear down process:- closes the browser and ends the test case
    driver.close();
    driver.quit();

}

@Test
public void Email_Adress_Test() throws InterruptedException
{
	//Configuration process:- browser settings
	System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.qtptutorial.net/automation-practice/"); // goes to the URL
	
	driver.findElement(By.id("et_pb_signup_firstname")).sendKeys("John");
	driver.findElement(By.id("et_pb_signup_email")).sendKeys("John@gmail.com");
	driver.findElement(By.className("et_pb_newsletter_button_text")).click();
     
	Thread.sleep(3000); 
	
    // Tear down process:- closes the browser and ends the test case
    driver.close();
    driver.quit();

}




}























