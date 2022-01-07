package week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) 
	{
		// open the browser 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("https://en-gb.facebook.com/");
		// maximize the website
		driver.manage().window().maximize();
		// add the implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// click the create new account button
		driver.findElement(By.xpath("//a[@role='button'])[2]")).click();
		// enter first name 
		driver.findElement(By.xpath("//@input[@name='firstname']")).sendKeys("sabashini");
		//enter last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Srini");
		// mail id type
		driver.findElement(By.xpath("//input[@type='text'])[4]")).sendKeys("ela@gmail.com");
		//enter mobile number
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("s");
		//enter dob
		 WebElement dateofbirth = driver.findElement(By.id("day"));
		Select dd = new Select(dateofbirth);
		dd.selectByVisibleText("5");
		// enter month in dob	
        WebElement month = driver.findElement(By.id("month"));
		Select dd1= new Select(month);
		dd1.selectByVisibleText("September");
        WebElement year = driver.findElement(By.id("year"));
		Select dd2 = new Select(year);
		dd2.selectByVisibleText("1995");
		// click female 
		driver.findElement(By.xpath("//input[@name='Female']"));
		driver.findElement(By.name("webSubmit")).click();    
		
		
	}
}
