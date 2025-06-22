package org.dayfive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class question3 {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver d=new ChromeDriver();
				
				d.get("http://www.flipkart.com");
				
				d.manage().window().maximize();
				
				d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				
				
				WebElement hover = d.findElement(By.xpath("//span[text()='Home & Furniture']"));
				
				
				Actions a=new Actions(d);
				a.moveToElement(hover).perform();
				
				WebElement hh = d.findElement(By.xpath("//a[text()='Bedroom Furniture']"));

				
				
				a.moveToElement(hh).perform();
				
				d.findElement(By.xpath("(//a[text()='Office Chairs'])[2]")).click();
				
				WebElement oo = d.findElement(By.xpath("//a[text()='ASTRIDE Ergofit Ergonomic Chair High Back, Synchro Tilt...']"));
				System.out.println(oo.getText());
				
				
				
}
	

}
