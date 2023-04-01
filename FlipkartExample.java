package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartExample {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
		
		
		
//		ChromeOptions co = new ChromeOptions();
//		
//		co.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	 	
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9600921011");
		Thread.sleep(4000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath( "//button[@class='_2KpZ6l _2doB4z']")).click();
         Thread.sleep(1000);
		 driver.findElement(By.xpath( "//input[@class='_3704LK']")).sendKeys("mobile",Keys.ENTER);
	}
         

	
	
	

}
