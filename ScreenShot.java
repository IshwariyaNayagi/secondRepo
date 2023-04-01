package com.selenium.programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	public static void main( String []args) throws IOException {
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");



		TakesScreenshot driver;
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ ");
		File screenShot=((TakesScreenshot)driver).getScreenshotAs( OutputType.FILE);
		Files.copy(( screenShot),new File("D:\\Selenium image\\goog.jpg"));
		
		
		driver.get( "https://www.google.co.in/");
		
		
		
	}

}