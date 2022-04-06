package com.crm.PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XpathPractice 
{
@Test
public void xpath()
{
WebDriver driver=new FirefoxDriver();
driver.get("https://www.amazon.in/s?k=watch+Timex&crid=TQ7DEG7BC4UL&sprefix=watch+timex%2Caps%2C233&ref=nb_sb_noss");
String xpath = "//span[contains(text(),'Small')]/ancestor::div[1]/following-sibling::div/descendant::span[@class='a-price-whole']";
String price = driver.findElement(By.xpath(xpath)).getText();
System.out.println(price);
}
}
