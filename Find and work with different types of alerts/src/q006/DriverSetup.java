package q006;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverSetup 
{
	
	public static WebDriver driver;
	public static Scanner n;

	public static WebDriver invokeChrome() throws InterruptedException, IOException
	{

	System.setProperty("webdriver.chrome.driver","C:\\Users\\mypc\\Downloads\\softwares\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");//disable the notifications
	driver=new ChromeDriver(options);
	//opening the website in particular browser
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//this is a wait function which gives enough time to load all pages
	driver.manage().window().maximize();// Maximize the window
	System.out.println("--Invoking in Chrome --");
	return driver;
	}

	public static WebDriver invokeFirefox() throws InterruptedException, IOException
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\mypc\\Downloads\\softwares\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	FirefoxOptions options = new FirefoxOptions();
	options.addArguments("--disable-notifications");
	driver=new FirefoxDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	System.out.println("--Invoking in FireFox --");
	return driver;
	}
	 
}




