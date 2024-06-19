package Registration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration_1 {
	WebDriver driver;
	@BeforeTest(alwaysRun = true)
	public void setup() throws InterruptedException   {
		WebDriverManager.chromedriver().setup();
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		
		    driver = new ChromeDriver();
			
			
			driver.manage().window().maximize();
			
			driver.get("https://www.swiggy.com/");
			Thread.sleep(2000);
			
			
}
	@Test ( priority = 1)
	public void signup() throws InterruptedException {
		driver.findElement(By.xpath("//span[normalize-space()='Sign In']")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3p4qh'] ")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8104433519");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("varsha");        
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("varsha31889@gmail.com");    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='a-ayg']")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3p4qh']")).click();
		
	}

	@Test ( priority = 2)
	public void login () throws InterruptedException{
		
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8104433519");  
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath(" //span[@class='_22fFW icon-close-thin']")).click();
//      driver.findElement( By.xpath("//input[@id='otp']")).sendKeys("1111");
//      driver.findElement( By.xpath("//a[@class='a-ayg']")).click();
    //  driver.findElement( By.xpath("//span[@class='_22fFW icon-back']")).click();
      
   

	}

	@Test ( priority = 3)
	public void search_product() {
	driver.findElement( By.xpath("//span[normalize-space()='Search']")).click();
	
	//driver.findElement( By.xpath("//input[@placeholder='Search for restaurants and food']")).sendKeys("Rice");
	driver.findElement( By.xpath("//a[@href='/offers-near-me']")).click();
	driver.findElement( By.xpath("//button[@class='sc-bZHTEL iSWTZt SearchButton__TextButtonWrapper-sc-1mcb89o-1 gWyvvj']")).sendKeys("rice");
	
	
	
	        
	}

//	
//	@Test ( priority = 3)
//	public void check_out() {
//		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click(); // Select a product
//        driver.findElement(By.xpath("//a[@class='_9Wy27C']")).click();
//        driver.findElement(By.xpath("//button[@class='QqFHMw zA2EfJ _7Pd1Fp']")).click();
//        
//        driver.findElement(By.id("checkout-button")).click();
//
//        driver.findElement(By.id("shipping-address")).sendKeys("123 Test St, Test City, TX");
//        driver.findElement(By.id("payment-method")).sendKeys("Credit Card");
//        driver.findElement(By.id("place-order")).click();
//	}
	
}
	
