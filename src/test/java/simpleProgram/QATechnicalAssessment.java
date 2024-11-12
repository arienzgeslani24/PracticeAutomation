package simpleProgram;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*
 * Testcase
 * --------
 * 
 * 1)Launch browser (edge)
 * 2)Open URL https://practicetestautomation.com/practice-test-login
 * 3)Enter username
 * 4)Enter password
 * 5)Click Submit button
 * 6)Validate title should be "Logged In Successfully | Practice Test Automation"
 * 7)Close Browser
 */

public class QATechnicalAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1)Launch browser (edge)
		WebDriver driver = new EdgeDriver();

		// 2)Open URL https://practicetestautomation.com/practice-test-login
		driver.get("https://practicetestautomation.com/practice-test-login");

		// 3)Enter username
		driver.findElement(By.xpath("//INPUT[@id=\"username\"]")).sendKeys("student");

		// 4)Enter password
		driver.findElement(By.xpath("//INPUT[@id=\"password\"]")).sendKeys("Password123");

		// 5)Click Submit button
		driver.findElement(By.xpath("//BUTTON[@id=\"submit\"]")).click();

		// 6)Validate title should be "Logged In Successfully | Practice Test Automation"

		String actual_title = driver.getTitle();

		if (actual_title.equals("Logged In Successfully | Practice Test Automation")) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test Failed");

		}

		// 7)Close Browser
		driver.quit();
	}

}
