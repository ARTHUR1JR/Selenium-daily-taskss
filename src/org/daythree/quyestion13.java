package org.daythree;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quyestion13 {

public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.xpath("//input[@type='tel']")).sendKeys("4654646645");
				
				d.findElement(By.xpath("//input[@type='checkbox']")).click();
				
				d.findElement(By.xpath("//div[text()='CONTINUE']")).click();
				
				
				
}
	
	 

}
