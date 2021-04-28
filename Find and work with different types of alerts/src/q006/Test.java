package q006;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Test 
{
	public static WebDriver driver;
	public static void test() throws IOException,InterruptedException
	{

		//Navigating to website
		driver.navigate().to("http://cookbook.seleniumacademy.com/Alerts.html");
		
		//SIMPLE ALERT 
		WebElement simple = driver.findElement(By.id("simple"));
		simple.click();
		
		//Alert object is created
		Alert alert=driver.switchTo().alert();
		String message1=alert.getText();
		System.out.println("Alert box is "+message1);
		Thread.sleep(2000);
		alert.accept();

		//CONFIRM ALERT
		//ACCEPT
		WebElement confirm =driver.findElement(By.id("confirm"));
		confirm.click();
		String message2=alert.getText();
		System.out.println("Alert box is "+message2);
		Thread.sleep(2000);
		alert.accept();

		//DISMISS
		driver.findElement(By.id("confirm"));
		confirm.click();
		Thread.sleep(2000);
		alert.dismiss();
		
        //PROMPT ALERT
		String input = Readfile.input();
		WebElement prompt= driver.findElement(By.id("prompt"));
		prompt.click();
		String message3=alert.getText();
		System.out.println("Alert box is "+message3);
		
		//Reading input from readfile.java and clicking on ok
		alert.sendKeys(input);
		Thread.sleep(2000);
		alert.accept();
		
		//Getting the message associated with each Alert box. 
		System.out.println(input);
		Thread.sleep(2000);
		
		System.out.println(" ");
		
		//Closing the Browser
		driver.close();
	}
		
	//Invoke a Chrome browser
	public WebDriver createChromeDriver() throws InterruptedException, IOException 
	{ 
		driver=DriverSetup.invokeChrome();
		return driver;	
	}
	
	//Invoke a Firefox browser
	public WebDriver createFireDriver() throws InterruptedException, IOException 
	{ 
		driver=DriverSetup.invokeFirefox();
		return driver;	
	}

}

