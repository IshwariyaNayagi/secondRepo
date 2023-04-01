package com.selenium.programs;


	
	import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	
public class W3Schools{

	public static void main ( String[] args) {
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		String parent=driver.getWindowHandle();
		driver.findElement (By.xpath("//a[@href=\"/html/tryit.asp?filename=tryhtml_default_default\"]")).click();
		Set< String>children= driver.getWindowHandles();
		Iterator< String>childs= children.iterator();
		while( childs.hasNext()) {
			String cw= childs.next();
			if( cw!= parent) {
				driver.switchTo().window(childs.next());
				
				driver.findElement(By.xpath("//a[@href=\"https://www.w3schools.com/spaces/\"]")).click();
				driver.close();
			}
			
		}
		
		
	}

}
