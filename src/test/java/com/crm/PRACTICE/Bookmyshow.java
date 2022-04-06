package com.crm.PRACTICE;

import java.rmi.activation.ActivationGroup_Stub;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Bookmyshow
{
	@Test
	public void book()
	{
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		
WebDriver driver = new ChromeDriver(ch);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://in.bookmyshow.com/");


//driver.findElement(By.xpath("//button[@class='Sign me Up!']")).click();
//driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
driver.findElement(By.xpath("//img[@alt='BANG']")).click();
//driver.switchTo().alert().accept();
String EVENT = "James";
driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
driver.findElement(By.xpath("//input[@class='sc-jWojfa eTcNgn']")).sendKeys(EVENT);
driver.findElement(By.xpath("//div[@class='sc-dBAPYN fNooxK']")).click();
driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
driver.findElement(By.xpath("//div[@class='date-day']")).click();
driver.findElement(By.xpath("//a[text()='Eshwari Digital 4K Cinema: Banashankari']")).click();
//driver.findElement(By.xpath("//div[@class='dropdown selected_filter']")).click();

//driver.findElement(By.xpath("//div[text()='Select Show Timings']")).click();;
//Select s=new Select(ele);
//s.selectByVisibleText("12:00-11:59 AM");
// List<WebElement> list = driver.findElements(By.xpath("//li[@class='showtime showtimes_checkbox']//input"));
//System.out.println("Size -->"+list.size());

/*List<WebElement> list=driver.findElements(By.xpath("//div[@class='__text']/ancestor::a[@class='showtime-pill time_vrcenter data-enabled']"));
System.out.println("Size -->"+list.size());
for(WebElement listitem : list)
{
if(listitem.getText().contains("							06:00 PM					"))	
{
listitem.click();
break;
}.
}*/

driver.findElement(By.xpath("//div[@class='__text']/ancestor::a[@class='showtime-pill time_vrcenter data-enabled']")).click();
driver.findElement(By.xpath("//div[text()='Accept']")).click();

driver.findElement(By.xpath("//li[@id='pop_1']")).click();
driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
List<WebElement> list=driver.findElements(By.xpath("//a[@class='_available']/ancestor::td[@class='SRow1']"));
System.out.println("Size -->"+list.size());

driver.findElement(By.xpath("//div[@id='A_1_0225']")).click();
driver.findElement(By.xpath("//a[text()='Pay ']")).click();

/*for(WebElement listitem : list)
{
if(listitem.getText().contains("9"))	
{
listitem.click();
break;
}
}*/

//driver.close();
	}
}
