package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ecommerce {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_v123.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.amazon.in/");
		dr.manage().window().maximize();
		
		WebElement button = dr.findElement(By.xpath("//span[normalize-space()='Account & Lists']//span[@class='nav-icon nav-arrow']"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(10));
      
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='createAccountSubmit']")));
            element.click();
        
        WebElement name = dr.findElement(By.xpath("//input[@id='ap_customer_name']"));
        name.sendKeys("pavani");
        
        WebElement mobile = dr.findElement(By.xpath("//input[@id='ap_phone_number']"));
        mobile.sendKeys("9100459343");
        
        WebElement pass = dr.findElement(By.xpath("//input[@id='ap_password']"));
        pass.sendKeys("pavani@123456");
        
        WebElement verify = dr.findElement(By.xpath("//input[@id='continue']"));
        verify.click();
        
        
        WebElement otp=dr.findElement(By.xpath("//*[@id=\"auth-pv-enter-code\"]"));
        otp.sendKeys("769960");
		
        WebElement create = dr.findElement(By.xpath("//*[@id=\"auth-verify-button\"]"));
        create.click();
        
		
		
	}

}
