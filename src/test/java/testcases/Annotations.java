package testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;;

@Test
public class Annotations {
	
	String expected_title ="gmail.com";
	
	String actual_title;
	
	public void validateTitles() {
		
		WebDriverManager.chromedriver().setup();
		
		System.out.println("launching browser"); 
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
	      String expectedTitle = "Gmail";
	      
	      Assert.assertEquals(actualTitle, expectedTitle);
	      driver.close();
		
		/*WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		actual_title = driver.getTitle();
		System.out.println();*/
			
			
	}
}
	
