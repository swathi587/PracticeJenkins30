package com.crm.PRACTICE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAm {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	String url = "https://www.flipkart.com/sunglasses/pr?sid=26x&marketplace";
	driver.get(url);
	String xpath ="//div[.='₹114']/ancestor::div[1]/../../div[1]";
			WebElement ele = driver.findElement(By.xpath(xpath));
	System.out.println(ele.getText());
}
}
