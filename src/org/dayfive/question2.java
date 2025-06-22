package org.dayfive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class question2 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://www.amazon.in");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				d.findElement(By.xpath("//button[text()='Continue shopping']")).click();
				
			
				
				WebElement hover = d.findElement(By.xpath("//span[text()='Prime']"));
				
				
				
				Actions a=new Actions(d);
				
				a.moveToElement(hover).perform();
				
				
				d.findElement(By.xpath("//a[text()='Join Prime Now']")).click();
				
				
}
	

}
