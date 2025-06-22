package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question5 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://greenstech.in/selenium-course-content.html");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.id("heading20")).click();
				
				d.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();
				
				
				
				
				
				
}

}
