package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question14 {
public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.swiggy.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.xpath("//a[text()='Sign in']")).click();
				
				d.findElement(By.id("mobile")).sendKeys("454646446464");
				
				d.findElement(By.xpath("//a[text()='Login']")).click();
				
				d.findElement(By.id("name")).sendKeys("mkp");
				
				d.findElement(By.id("email")).sendKeys("dasdasdasdasdasd@gamil.com");
				
				d.findElement(By.xpath("//a[text()='CONTINUE']")).click();
				
}
	
	

}
