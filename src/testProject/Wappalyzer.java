package testProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Wappalyzer {

	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.wappalyzer.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void testing()
	{
		
		driver.findElement(By.xpath("//span[contains(text(),'Resources')]")).click();
		driver.findElement(By.xpath("//div[@class='v-list-item__title subtitle-2' and contains(text(),'Technologies')]")).click();
		driver.findElement(By.partialLinkText("Shopify")).click();
		driver.findElement(By.partialLinkText("Create a lead list")).click();
		Boolean textPresnt = driver.findElement(By.xpath("//label[text()='Technology must be present on homepage']")).isDisplayed();
		if(!textPresnt)
		{
			driver.findElement(By.xpath("//span[text()='Technologies']")).click();
		}
			
	}

}
