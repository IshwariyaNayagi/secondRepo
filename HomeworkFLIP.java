
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

	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;






	public class HomeworkFlIP {
		WebDriver driver;

		@Before
		public void openBrowser() throws InterruptedException {
			System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/gmail/about/");
		}			

}
