package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	
	WebDriver driver;
	@Given("The end user launch the url")
	public void the_end_user_launch_the_url() {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		

	}
	
	@Then("user send the mail in username field")
	public void user_send_the_mail_in_username_field() {
		
		driver.findElement(By.id("userid")).sendKeys("HJU458");
		
		
	  
	}
	
	@Then("after user send password in password field")
	public void after_user_send_password_in_password_field() {
		
		driver.findElement(By.id("password")).sendKeys("abc456");


	}
	
	@Then("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		
		
     driver.findElement(By.xpath("//button[@type='submit']")).click();
     
    
    
     Thread.sleep(2000);
     driver.quit();
     
	
	}

	

	
}







