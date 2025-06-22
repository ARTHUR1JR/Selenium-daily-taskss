package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question10 {
public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.amazon.in/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//d.findElement(By.xpath("//button[@type='submit']")).click();
				
				d.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
				
				
				d.findElement(By.xpath("//input[@type='submit']")).click();
				
				
				
}
	
	
}
