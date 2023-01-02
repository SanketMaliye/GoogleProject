package Google_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_VerifyText {

	@Test
	public void VerificationText() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String name="Gmail";
		
		String text=driver.findElement(By.xpath("//a[text()=\"Gmail\"]")).getText();
		if(name.equals(text))
		{
			System.out.println("Test Pass.");
		}
		else {
			System.out.println("Test Fail.");
		}
		Thread.sleep(7000);
		driver.quit();
	}
}
