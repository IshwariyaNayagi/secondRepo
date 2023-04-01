package com.selenium.programs;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchTO {
	public static void main( String[]args) throws InterruptedException   {
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get( "http://uitestpractice.com/Students/Switchto");
		Thread.sleep(2000);
		WebElement alt=driver.findElement(By.xpath("//button[ id='alert']"));
		alt.click();
		AlertExp alert= driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		WebElement confirm= driver.findElement( By.xpath("//button[@id='confirm']"));
		confirm.click();
		alert.accept();
		Thread.sleep(2000);
		// webElement prompt= driver.findElement( by.xpath('//.button[id='prompt']"));need to check
	    // alert .accept();
		
		
		 
		
		
		
		
		
		
	}

}
