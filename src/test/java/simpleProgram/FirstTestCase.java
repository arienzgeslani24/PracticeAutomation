package simpleProgram;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;
/*
 * Testcase
 * --------
 * 
 * 1)Launch browser (chrome)
 * 2)Open URL https://demo.opencart.com/
 * 3)Validate title should be "Your Store"
 * 4)Close Browser
 */


public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//1)Launch browser (chrome)
		
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new EdgeDriver();
		
	//2)Open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
	//3)Validate title should be "Your Store"
		
		String actual_title = driver.getTitle();
		
		if(actual_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Test Failed");

		}
		
	//4)Close Browser
		driver.quit();
	}

}
