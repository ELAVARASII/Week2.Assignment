package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) 
	{
		// open the browser 
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// maximize the website
		driver.manage().window().maximize();
			// username 
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click login button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// click crm/sfa
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click contact tab
		
		driver.findElement(By.linkText("Contacts")).click();
		// click create contact
		
		driver.findElement(By.linkText("Create Contact")).click();
		
		//type firstname 
		
		WebElement fname = driver.findElement(By.id("firstNameField"));
				fname.sendKeys("Elavarasi");
				String firstname = fname.getAttribute("value");
		System.out.println("first name =" +firstname);
		
		
		// type lastname
		
		driver.findElement(By.id("lastNameField")).sendKeys("Palanivel");
		
		// click create contact button
		
		driver.findElement(By.name("submitButton")).click();
		// print the  title 
		 
		String title = driver.getTitle();
		System.out.println("Title is ="+title);
		// close the browser
		
		driver.close();
		
		
		
		
		
		
		
	}

}