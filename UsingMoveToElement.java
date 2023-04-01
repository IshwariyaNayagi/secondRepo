package com.selenium.programs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMoveToElement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();// close popup
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//div[.='Electronics']"));
		Actions action = new Actions(driver);
	    action.moveToElement(ele).perform();
		
		
	}
}