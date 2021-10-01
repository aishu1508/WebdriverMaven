package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {
	
	static SoftAssert softAssertion= new SoftAssert();
	
	@Test
	public static void ValidateCheckBox(String expected_title,String actual_title) {
		
		//Assert.assertEquals(actual_title, expected_title);
		
		
		
		
		
		System.out.println("Actual "+actual_title);
		softAssertion.assertEquals(actual_title, expected_title);
		
		
	}
	
	
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	
	driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
	
	for(int i=1;i<=4;i++) {
		System.out.println("Inside for "+i);
		//driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
	ValidateCheckBox(driver.findElement(By.xpath("//div[4]/input["+i+"]")).toString(),"X");
			
	softAssertion.assertAll();		
		}
		
	}
	
	
	
	}
