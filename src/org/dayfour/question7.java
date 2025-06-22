package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question7 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://www.google.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.name("q")).sendKeys("greens velmurugan",Keys.ENTER);
				
				Thread.sleep(5000);
				
				d.findElement(By.xpath("//h3[text()='Velmurugan Rengasamy - Assistant Manager - Greens india']")).click();
				
				
}
	
}
