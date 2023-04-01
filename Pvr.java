package com.selenium.programs;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Pvr {
	public static void main ( String[] args) {
	System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.ticketnew.com");
	driver.findElement (By.xpath("//.['input']")).click();
	driver.findElement( By.xpath("div\\[@ class=\"movie-image tn-entity-image\"]")).click();
	driver.findElement(null)
	
	 
	
	
	
	
	
	
	
	}

}
