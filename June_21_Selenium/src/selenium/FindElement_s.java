package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.AstSorter;

public class FindElement_s {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\All Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://web-locators-static-site-qa.vercel.app/Checkbox");
		driver.manage().window().maximize();
		
//		WebElement female = driver.findElement(By.name("gender1"));
//		female.click();
//		System.out.println(female.isSelected());
		
		WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='Checkbox_section1']//div[1]//div[1]//div[1]//span[1]//input[1]"));
		checkbox1.click();
		Thread.sleep(2000);
		System.out.println(checkbox1.isSelected());
//		WebElement radio3 = driver.findElement(By.className("jss5"));
//		System.out.println(radio3.isEnabled());
//		System.out.println(female.isDisplayed());
//		WebElement yesRadio = driver.findElement(By.xpath("//span[@class='MuiIconButton-label']/input[@value='yes']"));
//		System.out.println(yesRadio.isDisplayed());
//		WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
//		System.out.println(loginBtn.isDisplayed());
		
		
		
		
	}

}
