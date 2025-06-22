package org.daytwo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question7 {

	public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.snapdeal.com/login");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

				
				WebElement user = d.findElement(By.id("userName"));
				user.sendKeys("mukesh");
	}
}
