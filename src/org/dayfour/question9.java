package org.dayfour;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class question9 {
public static void main(String[] args) {
		
		WebDriver d=new ChromeDriver();
				
				d.get("https://www.snapdeal.com/");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.name("keyword")).sendKeys("joystick");
				
				d.findElement(By.xpath("//span[text()='Search']")).click();
				
				d.findElement(By.xpath("//img[@class='product-image ']")).click();
				
}
	

}
