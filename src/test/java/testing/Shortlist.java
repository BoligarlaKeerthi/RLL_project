package testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Shortlist {
	WebDriver driver;
	
@Test
	public void ShortListpage() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[text()=\" Toys\"]")).click();
	 WebElement e1 = driver.findElement(By.xpath("(//div[@class=\"lblock lft\"])[1]"));
	 WebElement e2=driver.findElement(By.xpath("(//div[@class=\"lblock lft\"])[2]"));
	 WebElement e3=driver.findElement(By.xpath("(//div[@class=\"lblock lft\"])[3]"));
		 Actions actions=new Actions(driver);
		  actions.moveToElement(e1).build().perform();
		  Thread.sleep(5000);
	driver.findElement(By.xpath("(//a[@class=\"R14_42\"])[1]")).click();
	Thread.sleep(1000);
	/* actions.moveToElement(e2).build().perform();
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("(//a[@class=\"R14_42\"])[2]")).click();
	  
	  Thread.sleep(1000);
		 actions.moveToElement(e3).build().perform();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("(//a[@class=\"R14_42\"])[3]")).click();
	*/	  
	 driver.findElement(By.xpath("//li[@class=\"cl_pa act_bg\"]")).click();
	 
	}
}


//(//a[text()='Shortlist'])[2])
