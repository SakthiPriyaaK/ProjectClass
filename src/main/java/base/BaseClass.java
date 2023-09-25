package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void Chrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void Url(String url) {
		driver.get(url);
	}
	
	public static void Wait() {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	public static void Maxi() {
		driver.manage().window().maximize();
	}
	
	public static void SendKeys(WebElement w, String s) {
		w.sendKeys(s);
	}

	public static void Drclick(WebElement w) {
		w.click();
	}
	
	public static void Back() {
		driver.navigate().back();
	}
	
	public static void Refresh() {
		driver.navigate().refresh();
	}
	
	}
