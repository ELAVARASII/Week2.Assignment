package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deleteleads {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	   WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
           driver.findElement(By.id("password")).sendKeys("crmsfa");
           driver.findElement(By.className("decorativeSubmit")).click();
           driver.findElement(By.linkText("CRM/SFA")).click();
           driver.findElement(By.linkText("Leads")).click();
           //driver.findElement(By.linkText("Create Lead")).click();
           // click find leads 
	       driver.findElement(By.linkText("Find Leads")).click();
	       
	       driver.findElement(By.xpath("//span[text()='Phone']")).click();
	       driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Thanjavur");
	   
	     //click find leads button
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       

	}	

	}