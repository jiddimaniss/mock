package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scanario_outline_exmpale {
	
	WebDriver driver;
	@Given("user open the website")
	public void user_open_the_website() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	    driver.get("https://example.testproject.io/web/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Then("user enter the {string} & {string}")
	public void user_enter(String Username, String Password) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(Username);    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	}
	

	@Then("user verify the Title")
	public void user_verify_the_title() {
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
	    
	}

	@Then("user enter {string} & {string}& {string}")
	public void user_enter(String Adderss, String Email, String Phone) throws InterruptedException {
	    
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys(Adderss);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(Email);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(Phone);
	//	Thread.sleep(1000);
	//	driver.findElement(By.xpath("//button[@id='save']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
