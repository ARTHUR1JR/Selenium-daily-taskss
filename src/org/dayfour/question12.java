package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question12 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.shopclues.com/wholesale.html");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.id("autocomplete")).sendKeys("Samsung mobile");
				
				d.findElement(By.xpath("//a[@class='srch_action btn orange']")).click();
				Thread.sleep(2000);
				
				d.findElement(By.xpath("//h2[text()='iTel P55 + 4G (4 GB RAM, 128 GB Storage, Aurora Blue)']")).click();
				
				
				
				
}
	
}
