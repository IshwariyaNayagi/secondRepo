package com.selenium.programs;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class UsingJunit {
	WebDriver driver;

	@Before
	public void openBrowser() throws InterruptedException {
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}

	@Test
	public void testCase() throws InterruptedException {

		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Aishwariya", Keys.ENTER);
		Thread.sleep(2000);
	}

	@Test
	public void test1() throws IOException, InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("Aishwariya", Keys.ENTER);
		Thread.sleep(2000);
		File screenShot1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy((screenShot1), new File("D:\\Selenium image\\junit.jpg"));
		Thread.sleep(2000);
	}

	@After
	public void closeBrowser() {
		driver.close();

	}

}
