package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question10 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://adactinhotelapp.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
				d.findElement(By.id("username")).sendKeys("mukesh");
				
				d.findElement(By.id("password")).sendKeys("13123");
				
	
	
}
}
