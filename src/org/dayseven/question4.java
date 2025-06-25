package org.dayseven;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question4 {
	public static void main(String[] args) throws IOException  {
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.greenstechnologys.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		TakesScreenshot t = (TakesScreenshot)d;
		JavascriptExecutor j =(JavascriptExecutor)d;	
		
		
		WebElement down = d.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
		j.executeScript("arguments[0].scrollIntoView(true)", down);
		
		
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File ("C:\\Project\\Selenium-daily-taskss\\src\\org\\dayseven\\q4 .jpg");
		FileUtils.copyFile(src, des);
		
		
		
		
}}






