package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question9 {
public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.flipkart.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.xpath("//span[text()='Login']")).click();
				
				d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("78797897987");
				
				
				
}
	
	
}
