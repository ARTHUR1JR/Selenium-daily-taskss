package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question2 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.facebook.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.id("email")).sendKeys("mukasdsad");
				
				d.findElement(By.id("pass")).sendKeys("123123");
				
				
				d.findElement(By.xpath("//button[@type='submit']")).click();
				
				
				
				









}
	

}
