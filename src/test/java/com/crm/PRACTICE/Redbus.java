package com.crm.PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Redbus {
	@Test
	public void red()
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
WebDriver driver = new ChromeDriver(ch);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bengaluru");
		//driver.findElement(By.xpath("//li[@class='sub-city']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Shimoga");
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		
		driver.findElement(By.xpath("//span[@class='fl icon-calendar_icon-new icon-onward-calendar icon']")).click();
		driver.findElement(By.xpath("//td[@class='current day']")).click();
		
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		//WebElement close = driver.findElement(By.xpath("//div[@class='overlay-container']/div[1][@class='close']"));
		driver.findElement(By.xpath("//i[@class='icon icon-close c-fs']")).click();
		Actions action =new Actions(driver);
		//action.moveToElement(close).click().perform();*/
		//action.moveByOffset(1289, 536).click().perform();
		driver.findElement(By.xpath("//div[text()='View Seats']")).click();
		
		WebElement can = driver.findElements(By.tagName("canvas")).get(0);
		action.moveToElement(can).click().perform();
		System.out.println(can.getSize());
		System.out.println(can.getLocation());
		
		Dimension can_dimen = can.getSize();
		int cany = can_dimen.getHeight()/2;
		int canx = can_dimen.getWidth()/2;
		int seat = (cany/5)*3;
		int seat1 = (canx/3)*3;
		
		action.moveByOffset(seat, seat1).click().perform();
	}

}
