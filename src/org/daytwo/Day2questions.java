package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2questions {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
		
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email = d.findElement(By.id("email"));
		email.sendKeys("lufffyyy");
		
		WebElement pass = d.findElement(By.id("pass"));
		pass.sendKeys("12434");
		
		
		
		
		
	}

}
