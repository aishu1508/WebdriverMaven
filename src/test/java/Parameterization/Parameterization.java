package Parameterization;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Setup\\chromedriver_win32.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
	}




	@Test(dataProvider = "LoginData")
	public void LoginTest(String username, String pwd,String Result) {
		
		System.out.println(username+pwd+Result);
		driver.get("https://login.yahoo.com/?.intl=us");
		WebElement email = driver.findElement(By.id("login-username"));
		email.clear();
		email.sendKeys(username);
		
		driver.findElement(By.id("login-signin")).click();
		WebElement Password = driver.findElement(By.id("login-passwd"));
		Password.clear();
		Password.sendKeys(pwd);
		driver.findElement(By.id("login-signin")).click();
		
		String act_title = driver.getTitle();
		String exp_title ="Yahoo Search - Web Search";
		System.out.println(act_title);
		
		if(Result.equals("Valid")) {
			
			if(exp_title.equals(act_title)) {
				
				Assert.assertTrue(true);
				
			}
			else {
				
				Assert.assertTrue(false);
			}
				
			
		}
		else if(Result.equals("Invalid")) {
			
			if(exp_title.equals(act_title)) {
				
				Assert.assertTrue(false);
				
			}
			else {
				
				Assert.assertTrue(true);
			}
			
			
			
		}
			
		
	}
	
	@DataProvider(name = "LoginData")
	public static String[][] getData(){
			
		/*String LoginData[][]= {
				{"j.aiswarya@yahoo.com","Learn#123","Valid"},
				{"j.aiswarya@yahoo.com","Learn#123","Invalid"},
				{"j.aiswarya@yahoo.com","Learn#12","Invalid"},
				

				
		                      };*/
		
		
		File f = new File("C:\\Users\\19016\\Documents\\Selenium\\LoginTest.xlsx");
		
		ReadExcel xl = new ReadExcel();
		System.out.println(user1 +" " +pwd1+" "+flag1);
		
		return LoginData;
	
		
		
		
	}
	
	@AfterTest
	public void tearDown() {
	driver.close();
	
	}
	

}
