package com.selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertExp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.msedgedriver.driver", "D:\\WebDriver\\edge\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.get("http://uitestpractice.com/Students/Actions");
		WebElement oneClick = driver.findElement(By.xpath("//button[@name='click']"));
		oneClick.click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		Actions action = new Actions(driver);

		WebElement doubleclick = driver.findElement(By.xpath("//button[@name='dblClick']"));
		action.doubleClick(doubleclick).perform();
		alert.accept();

		Thread.sleep(3000);

		WebElement dragFrom = driver.findElement(By.xpath("//p[.='Drag me to my target']"));

		WebElement dropTo = driver.findElement(By.xpath("//p[.='Drop here']"));
		
		action.dragAndDrop(dragFrom, dropTo).perform();
		
		Thread.sleep(2000);
		

		WebElement dropTo1 = driver.findElement(By.xpath("//div[@id='div2']"));
		
		action.dragAndDrop(dragFrom, dropTo1).perform();
		
		
		

	}

	public void accept() {
		// TODO Auto-generated method stub
		
	}

}
