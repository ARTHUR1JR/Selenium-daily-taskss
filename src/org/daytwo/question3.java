package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question3 {

   public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.google.com/");
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search = d.findElement(By.name("q"));
		search.sendKeys("GreensTechnology",Keys.ENTER);
		
		
		
		
	}

}
