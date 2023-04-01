package com.selenium.programs;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class homeworkjunitflipkart {
	
	WebDriver driver;

	@Before
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	}




@Test
public void testCase() throws InterruptedException, Throwable {
driver.findElement(By.xpath("span//[.='Hello, sign in']")).click();
//driver.findElement(By.xpath("a//[@id='createAccountSubmit']")).sendKeys( "9176863962");







}

}

	


