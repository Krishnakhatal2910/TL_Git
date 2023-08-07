package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	private static final Cookie Cookie = null;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\All Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver=new FirefoxDriver();
//		driver=new InternetExplorerDriver();
//		driver=new EdgeDriver();

		driver.get("https://www.ibm.com/topics/networking");
		String gglTitle = driver.getTitle();
		System.out.println(gglTitle);
		
		String gogleUrl = driver.getCurrentUrl();
		System.out.println(gogleUrl);
		Thread.sleep(3000);
		
		String gglPageSource = driver.getPageSource();
		//System.out.println(gglPageSource);
		
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
		
		
		
//		Cookie mycookie =new Cookie( "Mycookie", "kishormarkad2511@gmail.com");
//		driver.manage().addCookie(mycookie);
//		
//		driver.manage().deleteCookie(mycookie);
//		
//		driver.manage().deleteAllCookies();
//		
//		Set<Cookie> cookie = driver.manage().getCookies();
//		
//		Iterator<Cookie> cookee = cookie.iterator();
//		while(cookee.hasNext()) {
//			Cookie cokkee = cookee.next();
//			System.out.println(cokkee);
//		}
		
		
		
		//driver.switchTo().newWindow(WindowType.TAB);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		Thread.sleep(3000);
//		driver.navigate().to("https://en-gb.facebook.com/");
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
		
		
		
		
//		String fbTitle = driver.getTitle();
//		System.out.println(fbTitle);
//		
//		String fbUrl = driver.getCurrentUrl();
//		System.out.println(fbUrl);
		
		Thread.sleep(3000);
		//driver.close();
		driver.quit();
		
		
	}

}
