package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWinHandle_sDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\All Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://crio-qkart-frontend-qa.vercel.app/");
		
		driver.findElement(By.linkText("Privacy policy")).click();
		String parentWinId = driver.getWindowHandle();
		//System.out.println(parentWinId);
		
		Set<String> bothWinIds = driver.getWindowHandles();
		
		Iterator<String> Ids = bothWinIds.iterator();
//		while (id.hasNext()) {
//			
//			String uniqueId = id.next();
//			
//			System.out.println(uniqueId);
//		}
		
		if(!parentWinId.equals(Ids)) {
			
			String uniqueId = Ids.next();
			
				driver.switchTo().window(uniqueId);
				driver.findElement(By.xpath("//a[normalize-space()='https://www.crio.do']")).click();
			}
			
		
		}
	}


