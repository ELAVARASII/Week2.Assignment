package week2day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginn {


	 public static void main(String[] args) {
	
		  WebDriverManager.chromedriver().setup();
	        ChromeDriver driver =new ChromeDriver();
	        driver.get("http://leaftaps.com/opentaps/control/main");
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");    
	        driver.findElement(By.id("password")).sendKeys("crmsfa");
	        driver.findElement(By.className("DecorativeSubmit")).click();
	        driver.findElement(By.linkText("CRM/SFA")).click();
	        driver.findElement(By.linkText("Contacts")).click();
	        driver.findElement(By.linkText("Create Contacts")).click();
	        driver.findElement(By.id("firstNameField")).sendKeys("Elavarasi");  
	        driver.findElement(By.id("lastNameField")).sendKeys("Palanivel");
	        WebElement drop = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
	        Select dropdown = new Select(drop);
	        dropdown.selectByVisibleText("India");
	        driver.findElement(By.id("createContactForm_birthDate")).sendKeys("20/10/21");
	        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("elavarasipinnai01@gmail.com");
	        driver.findElement(By.id("generalToNameField")).sendKeys("Palanivel");
	        driver.findElement(By.id("createContactForm_generalAddress1")).sendKeys("557,siruSaluvarStreet");
	        driver.findElement(By.id("createContactForm_generalCity")).sendKeys("Thanjavur");
	        driver.findElement(By.id("createContactForm_generalPostCode")).sendKeys("614902");
	        WebElement pick = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	        Select pickup = new Select(pick);
	        int size = pickup.getOptions().size();
	        pickup.selectByIndex(size-5);
	        
	        
	        driver.findElement(By.className("smallSubmit")).click();
	        
	         
	        
	        
	        
	        
		
		 
		 }
	 
	 

}
