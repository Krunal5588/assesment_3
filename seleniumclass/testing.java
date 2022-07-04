package com.mindtree.seleniumclass;

import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//li[@cid='8']"))).build().perform();
		
		WebDriverWait wd=new WebDriverWait(driver, 30);
		wd.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Income Tax Calculator']")));
		driver.findElement(By.xpath("//a[@title='Income Tax Calculator']")).click();
		
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid checked']")).click();
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid']")).click();
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("18");
		
		Select s=new Select(driver.findElement(By.xpath("//select[@class='custselect']")));
		s.selectByVisibleText("Stay in Non Metro city");
		
		driver.findElement(By.xpath("//a[@class='btn_common nextfrm MR10 calculateTax']")).click();
		driver.findElement(By.xpath("//input[@id='annual_salary']")).sendKeys("15000");
		driver.findElement(By.xpath("//input[@id='other_income']")).sendKeys("15000");
		driver.findElement(By.xpath("//a[@id='income_tab_next']")).click();
		
		

	}

}
