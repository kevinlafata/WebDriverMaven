package seleniumlabs.webdriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebDriverTests {

	private static void dumpCookies(Set<Cookie> c) {
		for ( Cookie t : c) {
			System.out.println( t.getName() + " = " + t.getValue());
		}
	}
	@Test()
	public static void testWebDriver() throws InterruptedException, MalformedURLException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://puppies.herokuapp.com/");        
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		
		Set<Cookie> cookies = driver.manage().getCookies();
		dumpCookies(cookies);
		
		driver.manage().addCookie( new Cookie("joe", "blow"));
		driver.findElement(By.name("dkkdj3j3j3"));

		cookies = driver.manage().getCookies();
		dumpCookies(cookies);
		
		driver.manage().deleteCookieNamed("joe");

		cookies = driver.manage().getCookies();
		dumpCookies(cookies);

		driver.navigate().to("http://www.thetestroom.com/webapp/");
		
		driver.navigate().to(new URL("http://newtours.demoaut.com"));
		
		driver.navigate().back();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().back();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		driver.navigate().forward();
		System.out.println("Displaying page " + driver.getTitle() + driver.getCurrentUrl());
		Thread.sleep(1000);

		Thread.sleep(5000);
		driver.quit();

	}

}
