package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class question7 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.cleartrip.com/trains");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chennai");
				d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("villupuram");
				
				d.findElement(By.id("trainFormButton")).click();
				
				
}
	

}
