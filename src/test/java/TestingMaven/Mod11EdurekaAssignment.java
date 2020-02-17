package TestingMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod11EdurekaAssignment {

	public static void main(String[] args) throws InterruptedException {
		/*Create a maven project to upload your photo on edureka portal using maven frameworks.
		 * Configure the same with Jenkins to run the test every day. 
		 * Steps:Create a Maven project
		 *  and perform the below steps:
		 *  1.Launch edureka portal on the browser.
		 *  2.Login with the credentials 
		 *  3.Navigate to edit profile page
		 *  4.Edit uploading photo button
		 *  5.Integrate with jenkins to rerun the testcase daily
		 *  Note:Make sure that you are logged out of Edureka’s website while performing this practical
		 */

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]") ).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("si_popup_email")).sendKeys("vinitbassi@gmail.com");

		driver.findElement(By.id("si_popup_passwd")).sendKeys("India15Great");

		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		// edit profile
		driver.findElement(By.xpath("(//button[@class=\"dropdown-toggle\"])[5]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[@role=\"menuitem\"]//a[text()='My Profile']")).click();
		
		// upload photo
		//close the browser
		driver.close();
	}

}
