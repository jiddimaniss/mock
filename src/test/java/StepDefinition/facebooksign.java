package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class facebooksign {
	
	WebDriver driver;
	
	@When("user open a url")
	public void user_open_a_url() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	   
	}

	@Then("enter login creadtinals")
	public void enter_login_creadtinals(DataTable dataTable) throws InterruptedException {
		
		List<List<String>> data=dataTable.cells();
	
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("pass")).sendKeys(data.get(0).get(1));
		Thread.sleep(2000);
	  
	}

	@And("click on create new button")
	public void click_on_create_new_button() throws InterruptedException {
	   
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
	}

	@Then("enter the signup information")
	public void enter_the_signup_information(DataTable dataTable) throws InterruptedException {
		List<List<String>> data1= dataTable.cells();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(data1.get(0).get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(data1.get(1).get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(data1.get(2).get(1));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(data1.get(3).get(1));
		Thread.sleep(2000);
		
		driver.close();
	    
	}

}
