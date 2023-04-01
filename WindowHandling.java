package com.selenium.programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class WindowHandling {
	public static void main ( String[] args) {
		
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Switchto");
		String parent= driver.getWindowHandle();
		driver.findElement(By.xpath("//.[.='Opens in a new window']")).click();
		Set<String> children = driver.getWindowHandles();
		Iterator<String>childs=children.iterator();
		while(childs.hasNext()) {
			String cw= childs.next();
			if( cw!= parent) {
				driver.switchTo().window(cw);
				
		driver.findElement( By.xpath ());
				
			}
			
		}
		
		
		
	
		
		
		
	}

}
