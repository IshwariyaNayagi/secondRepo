package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class BookTicket{

		
public static void main(String[] args) throws InterruptedException {
			
		
		   System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");

		 	
			WebDriver driver = new EdgeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.irctc.co.in/nget/profile/user-registration");
			driver.findElement(By.xpath( " span//[.='Basic Details']")).click();
			driver.findElement(By.xpath(" input//[.@='ngcontent-ill-c109']")).sendKeys("harshad");
			
			
			


}
}